using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace dio.models
{
    public class Calculadora
    {
        public void Somar(int x, int y)
        {
            System.Console.WriteLine($"{x} + {y} = {x + y}");
        }
        public void Subtrair(int x, int y)
        {
            System.Console.WriteLine($"{x} - {y} = {x - y}");
        }
        public void Multiplicar(int x, int y)
        {
            System.Console.WriteLine($"{x} * {y} = {x * y}");
        }
        public void Dividir(int x, int y)
        {
            System.Console.WriteLine($"{x} / {y} = {x / y}");
        }
        public void Potencia(int x, int y)
        {
            double resultado = Math.Pow(x, y);
            System.Console.WriteLine($"{x}^{y} = {resultado}");
        }
        public void Seno(double angulo){
            double radiano = angulo * Math.PI / 180;
            double seno = Math.Sin(radiano);
            System.Console.WriteLine($"O seno de {angulo} é {Math.Round(seno, 4)}");
        }
        public void Coseno(double angulo){
            double radiano = angulo * Math.PI / 180;
            double coseno = Math.Cos(radiano);
            System.Console.WriteLine($"O coseno de {angulo} é {Math.Round(coseno, 4)}");
        }
        public void Tangente(double angulo){
            double radiano = angulo * Math.PI / 180;
            double tangente = Math.Tan(radiano);
            System.Console.WriteLine($"A tangente de {angulo} é {Math.Round(tangente, 4)}");
        }
         public void RaizQuadrada(double x){
            double raiz = Math.Sqrt(x);
            System.Console.WriteLine($"A raiz de {x} é {raiz}");
        }
    }
}