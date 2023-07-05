using System.Security.Cryptography;
using System.Text;
using Calculadora.Models;

var text = "Zorosola";

string md5DoBanco = ToMD5Hash.ToHash(text);

string md5InformadoPeloUser =  ToMD5Hash.ToHash(Console.ReadLine());

Console.WriteLine(md5DoBanco);
Console.WriteLine(md5InformadoPeloUser);

CalculadoraImp calculadora = new CalculadoraImp();

int x = 10;
int y = 5;

System.Console.WriteLine($"{x}+{y}={calculadora.Soma(x, y)}");
