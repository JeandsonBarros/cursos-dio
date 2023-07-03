
using System.Globalization;

System.Console.WriteLine("================= Formatando valores ==============================");

//Alterando a localização do código
CultureInfo.DefaultThreadCurrentCulture = new CultureInfo("en-US");

decimal valoresMonetario = 82.40M;

//Mostrar formato da moeda em que esta o computador ou que foi definido
System.Console.WriteLine($"{valoresMonetario:C}");

//Alterando a localização da cultura individualmente
System.Console.WriteLine(valoresMonetario.ToString("C", CultureInfo.CreateSpecificCulture("pt-BR")));

//Formatação personalizada, C6 e N2 é quantidade de casas decimais
System.Console.WriteLine(valoresMonetario.ToString("C6"));
System.Console.WriteLine(valoresMonetario.ToString("N2"));

//Representando porcentagem
System.Console.WriteLine(valoresMonetario.ToString("P"));

// Formato pesolizado
int digitos = 123456;
System.Console.WriteLine(digitos.ToString("##-##-##"));

//Formatando o tipo DateTime
DateTime dateTime = DateTime.Now;
System.Console.WriteLine(dateTime.ToString("dd/MM/yyyy HH:mm"));

//Formatando data e hora
System.Console.WriteLine(dateTime.ToShortTimeString());
System.Console.WriteLine(dateTime.ToShortDateString());
System.Console.WriteLine(dateTime.ToShortTimeString());

DateTime dateTime2 = DateTime.Parse("01/04/2023 23:50");
System.Console.WriteLine(dateTime2);

//Datetime com TryParse
string dateString = "2022-14-17";
bool sucesso = DateTime.TryParseExact(dateString, "yyyy-MM-dd", CultureInfo.InvariantCulture, DateTimeStyles.None, out DateTime date);
System.Console.WriteLine(sucesso ? "Converteu" : "Não converteu");
System.Console.WriteLine(date);
















System.Console.WriteLine("===============================================");