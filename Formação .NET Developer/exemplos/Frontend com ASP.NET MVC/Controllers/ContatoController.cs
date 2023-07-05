using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Agenda.Context;
using Microsoft.AspNetCore.Mvc;
using Models;

namespace Frontend_com_ASP.NET_MVC.Controllers
{
    public class ContatoController : Controller
    {

        private readonly AgendaContext _agendaContext;

        public ContatoController(AgendaContext context)
        {
            _agendaContext = context;
        }

        public IActionResult Index()
        {
            var contatos = _agendaContext.Contatos.ToList();
            return View(contatos);
        }

        /* [HttpGet("Criar")] */
        public IActionResult Criar()
        {
            /*Também pode ser: return View("Views/Contato/FormContato.cshtml"); */
            /*Também pode ser: return View("../Contato/FormContato"); */
            return View("./FormContato");
        }

        /* [HttpPost("Criar")] */
        [HttpPost]
        public IActionResult Criar(Contato contato)
        {
            if (ModelState.IsValid)
            {
                _agendaContext.Contatos.Add(contato);
                _agendaContext.SaveChanges();
                return RedirectToAction("Index");
            }

            return View("./FormContato", contato);
        }

        /* [HttpGet("Atualizar/{id}")] */
        public IActionResult Atualizar(int id)
        {
            var contato = _agendaContext.Contatos.Find(id);

            if (contato == null)
            {
                return RedirectToAction(nameof(Index));
            }

            return View("./FormContato", contato);
        }

        /* [HttpPost("Atualizar")] */
        /* [HttpPost] */
        public IActionResult Atualizar(int id, Contato contato)
        {
            

            if (ModelState.IsValid)
            {
                _agendaContext.Contatos.Update(contato);
                _agendaContext.SaveChanges();
                return RedirectToAction(nameof(Index));
            }

            return View(contato);
        }

        /* [HttpGet("Detalhes/{id}")] */
        public IActionResult Detalhes(int id)
        {
            var contato = _agendaContext.Contatos.Find(id);

            if (contato == null)
            {
                return RedirectToAction(nameof(Index));
            }

            return View(contato);
        }

        /* [HttpGet("Deletar/{id}")] */
        public IActionResult Deletar(int id)
        {
            var contato = _agendaContext.Contatos.Find(id);

            if (contato == null)
            {
                return RedirectToAction(nameof(Index));
            }

            return View(contato);
        }

        /* [HttpPost("Deletar")] */
        [HttpPost]
        public IActionResult Deletar(Contato contato)
        {
            
            var contatoBanco = _agendaContext.Contatos.Find(contato.Id);
            if (contatoBanco == null)
            {
               return RedirectToAction(nameof(Index));
            }

            _agendaContext.Contatos.Remove(contatoBanco);
            _agendaContext.SaveChanges();

            return RedirectToAction(nameof(Index));
        }

    }
}