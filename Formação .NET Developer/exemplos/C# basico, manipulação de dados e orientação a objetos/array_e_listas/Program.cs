System.Console.WriteLine("==================== Array ==================");

int[] arrayInt = new int[4];
arrayInt[0] = 12;
arrayInt[1] = 82;
arrayInt[2] = 52;
arrayInt[3] = 72;

// Aumenta o tamnaho do array
Array.Resize(ref arrayInt, arrayInt.Length * 2);

// Copia array
int[] arrayInt2 = new int[arrayInt.Length + 2];
Array.Copy(arrayInt, arrayInt2, arrayInt.Length);

System.Console.WriteLine("------ arrayInt2 Com for --------");
for (int i = 0; i < arrayInt2.Length; i++)
{
    System.Console.WriteLine($"O valor do índice {i} é {arrayInt2[i]}");
}

System.Console.WriteLine("------ Com for --------");
for (int i = 0; i < arrayInt.Length; i++)
{
    System.Console.WriteLine($"O valor do índice {i} é {arrayInt[i]}");
}

System.Console.WriteLine("------ Com foreach --------");
int cont = 0;
foreach (int item in arrayInt)
{
    System.Console.WriteLine($"O valor do índece {cont} é {item}");
    cont++;
}

System.Console.WriteLine("==================== List ==================");
List<string> listString = new List<string>();
listString.Add("BA");
listString.Add("SP");
listString.Add("PE");

System.Console.WriteLine("------ List com for --------");
for (int i = 0; i < listString.Count; i++)
{
    System.Console.WriteLine($"O valor do índice {i} é {listString[i]}");
}

listString.Add("PI");

System.Console.WriteLine("------ List com foreach --------");
int cont1 = 0;
foreach (string item in listString)
{
    System.Console.WriteLine($"O valor do índece {cont1} é {item}");
    cont1++;
}
