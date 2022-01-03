CREATE TABLE Permissao(
	idPermissao int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idPermissao),
    nomePermissao CHAR(100)
);

CREATE TABLE Conta(
	idConta int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idConta),
    login CHAR(100)  NOT NULL,
    senha CHAR(100)  NOT NULL,
    nomeCompleto CHAR(200) NOT NULL,
    idPermissao int NOT NULL,
    FOREIGN KEY (idPermissao) REFERENCES Permissao(idPermissao)
);

CREATE TABLE Serie(
	idSerie int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idSerie),
    numero int,
    letra CHAR(1)
);

CREATE TABLE Turma(
	idTurma int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idTurma),
    idSerie int,
    FOREIGN KEY (idSerie) REFERENCES Serie(idSerie),
    ano DATE,
    statusTurma int NOT NULL default 1
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
SELECT C.idConta, C.nomeCompleto, P.nomePermissao, T.ano as anoInicio, T.statusTurma, T.idTurma, S.numero, S.letra, S.idSerie
FROM Conta C
	LEFT JOIN Permissao P
		ON C.idPermissao = P.idPermissao
	LEFT JOIN ParticipacaoTurma PT
		ON C.idConta = PT.idConta
	LEFT JOIN Turma T
		ON PT.idTurma = T.idTurma
	LEFT JOIN Serie S
		ON T.idSerie = S.idSerie;

insert into Permissao(nomePermissao) values('Aluno');

insert into Permissao(nomePermissao) values('Professor');

insert into Serie(numero, letra) values(1, 'A');

insert into Serie(numero, letra) values(1, 'B');

insert into Turma(idSerie, ano, statusTurma) values(1, '20200101', 1);

insert into Turma(idSerie, ano, statusTurma) values(1, '20210101', 1);

insert into Conta(login, senha, nomeCompleto, idpermissao) values('login', 'senha', 'Login Senha Nome', 1);

insert into Conta(login, senha, nomeCompleto, idpermissao) values('login2', 'senha2', 'Login Senha Nome2', 1);

insert into Conta(login, senha, nomeCompleto, idpermissao) values('login3', 'senha3', 'Login Senha Nome3', 1);

insert into ParticipacaoTurma(idConta, idTurma) values(1, 1);

insert into ParticipacaoTurma(idConta, idTurma) values(2, 2);

insert into ParticipacaoTurma(idConta, idTurma) values(3, 2);
