using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Calculadora.Models;

namespace CalculadoraTestes
{
    public class ValidacoesStringTests
    {
        private ValidacoesString _validacoesString;

        public ValidacoesStringTests()
        {
            _validacoesString = new ValidacoesString();
        }

        [Fact]
        public void DeveConta3CaracteresEmOlaERetonar3()
        {
            //Arrange
            string texto = "Ola";
            
            //Act 
            int resultado = _validacoesString.ValidaString(texto);

            //Assert
            Assert.Equal(3, resultado);
        }
    }
}