using Interfaces;
using Models;

System.Console.WriteLine("\n--- Exemplo que usa o polimofismo(override), herança e construtor herdado ---");
Aluno aluno1 = new Aluno("Jeu", 25);
aluno1.Nota = 10;
aluno1.Apresentar();

System.Console.WriteLine("\n--- Exemplo que usa herança e construtor herdado ---");
Professor professor1 = new Professor("Zoro", 27);
professor1.Salario = 500;
professor1.Apresentar();

System.Console.WriteLine("\n--- Exemplo que usa abstract ---");
ContaCorrente contaCorrente = new ContaCorrente();
contaCorrente.Creditar(500);
contaCorrente.ExibirSaldo();

System.Console.WriteLine("\n--- Classe object na prática ---");
/* 
 Oferece suporte a todas as classes na hierarquia de classes .NET
 e fornece serviços de baixo nível para classes derivadas. 
 Esta é a classe base final de todas as classes .
 NET; é a raiz da hierarquia de tipos.
 */
Computador computador = new Computador();
System.Console.WriteLine(computador.ToString());

System.Console.WriteLine("\n--- Interface na prática ---");
/* Uma interface define um contrato. 
Qualquer class um ou struct que implemente esse contrato deve fornecer
uma implementação dos membros definidos na interface.  
*/
ICalculadora calculadora = new Calculadora();
System.Console.WriteLine(calculadora.Dividir(14,2));

