DROP DATABASE sistemaescolar;
CREATE DATABASE SistemaEscolar;

USE SistemaEscolar;

CREATE TABLE Serie (
  idSerie int NOT NULL AUTO_INCREMENT,
  numero int DEFAULT NULL,
  letra char(1) DEFAULT NULL,
  PRIMARY KEY (idSerie)
);

CREATE TABLE Turma(
	idTurma int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idTurma),
    idSerie int,
    FOREIGN KEY (idSerie) REFERENCES Serie(idSerie),
    ano DATE,
    statusTurma int NOT NULL default 1
);
CREATE TABLE Permissao (
  idPermissao int NOT NULL AUTO_INCREMENT,
  nomePermissao char(100) DEFAULT NULL,
  PRIMARY KEY (idPermissao)
); 
CREATE TABLE Disciplina(
  idDisciplina int NOT NULL AUTO_INCREMENT,
  nomeDisciplina char(30) DEFAULT NULL,
  PRIMARY KEY (idDisciplina)
);

CREATE TABLE Conta(
	idConta int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idConta),
    login CHAR(100)  NOT NULL UNIQUE,
    senha CHAR(100)  NOT NULL,
    nomeCompleto CHAR(200) NOT NULL UNIQUE,
    idPermissao int NOT NULL,
    FOREIGN KEY (idPermissao) REFERENCES Permissao(idPermissao),
    fk_idSerie int DEFAULT NULL,
    FOREIGN KEY (fk_idSerie) REFERENCES Serie(idSerie),
    fk_idDisciplina int DEFAULT NULL UNIQUE
);

CREATE TABLE ParticipacaoTurma(
	idParticipacao int NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idParticipacao),
	idConta int,
    FOREIGN KEY (idConta) REFERENCES Conta(idConta),
    idTurma int,
    FOREIGN KEY (idTurma) REFERENCES Turma(idTurma)
);

CREATE TABLE Notas (
  fk_idDisciplina int NOT NULL,
  fk_idConta int NOT NULL,
  nota int DEFAULT NULL,
  faltas int DEFAULT NULL,
  KEY fk_idDisciplina (fk_idDisciplina),
  KEY fk_idConta (fk_idConta),
  CONSTRAINT notas_ibfk_1 FOREIGN KEY (fk_idDisciplina) REFERENCES disciplina (idDisciplina),
  CONSTRAINT notas_ibfk_2 FOREIGN KEY (fk_idConta) REFERENCES conta (idConta)
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

CREATE VIEW vwBoletim AS SELECT C.idConta, C.nomeCompleto, P.nomePermissao, D.nomeDisciplina as Disciplina, N.nota, N.faltas
FROM Conta C
	INNER JOIN permissao P
		ON C.idPermissao = P.idPermissao = 1
	INNER JOIN notas N
		ON C.idConta = N.fk_idConta
	INNER JOIN Disciplina D
		ON D.idDisciplina = N.fk_idDisciplina;


insert into Permissao(nomePermissao) values('Aluno');

insert into Permissao(nomePermissao) values('Professor');

insert into Serie(numero, letra) values(1, 'A');

insert into Serie(numero, letra) values(1, 'B');

insert into Serie(numero, letra) values(2, 'A');

insert into Serie(numero, letra) values(2, 'B');

insert into Serie(numero, letra) values(3, 'A');

insert into Serie(numero, letra) values(3, 'B');

insert into Turma(idSerie, ano, statusTurma) values(1, '20200101', 1);

insert into Turma(idSerie, ano, statusTurma) values(1, '20210101', 1);

insert into Disciplina(nomeDisciplina) values ('Português');

insert into Disciplina(nomeDisciplina) values ('Matemática');

insert into Disciplina(nomeDisciplina) values ('História');

insert into Conta(login, senha, nomeCompleto, idpermissao, fk_idSerie) values('aluno1', 'senha1', 'Teste Aluno 1', 1, 1);

insert into Conta(login, senha, nomeCompleto, idpermissao, fk_idSerie) values('aluno2', 'senha2', 'Teste Aluno 2', 1, 1);

insert into Conta(login, senha, nomeCompleto, idpermissao, fk_idSerie) values('aluno3', 'senha3', 'Teste Aluno 3', 1, 1);

insert into Conta(login, senha, nomeCompleto, idpermissao, fk_idDisciplina) values('professor1', 'senha1', 'Teste Professor 1', 2, 1);

insert into Conta(login, senha, nomeCompleto, idpermissao, fk_idDisciplina) values('professor2', 'senha2', 'Teste Professor 2', 2, 2);

insert into Conta(login, senha, nomeCompleto, idpermissao, fk_idDisciplina) values('professor3', 'senha3', 'Teste Professor 3', 2, 3);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (1, 1, 10, 2);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (2, 1, 8, 4);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (3, 1, 6, 0);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (1, 2, 7, 2);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (2, 2, 5, 1);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (3, 2, 9, 5);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (1, 3, 5, 3);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (2, 3, 6, 4);

insert into Notas(fk_idDisciplina, fk_idConta, nota, faltas) values (3, 3, 8, 1);

insert into ParticipacaoTurma(idConta, idTurma) values(1, 1);

insert into ParticipacaoTurma(idConta, idTurma) values(2, 2);

insert into ParticipacaoTurma(idConta, idTurma) values(3, 2);
