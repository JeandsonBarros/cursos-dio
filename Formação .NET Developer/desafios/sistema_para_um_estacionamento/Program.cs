List<string> veiculos = new List<string>();

System.Console.Write("Informe o valor inicial:");
decimal valorInicial = Convert.ToDecimal(Console.ReadLine());

System.Console.Write("Informe o valor por hora:");
decimal valorPorHora = Convert.ToDecimal(Console.ReadLine());

bool menuVisivel = true;
string opcao = "";

while (menuVisivel)
{

    System.Console.WriteLine("\n1-Cadastrar veículo");
    System.Console.WriteLine("2-Listar veículos");
    System.Console.WriteLine("3-Remover veículo");
    System.Console.WriteLine("4-Encerrar");
    System.Console.Write("Opção:");
    opcao = Console.ReadLine();

    switch (opcao)
    {
        case "1":
            System.Console.Write("\nInforme a placa do veículo:");
            veiculos.Add(Console.ReadLine().ToUpper());
            break;

        case "2":
            System.Console.WriteLine("\nLista de veículos:");
            for (int i = 0; i < veiculos.Count; i++)
            {
                System.Console.WriteLine($"{i + 1}º veículo: {veiculos[i]}");
            }
            break;

        case "3":
            System.Console.Write("\nInforme a placa do veículo:");
            string placa = Console.ReadLine().ToUpper();

            if (veiculos.Any(veiculo => veiculo == placa))
            {
                Console.Write("\nDigite a quantidade de horas que o veículo permaneceu estacionado:");
                veiculos.Remove(placa);

                int horas = Convert.ToInt32(System.Console.ReadLine());

                decimal valorTotal = valorPorHora * horas + valorInicial;

                Console.WriteLine($"\nO veículo {placa} foi removido e o preço total foi de: R$ {valorTotal}");

            }
            else
            {
                System.Console.WriteLine("\nVeículo não encontrado");
            }

            break;

        case "4":
            menuVisivel = false;
            break;

        default:
            System.Console.WriteLine("\nOpção invalida:");
            break;
    }

}
