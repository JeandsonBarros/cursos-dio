using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace exceções_e_coleções.models
{
    public class ExemploException
    {
        public void Metodo1()
        {
            Metodo2();
        }
        public void Metodo2()
        {
            try
            {
                Metodo3();
            }
            catch (System.Exception ex)
            {
                System.Console.WriteLine(ex.Message);
            }
        }
        public void Metodo3()
        {
            throw new Exception("Error");
        }
    }
}