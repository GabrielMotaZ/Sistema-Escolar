DROP DATABASE SistemaEscolar;

CREATE DATABASE SistemaEscolar;
USE SistemaEscolar;

CREATE TABLE `serie` (
  `idSerie` int NOT NULL AUTO_INCREMENT,
  `numero` int DEFAULT NULL,
  `letra` char(1) DEFAULT NULL,
  PRIMARY KEY (`idSerie`)
) 

CREATE TABLE `turma` (
  `idTurma` int NOT NULL AUTO_INCREMENT,
  `idSerie` int DEFAULT NULL,
  `ano` date DEFAULT NULL,
  `statusTurma` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`idTurma`),
  KEY `idSerie` (`idSerie`),
  CONSTRAINT `turma_ibfk_1` FOREIGN KEY (`idSerie`) REFERENCES `serie` (`idSerie`)
) 

CREATE TABLE `permissao` (
  `idPermissao` int NOT NULL AUTO_INCREMENT,
  `nomePermissao` char(100) DEFAULT NULL,
  PRIMARY KEY (`idPermissao`)
) 

CREATE TABLE `conta` (
  `idConta` int NOT NULL AUTO_INCREMENT,
  `login` char(100) NOT NULL,
  `senha` char(100) NOT NULL,
  `nomeCompleto` char(200) NOT NULL,
  `idPermissao` int NOT NULL,
  `fk_idSerie` int DEFAULT NULL,
  `fk_idTurma` int DEFAULT NULL,
  PRIMARY KEY (`idConta`),
  KEY `idPermissao` (`idPermissao`),
  KEY `fk_idSerie` (`fk_idSerie`),
  KEY `fk_idTurma` (`fk_idTurma`),
  CONSTRAINT `conta_ibfk_1` FOREIGN KEY (`idPermissao`) REFERENCES `permissao` (`idPermissao`),
  CONSTRAINT `fk_idSerie` FOREIGN KEY (`fk_idSerie`) REFERENCES `serie` (`idSerie`),
  CONSTRAINT `fk_idTurma` FOREIGN KEY (`fk_idTurma`) REFERENCES `turma` (`idTurma`)
) 

CREATE TABLE `disciplina` (
  `idDisciplina` int NOT NULL AUTO_INCREMENT,
  `fk_idConta` int DEFAULT NULL,
  `nomeDisciplina` char(30) DEFAULT NULL,
  PRIMARY KEY (`idDisciplina`),
  KEY `fk_idConta` (`fk_idConta`),
  CONSTRAINT `disciplina_ibfk_1` FOREIGN KEY (`fk_idConta`) REFERENCES `conta` (`idConta`)
)

CREATE TABLE `participacaoturma` (
  `idParticipacao` int NOT NULL AUTO_INCREMENT,
  `idConta` int DEFAULT NULL,
  `idTurma` int DEFAULT NULL,
  PRIMARY KEY (`idParticipacao`),
  KEY `idConta` (`idConta`),
  KEY `idTurma` (`idTurma`),
  CONSTRAINT `participacaoturma_ibfk_1` FOREIGN KEY (`idConta`) REFERENCES `conta` (`idConta`),
  CONSTRAINT `participacaoturma_ibfk_2` FOREIGN KEY (`idTurma`) REFERENCES `turma` (`idTurma`)
) 

CREATE TABLE `notas` (
  `fk_idDisciplina` int DEFAULT NULL,
  `fk_idConta` int DEFAULT NULL,
  `nota` int DEFAULT NULL,
  `faltas` int DEFAULT NULL,
  KEY `fk_idDisciplina` (`fk_idDisciplina`),
  KEY `fk_idConta` (`fk_idConta`),
  CONSTRAINT `notas_ibfk_1` FOREIGN KEY (`fk_idDisciplina`) REFERENCES `disciplina` (`idDisciplina`),
  CONSTRAINT `notas_ibfk_2` FOREIGN KEY (`fk_idConta`) REFERENCES `conta` (`idConta`)
)

CREATE VIEW `sistemaescolar`.`vwboletim` AS select `c`.`idConta` AS `idConta`,`c`.`nomeCompleto` AS `nomeCompleto`,`p`.`nomePermissao` AS `nomePermissao`,`d`.`nomeDisciplina` AS `Disciplina`,`n`.`nota` AS `nota`,`n`.`faltas` AS `faltas` from (((`sistemaescolar`.`conta` `c` join `sistemaescolar`.`permissao` `p` on(((`c`.`idPermissao` = `p`.`idPermissao`) = 1))) join `sistemaescolar`.`notas` `n` on((`c`.`idConta` = `n`.`fk_idConta`))) join `sistemaescolar`.`disciplina` `d` on((`d`.`idDisciplina` = `n`.`fk_idDisciplina`)));

CREATE VIEW `sistemaescolar`.`vwturma` AS select `c`.`idConta` AS `idConta`,`c`.`nomeCompleto` AS `nomeCompleto`,`p`.`nomePermissao` AS `nomePermissao`,`t`.`ano` AS `anoInicio`,`t`.`statusTurma` AS `statusTurma`,`t`.`idTurma` AS `idTurma`,`s`.`numero` AS `numero`,`s`.`letra` AS `letra`,`s`.`idSerie` AS `idSerie` from ((((`sistemaescolar`.`conta` `c` left join `sistemaescolar`.`permissao` `p` on((`c`.`idPermissao` = `p`.`idPermissao`))) left join `sistemaescolar`.`participacaoturma` `pt` on((`c`.`idConta` = `pt`.`idConta`))) left join `sistemaescolar`.`turma` `t` on((`pt`.`idTurma` = `t`.`idTurma`))) left join `sistemaescolar`.`serie` `s` on((`t`.`idSerie` = `s`.`idSerie`)));

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
