using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace nuget_serializar_e_atributos.models
{
    public class LeituraArquivo
    {
        public (bool Sucesso, string[] Linha, int QuantidadeLinhas) LerArquivo(string caminho)
        {
            try
            {
                string[] linhas = File.ReadAllLines(caminho);
                return (true, linhas, linhas.Length);
            }
            catch (System.Exception)
            {
                return (false, new string[0], 0);
            }

        }
    }
}