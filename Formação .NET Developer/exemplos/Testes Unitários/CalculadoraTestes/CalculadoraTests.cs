using Calculadora.Models;

namespace CalculadoraTestes;

public class CalculadoraTests
{

   private CalculadoraImp _calc;

   public CalculadoraTests()
   {
      _calc = new CalculadoraImp();
   }

   [Fact]
   public void DeveSomar10Com5ERetornar15()
   {
      //Arrange
      int num1 = 5;
      int num2 = 10;

      //Act 
      int resultado = _calc.Soma(num1, num2);

      //Assert
      Assert.Equal(15, resultado);
   }

   [Fact]
   public void DeveSomar10Com10ERetornar120()
   {
      //Arrange
      int num1 = 10;
      int num2 = 10;

      //Act 
      int resultado = _calc.Soma(num1, num2);

      //Assert
      Assert.Equal(20, resultado);
   }

   [Fact]
   public void DeveVerificarSe4EParERtornarVerdadeiro()
   {
      //Arrange
      int num = 4;

      //Act 
      bool resultado = _calc.EhPar(num);

      //Assert
      Assert.True(resultado);
   }

   /* [Theory]
   [InlineData(2)]
   [InlineData(4)]
   [InlineData(6)]
   [InlineData(8)]
   [InlineData(10)]
   public void DeveVerificarSeOsNumerosSaoParesERetornarVerdadeiro(int value){
      //Act 
      bool resultado = _calc.EhPar(value);

      //Assert
      Assert.True(resultado);
   } */

   [Theory]
   [InlineData(new int[] { 2, 4 })]
   [InlineData(new int[] { 6, 8, 10 })]
   public void DeveVerificarSeOsNumerosSaoParesERetornarVerdadeiro(int[] values)
   {
      //Act / Assert
      Assert.All(values, value => Assert.True(_calc.EhPar(value)));
   }


}