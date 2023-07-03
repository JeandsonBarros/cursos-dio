using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Agenda.Context;

namespace Services
{
    public class ContatoService
    {
        private AgendaContext _context;
        public ContatoService(AgendaContext context){
            _context = context;
        }

        public void Teste(int id){
            var contato = _context.Contatos.Find(id);
            System.Console.WriteLine("=======================================");
            System.Console.WriteLine(contato.Nome);
            System.Console.WriteLine("=======================================");
        }

    }
}