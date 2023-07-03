using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace dio.models
{
    public class Pessoa
    {
        public string? Nome { get; set; }
        public int Idade { get; set; }

        public void mensagem(){
            System.Console.WriteLine($"Seu nome é {Nome}, e sua idade é {Idade}");
        }

    }
}