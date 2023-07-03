using nuget_serializar_e_atributos.models;
using Newtonsoft.Json;

System.Console.WriteLine();

System.Console.WriteLine("------------ Serialize JSON ----------------");
Pessoa pessoa1 = new Pessoa("Jeu", "Barros", 25);
pessoa1.Apresentar();

string jsonPessoa1 = JsonConvert.SerializeObject(pessoa1, Formatting.Indented);
System.Console.WriteLine(jsonPessoa1);

System.Console.WriteLine("\n------------ Deserialize JSON ----------------");

try
{
    string estadosJson = File.ReadAllText("Arquivos/estados.json");
    List<Estado> estados = JsonConvert.DeserializeObject<List<Estado>>(estadosJson);
    
    foreach (Estado estado in estados)
    {
        estado.MostrarDados();
    }

}
catch (System.Exception ex)
{
    System.Console.WriteLine(ex.Message);
}

System.Console.WriteLine("\n------------  Serializando uma coleção ----------------");
List<Pessoa> pessoas = new List<Pessoa>();
pessoas.Add(pessoa1);
pessoas.Add(new Pessoa("Jeandson", "Barros", 25));
pessoas.Add(new Pessoa("Zoro", "Ronoa", 27));
pessoas.Add(new Pessoa("Madara", "Uschiha", 131));

string jsonPessoas = JsonConvert.SerializeObject(pessoas, Formatting.Indented);
System.Console.WriteLine(jsonPessoas);
