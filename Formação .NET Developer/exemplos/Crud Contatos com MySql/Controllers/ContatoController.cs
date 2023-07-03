using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Agenda.Context;
using Microsoft.AspNetCore.Mvc;
using Models;
using Services;

namespace Controllers
{
    [ApiController]
    [Route("api/contato")]
    public class ContatoController : ControllerBase
    {
        private readonly AgendaContext _context;
        private readonly ContatoService _contatoService;

        public ContatoController(AgendaContext agendaContext,  ContatoService contatoService)
        {
            _context = agendaContext;
            _contatoService = contatoService;
        }

        [HttpGet()]
        public IActionResult ObterTodos()
        {
            var contatos = _context.Contatos;
            return Ok(contatos);
        }

        [HttpGet("ObterPorNome")]
        public IActionResult ObterPorNome(string nome)
        {
            var contatos = _context.Contatos.Where(contato => contato.Nome.Contains(nome));
            return Ok(contatos);
        }

        [HttpPost]
        public IActionResult Create(Contato contato)
        {
            _context.Add(contato);
            _context.SaveChanges();
            return CreatedAtAction(nameof(ObterPorId), new { id = contato.Id }, contato);
        }

        [HttpGet("{id}")]
        public IActionResult ObterPorId(int id)
        {_contatoService.Teste(id);
            var contato = _context.Contatos.Find(id);

            if (contato == null)
            {
                return NotFound();
            }

            return Ok(contato);
        }

        [HttpPut("{id}")]
        public IActionResult Atualizar(int id, Contato contato)
        {
            var contatoBanco = _context.Contatos.Find(id);

            if (contatoBanco == null)
            {
                return NotFound();
            }

            contatoBanco.Ativo = contato.Ativo;
            contatoBanco.Nome = contato.Nome;
            contatoBanco.Telefone = contato.Telefone;

            _context.Contatos.Update(contatoBanco);
            _context.SaveChanges();

            return Ok(contatoBanco);

        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            var contatoBanco = _context.Contatos.Find(id);

            if (contatoBanco == null)
            {
                return NotFound();
            }

            _context.Contatos.Remove(contatoBanco);

            return NoContent();

        }

    }
}