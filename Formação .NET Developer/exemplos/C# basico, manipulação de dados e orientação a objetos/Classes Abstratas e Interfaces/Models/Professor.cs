using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Models
{
    //Sealed: Quando aplicado a uma classe, o modificador sealed impede que outras classes herdem dela.
    //public sealed class Professor : Pessoa
    public class Professor : Pessoa
    {
        public Professor(string nome, int idade) : base(nome, idade)
        {

        }
        public decimal Salario { get; set; }

        //sealed també pode ser usado para impedir que uma classe filha sobrescreva um método
        //public sealed override void Apresentar()
        public override void Apresentar()
        {
            System.Console.WriteLine($"Olá, meu nome é {Nome}, tenho {Idade} anos e minha nota é {Salario}");
        }
    }
}