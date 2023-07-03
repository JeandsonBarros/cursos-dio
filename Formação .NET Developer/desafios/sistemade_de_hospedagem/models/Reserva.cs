using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Models;

namespace Models
{
    public class Reserva
    {
        public Reserva()
        {

        }
        public Reserva(int diasReservados)
        {
            DiasReservados = diasReservados;
        }

        public List<Pessoa> Hospedes { get; set; }

        public Suite Suite { get; set; }
        public int DiasReservados { get; set; }

        public void CadastrarHospedes(List<Pessoa> hospedes)
        {
           
            if (hospedes.Count > Suite.Capacidade)
            {
                System.Console.WriteLine($"Foi informado {hospedes.Count} clientes, porem a suíte só tem capacidade de {Suite.Capacidade}.");
            }
            else
            {
                Hospedes = hospedes;
            }
        }

        public void CadastrarSuite(Suite suite)
        {
            Suite = suite;
        }

        public decimal ValorTotalAPagar()
        {

            decimal valorAPagar = DiasReservados * Suite.ValorDiaria;
            if (DiasReservados >= 10)
            {
                valorAPagar = valorAPagar - (valorAPagar * 0.10M);
            }

            return valorAPagar;

        }

        public int ObterQuantidadeHospedes()
        {
            return Hospedes.Count;
        }
    }
}