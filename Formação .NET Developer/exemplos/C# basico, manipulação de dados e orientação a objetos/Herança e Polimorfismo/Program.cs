using Models;

//Exemplo que usa o polimofismo(override) e herança
Aluno aluno1 = new Aluno();
aluno1.Nome ="Jeu";
aluno1.Idade = 25;
aluno1.Nota = 10;
aluno1.Apresentar();

//Exemplo que usa herança
Professor professor1 = new Professor();
professor1.Nome ="Zoro";
professor1.Idade = 25;
professor1.Salario = 500;
professor1.Apresentar();
