using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace comentarios_e_boas_praticas.models
{
    /// <summary>
    /// Representa uma pessoa
    /// </summary>
    public class Pessoa
    {
        public string Nome { get; set; }
        public int Idade { get; set; }

        /// <summary>
        /// Mostra uma mensagem da pessoa
        /// </summary>
        /// <param name="maisTexto">Texto para concatenar na mensagem</param>
        /// <returns>Retorna uma string concatenada</returns>
        public string Menssagem(string maisTexto)
        {
            System.Console.WriteLine("Essa é uma pessoa, "+maisTexto);
            return "Essa é uma pessoa, "+maisTexto;
        }

    }
}