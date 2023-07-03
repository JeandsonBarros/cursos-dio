using propriedades_metodos_e_construtores.models;

System.Console.WriteLine("\n=============================================");

Pessoa p1 = new Pessoa();
p1.Nome = "Jeu";
p1.Sobrenome = "Barros";

/* Usando construtor */
Pessoa p2 = new Pessoa(nome: "Ronoa", sobrenome: "Zoro");

/* Usando construtor */
Pessoa p3 = new Pessoa("Fulano", "Sei lá");

Curso curso = new Curso();
curso.Alunos = new List<Pessoa>();
curso.AdicionarAluno(p1);
curso.AdicionarAluno(p2);
curso.AdicionarAluno(p3);
curso.ListarAlunos();

System.Console.WriteLine("=============================================\n");