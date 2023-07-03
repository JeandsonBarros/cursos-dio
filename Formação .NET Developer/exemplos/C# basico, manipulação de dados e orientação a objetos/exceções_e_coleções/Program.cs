using exceções_e_coleções.models;

System.Console.WriteLine();

System.Console.WriteLine("\n============================ Exceções ==========================");

// Realizando a leitura de um arquivo
try
{
    string[] linhas = File.ReadAllLines("ArquivosUploads/texto.txt");

    foreach (string linha in linhas)
    {
        Console.WriteLine(linha);
    }
}
catch (DirectoryNotFoundException ex)
{
    System.Console.WriteLine("\nDiretório não encontrado :" + ex.Message);
}
catch (FileNotFoundException ex)
{
    System.Console.WriteLine("\nAquirvo não encontrado :" + ex.Message);
}
catch (Exception ex)
{
    Console.WriteLine("\nOcorreu uma exceção genérica: " + ex.Message);
}
finally
{
    System.Console.WriteLine("Chegou até aqui.");
}

//Usando throw
ExemploException exemploException = new ExemploException();
exemploException.Metodo1();

System.Console.WriteLine("\n============================ Coleções ==========================");

System.Console.WriteLine("--------------- FILA --------------");

//FILA: Queue representa uma coleção primeiro a entrar, primeiro a sair.
Queue<int> fila = new Queue<int>();

fila.Enqueue(1);
fila.Enqueue(2);
fila.Enqueue(3);
fila.Enqueue(4);

foreach(int item in fila){
    System.Console.WriteLine(item);
}

System.Console.WriteLine($"Removendo o primero item que entrou na fila: {fila.Dequeue()}");

foreach(int item in fila){
    System.Console.WriteLine(item);
}

System.Console.WriteLine("---------- PILHA ---------------");

//PILHA: Stack é um tipo especial de coleção que armazena elementos no estilo LIFO (Last In First Out). 
Stack<int> pilha = new Stack<int>();

pilha.Push(1);
pilha.Push(2);
pilha.Push(3);
pilha.Push(4);

foreach(int item in pilha){
    System.Console.WriteLine(item);
}

System.Console.WriteLine($"Removendo o elemento do topo: {pilha.Pop()}");

foreach(int item in pilha){
    System.Console.WriteLine(item);
}

System.Console.WriteLine("---------- Dictionary ---------------");

//Dictionary representa uma coleção de chaves e valores.
Dictionary<string, string> estados = new Dictionary<string, string>();

estados.Add("SP", "São Paulo");
estados.Add("BA", "Bahia");
estados.Add("PE", "Pernambuco");
estados.Add("PI", "Piauí");

foreach (var estado in estados)
{
    System.Console.WriteLine($"Chave: {estado.Key}, {estado.Value}");
}

System.Console.WriteLine("-------------------------");

estados.Remove("PI");

foreach (var estado in estados)
{
    System.Console.WriteLine($"Chave: {estado.Key}, {estado.Value}");
}

System.Console.WriteLine("-------------------------");

estados["SP"] = "São paulo - valor alterado";

foreach (var estado in estados)
{
    System.Console.WriteLine($"Chave: {estado.Key}, {estado.Value}");
}

System.Console.WriteLine("-------------------------");

string chave = "BA";
if (estados.ContainsKey(chave))
{
    System.Console.WriteLine($"Valor existente: {chave}");
}
else
{
System.Console.WriteLine($"Chave não existente, é seguro adicionar chave: {chave}");
}

System.Console.WriteLine("-------------------------");

System.Console.WriteLine(estados["BA"]);

System.Console.WriteLine("-------------------------");

try
{
    estados.Add("PE", "Ceará");
}
catch (ArgumentException)
{
    Console.WriteLine("Já existe um elemento com Key = \"PE\".");
}












