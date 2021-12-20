CREATE DATABASE bdSistemaEscolar;

USE bdSistemaEscolar;

CREATE TABLE Permissao(
	idPermissao int not null auto_increment primary key,
    
    nomePermissao CHAR(100)
);


CREATE TABLE Conta(
	idConta int not null auto_increment primary key,

    login CHAR(100)  NOT NULL,
    senha CHAR(100)  NOT NULL,
    nomeCompleto CHAR(200) NOT NULL,
    idPermissao int NOT NULL,
    FOREIGN KEY (idPermissao) REFERENCES Permissao(idPermissao)
);
CREATE TABLE Serie(
	idSerie int auto_increment primary key,
 
    numero int,
    letra CHAR(1)
);

CREATE TABLE Turma(
	idTurma int auto_increment primary key,
	
    idSerie int,
    nomeTurma CHAR(1),
    FOREIGN KEY (idSerie) REFERENCES Serie(idSerie),
    ano DATE,
    statusTurma int NOT NULL default 1
);



CREATE TABLE ParticipacaoTurma(
	idParticipacao int auto_increment primary key,

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
        
       
