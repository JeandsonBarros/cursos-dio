using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace nuget_serializar_e_atributos.models
{
    public class Estado
    {
        [JsonProperty("Nome_do_estado")]
        public string Nome { get; set; }
        public string Sigla { get; set;}
        public long QuantidadeDeAbitantes { get; set; }

        public Estado(){
            
        }  

        public Estado(string nome, string sigla, int quantidadeDeAbitantes){
            Nome = nome;
            Sigla = sigla;
            QuantidadeDeAbitantes=quantidadeDeAbitantes;
        }

        public void MostrarDados(){
            System.Console.WriteLine($"Nome: {Nome}, Sigla: {Sigla}, QuantidadeDeAbitantes: {QuantidadeDeAbitantes}");
        }

    }
}