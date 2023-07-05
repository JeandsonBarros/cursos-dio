using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Calculadora.Models
{
    public class CalculadoraImp
    {
        public int Soma(int x, int y)
        {
            Console.WriteLine($"{x} + {y} = {x + y}");
            return x + y;
        }
        public int Subritair(int x, int y)
        {
            Console.WriteLine($"{x} - {y} = {x - y}");
            return x - y;
        }
        public int Dividir(int x, int y)
        {
            Console.WriteLine($"{x} / {y} = {x / y}");
            return x / y;
        }
        public int Multiplicar(int x, int y)
        {
            Console.WriteLine($"{x} x {y} = {x * y}");
            return x * y;
        }
        public bool EhPar(int num)
        {
            return num % 2 == 0;
        }
    }
}