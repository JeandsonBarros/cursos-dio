using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Models;

namespace Models
{


    public class Suite
    {

        public Suite()
        {

        }

        public Suite(int numeroSuite, int capacidade, string tipo, decimal valorDiaria)
        {
            NumeroSuite = numeroSuite;
            Capacidade = capacidade;
            Tipo = tipo;
            ValorDiaria = valorDiaria;
        }

        public int NumeroSuite { get; set; }
        public int Capacidade { get; set; }
        public string Tipo { get; set; }
        public decimal ValorDiaria { get; set; }
    
    }
}