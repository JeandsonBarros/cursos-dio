SELECT * FROM Produtos

SELECT Tamanho, Cor FROM Produtos

SELECT COUNT(*)  FROM Produtos

SELECT COUNT(*) QuantidadeTamanhoM FROM Produtos WHERE Tamanho = 'M'

SELECT SUM(Preco) PrecoTotalProdutosTamanhoM FROM Produtos WHERE Tamanho = 'M'

SELECT MAX(Preco) MaiorPreco FROM Produtos

SELECT MAX(Preco) MaiorPrecoTamanhoM  FROM Produtos WHERE Tamanho = 'M'

SELECT MIN(Preco) MenorPreco FROM Produtos

SELECT MIN(Preco) MenorPrecoTamanhoM FROM Produtos WHERE Tamanho = 'M'

SELECT AVG(Preco) MediaDePreco FROM Produtos 

SELECT AVG(Preco) MediaDePrecoTamanhoM FROM Produtos WHERE Tamanho = 'M'

SELECT 'Nome: '+Nome+' - Cor: '+Cor NomeProduto, UPPER(Nome) NomeUpeer, LOWER(Cor) CorLower FROM Produtos

ALTER TABLE Produtos ADD DataCadastro datetime2

UPDATE Produtos SET DataCadastro = GETDATE()

ALTER TABLE Produtos DROP COLUMN DataCadastro

SELECT FORMAT(DataCadastro, 'dd-MM-yyyy') DataCadastroFormatado FROM Produtos

SELECT Tamanho, COUNT(*) Quantidade FROM Produtos WHERE Tamanho <> '' GROUP BY Tamanho ORDER BY Quantidade DESC

--=============================================================================

CREATE TABLE Enderecos(
	Id int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	IdCliente int NOT NULL,
	Rua varchar(255) NOT NULL,
	Bairro varchar(255) NOT NULL,
	Cidade varchar(255) NOT NULL,
	Estado char(2) NOT NULL,
	CONSTRAINT FK_Endereco_Cliente FOREIGN KEY(IdCliente) REFERENCES Clientes(Id)
)

INSERT INTO Enderecos VALUES 
(3, 'Rua Teste', 'Bairro Teste', 'Cidade Teste', 'SP'),
(6, 'Rua Teste', 'Bairro Teste', 'Cidade Teste', 'PE'),
(7, 'Rua Teste', 'Bairro Teste', 'Cidade Teste', 'PI'),
(8, 'Rua Teste', 'Bairro Teste', 'Cidade Teste', 'BA')

SELECT * FROM Enderecos

SELECT * FROM Clientes

SELECT * FROM Clientes WHERE Id = 4
SELECT * FROM Enderecos WHERE IdCliente = 4

SELECT * FROM Clientes INNER JOIN Enderecos ON Clientes.Id = Enderecos.IdCliente WHERE Clientes.Id = 4