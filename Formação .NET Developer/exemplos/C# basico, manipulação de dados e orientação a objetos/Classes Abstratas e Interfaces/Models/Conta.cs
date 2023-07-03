using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Models
{
    public abstract class Conta
    {
        protected decimal saldo;
        public int Numero { get; set; }

        public abstract void Creditar(decimal valor);

        public void ExibirSaldo(){
            System.Console.WriteLine($"Seu saldo é: {saldo}");
        }
    }
}