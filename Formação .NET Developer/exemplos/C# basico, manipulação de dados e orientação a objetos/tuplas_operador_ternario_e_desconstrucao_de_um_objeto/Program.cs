using tuplas_operador_ternário_e_desconstrução_de_um_objeto.models;

Console.WriteLine("\n=========== Tuplas ===========");
System.Console.WriteLine("--------- Ciração de tuplas -----------");

(int, string, string, decimal) tuplaPessoa0 = (1, "Jeu", "Barros", 1.60M);

System.Console.WriteLine("\nId: " + tuplaPessoa0.Item1);
System.Console.WriteLine("Nome: " + tuplaPessoa0.Item2);
System.Console.WriteLine("Sobrenome: " + tuplaPessoa0.Item3);
System.Console.WriteLine("Altura: " + tuplaPessoa0.Item4);

(int Id, string Nome, string Sobrenome, decimal Altura) tuplaPessoa1 = (1, "Jeu", "Barros", 1.60M);

System.Console.WriteLine("\nId: " + tuplaPessoa1.Id);
System.Console.WriteLine("Nome: " + tuplaPessoa1.Nome);
System.Console.WriteLine("Sobrenome: " + tuplaPessoa1.Sobrenome);
System.Console.WriteLine("Altura: " + tuplaPessoa1.Altura);

ValueTuple<int, string, string, decimal> tuplaPessoa2 = (2, "Ronoa", "Zoro", 2.10M);

System.Console.WriteLine("\nId: " + tuplaPessoa2.Item1);
System.Console.WriteLine("Nome: " + tuplaPessoa2.Item2);
System.Console.WriteLine("Sobrenome: " + tuplaPessoa2.Item3);
System.Console.WriteLine("Altura: " + tuplaPessoa2.Item4);

var tuplaPessoa3 = Tuple.Create(3, "Fulano", "Sei lá", 1.10M);

System.Console.WriteLine("\nId: " + tuplaPessoa3.Item1);
System.Console.WriteLine("Nome: " + tuplaPessoa3.Item2);
System.Console.WriteLine("Sobrenome: " + tuplaPessoa3.Item3);
System.Console.WriteLine("Altura: " + tuplaPessoa3.Item4);

System.Console.WriteLine("\n--------- Tupla em metodos -----------");

LeituraArquivo leituraArquivo = new LeituraArquivo();
var (sucesso, linhas, quantidadeLinhas) = leituraArquivo.LerArquivo("Arquivos/texto.txt");

//Descarte de uma informação
// var (sucesso, linhas, _) = leituraArquivo.LerArquivo("Arquivos/texto.txt");

if (sucesso)
{
    System.Console.WriteLine($"Quantidade de linhas: {quantidadeLinhas}");
    foreach (string linha in linhas)
    {
        System.Console.WriteLine(linha);
    }
}
else
{
    System.Console.WriteLine("Não foi possível ler arquivo");
}

System.Console.WriteLine("\n=============== Desconstrutor (Deconstruct) ==================");

Pessoa pessoa = new Pessoa("Jeu", "Barros");
pessoa.Apresentar();

(string nome, string sobrenome) = pessoa;
System.Console.WriteLine($"{nome} {sobrenome}");

System.Console.WriteLine("\n=============== IF Ternário ==================");

int numero = 14;
bool ehPar = false;

ehPar = numero % 2 == 0;

System.Console.WriteLine($"O número {numero} é " + (ehPar ? "par" : "ímpa"));