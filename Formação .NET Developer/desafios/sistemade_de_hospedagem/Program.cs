using Models;

List<Pessoa> hospedes = new List<Pessoa>();
hospedes.Add(new Pessoa("Jeu", "Barros"));
hospedes.Add(new Pessoa("Zoro", "Ronoa"));
hospedes.Add(new Pessoa("Madara", "Uchiha"));

Suite suiteMaster = new Suite(tipo: "Master", numeroSuite: 1, capacidade: 3, valorDiaria: 599.20M);
Suite suitePadrao = new Suite(tipo: "Padão", numeroSuite: 2, capacidade: 4, valorDiaria: 199.20M);

Reserva reserva1 = new Reserva(11);
reserva1.CadastrarSuite(suiteMaster);
reserva1.Hospedes = hospedes;
System.Console.WriteLine($"Valor para pagar: {reserva1.ValorTotalAPagar():C}");

Reserva reserva2 = new Reserva(8);
reserva2.CadastrarSuite(suiteMaster);
reserva2.Hospedes = hospedes;
System.Console.WriteLine($"Valor para pagar: {reserva2.ValorTotalAPagar():C}");
