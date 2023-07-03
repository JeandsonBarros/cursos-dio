using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Models
{
    public class MeuArray<T>
    {
        private static int capacidade = 10;
        private int contador;
        private T[] array = new T[capacidade];

        public void AdicionarItemArray(T item){
            if(contador < 11){
                array[contador] = item;
                contador++;
            }else{
                System.Console.WriteLine("Array já tem 10 items");
            }
        }

        public T this[int index]{
            get => array[index];
            set { array[index] = value; }
        }

    }
}