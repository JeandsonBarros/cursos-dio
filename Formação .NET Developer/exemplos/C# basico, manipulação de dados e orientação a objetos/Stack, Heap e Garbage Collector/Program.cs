using Models;

System.Console.WriteLine("\n------------- Atribuindo tipo de referências -------------");

Pessoa p1 = new Pessoa("Jeu", "Barros");

// O que é atrubuido é a referencia na memória e não o valor
Pessoa p2 = p1;
p2.Nome = "Jeandson";

System.Console.WriteLine($"Nome da pessoa p1: {p1.Nome}");
System.Console.WriteLine($"Nome da pessoa p2: {p2.Nome}");

/* 
Out:
------------- Atribuindo tipo de referência -------------
Nome da pessoa p1: JEANDSON
Nome da pessoa p1: JEANDSON
 */

