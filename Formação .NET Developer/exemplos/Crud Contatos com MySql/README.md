- Ferramentas principais do Entity Framework para a interface de linha de comando .NET. Precisa instalar apenas uma vez na maquína.
`dotnet tool install --global dotnet-ef`

- Componentes de tempo de design compartilhados para ferramentas Entity Framework Core.
`dotnet add package Microsoft.EntityFrameworkCore.Design`

-- Pomelo.EntityFrameworkCore.MySql é o provedor Entity Framework Core (EF Core) para MySQL, MariaDB, Amazon Aurora, banco de dados Azure para MySQL e outros bancos de dados compatíveis com MySQL.
`dotnet add package Pomelo.EntityFrameworkCore.MySql`

- Criar uma migração, ou seja, prepara o esquema para o banco de dados
`dotnet-ef migrations add CriacaoTabelaContato`

-- Execulta a migração criadando o banco de dados e as tabelas
`dotnet ef database update`

