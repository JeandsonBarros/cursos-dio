--===== Constraints ======

ALTER TABLE Produtos ADD UNIQUE(Nome)
INSERT INTO Produtos VALUES ('Mountain Bike Socks. M',  'Branco', 9.50,  'M', 'U', '2023-07-01 20:44:36.9600000')

ALTER TABLE Produtos ADD CONSTRAINT CHK_ColunaGenero CHECK(Genero = 'M' OR Genero = 'F' OR Genero = 'U')
INSERT INTO Produtos VALUES ('Mountain Bike Socks. M 2',  'Branco', 9.50,  'M', 'Z', '2023-07-01 20:44:36.9600000')

ALTER TABLE Produtos ADD DEFAULT GETDATE() for DataCadastro
INSERT INTO Produtos ( Nome, Cor, Preco, Tamanho, Genero ) VALUES ('Mountain Bike Socks. M 2',  'Branco', 9.50,  'M', 'U')
SELECT * FROM Produtos WHERE Nome = 'Mountain Bike Socks. M 2'

ALTER TABLE Produtos DROP CONSTRAINT UQ__Produtos__7D8FE3B26B78E305
INSERT INTO Produtos VALUES ('Mountain Bike Socks. M 4',  'Branco', 9.50,  'M', 'U', '2023-07-01 20:44:36.9600000')
SELECT * FROM Produtos WHERE Nome = 'Mountain Bike Socks. M'

--=====  Stored Procedure ======

CREATE PROCEDURE InserirNovoProduto
@Nome varchar(255),
@Cor varchar(50),
@Preco decimal,
@Tamanho varchar(5),
@Genero char(1)
AS
INSERT INTO Produtos ( Nome, Cor, Preco, Tamanho, Genero ) 
VALUES (@Nome,  @Cor, @Preco, @Tamanho, @Genero)

EXEC InserirNovoProduto 'Mountain Bike Socks. M 7',  'Branco', 9.50,  'M', 'U'

SELECT * FROM Produtos WHERE Nome = 'Mountain Bike Socks. M 7'

-------------------

CREATE PROCEDURE ObterProdutosPorTamanho @TamanhoProduto VARCHAR(5)
AS
SELECT * FROM Produtos WHERE Tamanho = @TamanhoProduto

EXEC ObterProdutosPorTamanho 'M'

------------------

CREATE PROCEDURE ObterTodosOsProdutos
AS
SELECT * FROM Produtos

EXEC ObterTodosOsProdutos

--=====  Functions ======

SELECT Nome, Preco, FORMAT(Preco - Preco / 100*10, 'N2') PrecoComDesconto FROM Produtos WHERE Tamanho = 'M'

CREATE FUNCTION CalcularDesconto(@Preco DECIMAL(13,2), @Porcentagem INT)
RETURNS DECIMAL
BEGIN
	RETURN @Preco - @Preco / @Porcentagem
END

SELECT Nome, Preco, FORMAT(dbo.CalcularDesconto(Preco, 10), 'N2') PrecoComDesconto FROM Produtos WHERE Tamanho = 'M'


