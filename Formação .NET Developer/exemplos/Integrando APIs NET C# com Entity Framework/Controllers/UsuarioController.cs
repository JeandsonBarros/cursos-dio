using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace Integrando_APIs_NET_C__com_Entity_Framework.Controllers
{
    [ApiController]
    [Route("api/usuario")]
    public class UsuarioController : ControllerBase
    {
        [HttpGet("ObterDataHoraAtual")]
        public IActionResult ObterDataHora()
        {
            var objecto = new
            {
                ata = DateTime.Now.ToLongDateString(),
                hora = DateTime.Now.ToLongTimeString()
            };

            return Ok(objecto);
        }

        [HttpGet("Apresentar/{nome}")]
        public IActionResult Apresentar(string nome)
        {
            string messagem = $"Olá {nome}";
            return Ok(new { messagem });
        }
    }
}