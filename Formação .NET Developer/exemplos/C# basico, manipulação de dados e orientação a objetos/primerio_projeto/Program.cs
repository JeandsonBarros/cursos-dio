using dio.models;

try
{

    /* ----------------- Converter ------------------ */

    /* int a = int.Parse("a"); */
    /* int a = Convert.ToInt32(null); */

    /* int intValue = 5; */
    /* string a = intValue.ToString(); */
    /* string a = 5.ToString();*/

    /* int b = 4;
    double a = b; */

    /* Vai dar error pq long tem valor maior que o int pode suportar */
    /* long b = long.MaxValue;
    int a = Convert.ToInt32(b); */

    /* int b = int.MaxValue;
    long a = b; */

    /* string c = "14-"; */
    /* int a = 23; */
    /* int.TryParse(c, out int a);
    Console.WriteLine(c); 
    Console.WriteLine(a);*/

    /*  System.Console.WriteLine(" ==================== Class =====================");

     Pessoa pessoa1 = new Pessoa();
     pessoa1.Nome = "Jeu";
     pessoa1.Idade = 25;
     pessoa1.mensagem();

     System.Console.WriteLine("-----------------------------------------------");

     Calculadora calc = new Calculadora();
     calc.Somar(2, 6);
     calc.Subtrair(10, 4);
     calc.Multiplicar(4, 2);
     calc.Dividir(8, 2);
     calc.Potencia(3, 3);
     calc.Seno(30);
     calc.Coseno(30);
     calc.Tangente(30);
     calc.RaizQuadrada(9); */

    /*  System.Console.WriteLine("================= do while =================");

     int soma = 0, numero = 0;

     do
     {
         System.Console.WriteLine("Infome um número (0 para pagar): ");
         numero = Convert.ToInt32(Console.ReadLine());
     } while (numero != 0);

     System.Console.WriteLine($"Total de somas: {soma}"); */

    System.Console.WriteLine("================== Construindo um menu interativo ===================");

    int opcao = 0;
    bool exibirMenu = true;

    while (exibirMenu)
    {
        System.Console.WriteLine("Opções: ");
        System.Console.WriteLine("(1) Listas pessoas");
        System.Console.WriteLine("(2) Cadastrar pessoa");
        System.Console.WriteLine("(3) Atualizar pessoa");
        System.Console.WriteLine("(4) Remover pessoa");
        System.Console.WriteLine("(5) Encerrar");

        opcao = Convert.ToInt32(Console.ReadLine());

        switch (opcao)
        {
            case 1:
                System.Console.WriteLine("Você selecionou Listas pessoas");
                break;
            case 2:
                System.Console.WriteLine("Você selecionou Cadastrar pessoa");
                break;
            case 3:
                System.Console.WriteLine("Você selecionou Atualizar pessoa");
                break;
            case 4:
                System.Console.WriteLine("Você selecionou Remover pessoa");
                break;
            case 5:
                System.Console.WriteLine("Você selecionou Encerrar");
                /*  Environment.Exit(0); */
                exibirMenu = false;
                break;
            default:
                System.Console.WriteLine("Opção invalida");
                break;
        }

    }

    System.Console.WriteLine("Programa termina");

}
catch (Exception e)
{
    Console.WriteLine(e.Message);
}