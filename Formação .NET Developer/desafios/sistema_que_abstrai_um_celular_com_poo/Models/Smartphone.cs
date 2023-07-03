using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace DesafioPOO.Models
{
    public abstract class Smartphone
    {
        private string modelo;
        private string IMEI;
        private int memoria;
        public string Numero { get; set; }

        public Smartphone(string numero, string imei, int memoria, string modelo)
        {
            Numero = numero;
            this.memoria = memoria;
            this.IMEI = imei;
            this.modelo = modelo;
        }

        public string GetModelo(){
            return modelo;
        }

        public void Ligar()
        {
            Console.WriteLine("Ligando...");
        }

        public void ReceberLigacao()
        {
            Console.WriteLine("Recebendo ligação...");
        }

        public abstract void InstalarAplicativo(string nomeApp);
    }
}