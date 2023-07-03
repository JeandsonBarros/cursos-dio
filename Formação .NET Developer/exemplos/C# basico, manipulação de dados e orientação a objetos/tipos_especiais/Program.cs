using Models;
using Newtonsoft.Json;

System.Console.WriteLine("\n------------- Tipos nulos na prática -------------");

bool? desejaReceberEmail = null;

if (desejaReceberEmail.HasValue && desejaReceberEmail.Value)
{
    System.Console.WriteLine("O usuário optou por receber o email");
}
else
{
    System.Console.WriteLine("O usuário optou por não receber");
}

System.Console.WriteLine("\n--------------- Tipos nulos em propriedades ------------------");
string estadosJson = File.ReadAllText("Arquivos/estados.json");
List<Estado> estados = JsonConvert.DeserializeObject<List<Estado>>(estadosJson);

foreach (Estado estado in estados)
{
    System.Console.WriteLine("......................");
    estado.MostrarDados();
}

System.Console.WriteLine("\n------------------- Tipos anônimos --------------------");
var tiposAnonimo = new { Nome = "Jeu", Idade = 25 };

System.Console.WriteLine("Nome: " + tiposAnonimo.Nome);
System.Console.WriteLine("Idade: " + tiposAnonimo.Idade);

System.Console.WriteLine("\n--------------- Tipos anônimos em coleção ---------------------");
var listaAnonimo = estados.Select(estado=> new {estado.Nome, estado.Sigla});

foreach (var estado in listaAnonimo)
{
    System.Console.WriteLine($"Nome: {estado.Nome}, Sigla: {estado.Sigla}");
}

System.Console.WriteLine("\n-------------- Tipo dinâmico ----------------");
dynamic varialvelDinamica = 4;
System.Console.WriteLine($"Tipo da variável: {varialvelDinamica.GetType()}, Valor da variável: {varialvelDinamica}");

varialvelDinamica = "texto";
System.Console.WriteLine($"Tipo da variável: {varialvelDinamica.GetType()}, Valor da variável: {varialvelDinamica}");

varialvelDinamica = true;
System.Console.WriteLine($"Tipo da variável: {varialvelDinamica.GetType()}, Valor da variável: {varialvelDinamica}");

System.Console.WriteLine("\n----------------- Classe genérica ----------------");
MeuArray<int> arrayInteiro = new MeuArray<int>();
arrayInteiro.AdicionarItemArray(30);
System.Console.WriteLine(arrayInteiro[0]);

MeuArray<string> arrayString = new MeuArray<string>();
arrayString.AdicionarItemArray("string teste");
System.Console.WriteLine(arrayString[0]);

System.Console.WriteLine("\n------------------- Métodos de extensão ------------------");
int numero = 14;
bool ehPar = numero.EhPar();

System.Console.WriteLine($"O número {numero} é " + (ehPar ? "par" : "ímpa"));