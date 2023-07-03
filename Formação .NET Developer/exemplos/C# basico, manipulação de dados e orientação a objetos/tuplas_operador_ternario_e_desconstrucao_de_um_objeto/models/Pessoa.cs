using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace tuplas_operador_ternário_e_desconstrução_de_um_objeto.models
{
    public class Pessoa
    {

        public Pessoa()
        {

        }

        public Pessoa(string nome, string sobrenome)
        {
            Nome = nome;
            Sobrenome = sobrenome;
        }

        public void Deconstruct(out string nome, out string sobrenome){
            nome = Nome;
            sobrenome = Sobrenome;
        }

        private string _nome;
        public string Nome
        {
            get => _nome.ToUpper();
            set
            {
                if (value == "")
                {
                    throw new ArgumentException("O nome não pode ser vazio");
                }
                _nome = value;
            }
        }

        public string Sobrenome { get; set; }
        public string NomeCompleto { get => $"{Nome} {Sobrenome}".ToUpper(); }

        private int _idade;
        public int Idade
        {
            get => _idade;

            set
            {
                if (value < 0)
                {
                    throw new ArgumentException("Idade não pode ser menor que 0");
                }

                _idade = value;
            }
        }

        public void Apresentar()
        {
            System.Console.WriteLine($"Nome: {NomeCompleto}, Idade: {Idade} ");
        }

    }
}