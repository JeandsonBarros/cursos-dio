using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Models
{
    public class Diretor : Professor
    {
        public Diretor(string nome, int idade) : base(nome, idade)
        {
        }

        public override void Apresentar()
        {
            System.Console.WriteLine($"Olá, meu nome é {Nome}, tenho {Idade} anos e minha nota é {Salario}");
        }
    }
}