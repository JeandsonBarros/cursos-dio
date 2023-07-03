-- Criação da tabela
CREATE TABLE [dbo].[Clientes](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Nome] [varchar](255) NULL,
	[Sobrenome] [varchar](255) NULL,
	[Email] [varchar](255) NULL,
	[AceitaComunicados] [bit] NULL,
	[DataCadastro] [datetime2](7) NULL
) ON [PRIMARY]
GO

--Cria um ponto de restauração
BEGIN TRAN
--Restaura para o ponto criado
ROLLBACK

INSERT INTO Clientes VALUES ('Ken','Sánchez','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Terri','Duffy','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Roberto','Tamburello','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Rob','Walters','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Gail','Erickson','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Jossef','Goldberg','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Dylan','Miller','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Diane','Margheim','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Gigi','Matthew','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Michael','Raheem','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Ovidiu','Cracium','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Thierry','DHers','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Janice','Galvin','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Michael','Sullivan','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Sharon','Salavaria','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('David','Bradley','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Kevin','Brown','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('John','Wood','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Mary','Dempsey','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Wanida','Benshoof','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Terry','Eminhizer','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Sariya','Harnpadoungsataya','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Mary','Gibson','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Jill','Williams','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('James','Hamilton','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Peter','Krebs','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Jo','Brown','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Guy','Gilbert','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Mark','McArthur','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Britta','Simon','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Margie','Shoop','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Rebecca','Laszlo','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Annik','Stahl','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Suchitra','Mohan','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Brandon','Heidepriem','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Jose','Lugo','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Chris','Okelberry','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Kim','Abercrombie','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Ed','Dudenhoefer','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('JoLynn','Dobney','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Bryan','Baker','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('James','Kramer','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Nancy','Anderson','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Simon','Rapier','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Thomas','Michaels','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Eugene','Kogan','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Andrew','Hill','email@email.com',1,GETDATE())
INSERT INTO Clientes VALUES ('Ruth','Ellerbrock','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Barry','Johnson','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Sidney','Higa','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Jeffrey','Ford','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Doris','Hartwig','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Diane','Glimp','email@email.com',2,GETDATE())
INSERT INTO Clientes VALUES ('Bonnie','Kearney','email@email.com',0,GETDATE())
INSERT INTO Clientes VALUES ('Taylor','Maxwell','email@email.com',0,GETDATE())