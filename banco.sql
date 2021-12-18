CREATE TABLE Conta(
	idConta int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idConta),
    login CHAR(100)  NOT NULL,
    senha CHAR(100)  NOT NULL,
    nomeCompleto CHAR(200) NOT NULL,
    idPermissao int NOT NULL,
    FOREIGN KEY (idPermissao) REFERENCES Permissao(idPermissao)
);

CREATE TABLE Permissao(
	idPermissao int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPermissao),
    nomePermissao CHAR(100)
);

CREATE TABLE Turma(
	idTurma int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idTurma),
    idSerie int,
    FOREIGN KEY (idSerie) REFERENCES Serie(idSerie),
    ano DATE,
    statusTurma int NOT NULL default 1
);

CREATE TABLE Serie(
	idSerie int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idSerie),
    numero int,
    letra CHAR(1)
);

CREATE TABLE ParticipacaoTurma(
	idParticipacao int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idParticipacao),
	idConta int,
    FOREIGN KEY (idConta) REFERENCES Conta(idConta),
    idTurma int,
    FOREIGN KEY (idTurma) REFERENCES Turma(idTurma)
);

CREATE VIEW vwTurma AS
SELECT C.idConta, C.nomeCompleto, P.nomePermissao, T.ano as anoDeInicio, S.numero, S.letra
FROM Conta C
	INNER JOIN Permissao P
		ON C.idPermissao = P.idPermissao
	INNER JOIN ParticipacaoTurma PT
		ON C.idConta = PT.idConta
	INNER JOIN Turma T
		ON PT.idTurma = T.idTurma
	INNER JOIN Serie S
		ON T.idSerie = S.idSerie;
        
       
