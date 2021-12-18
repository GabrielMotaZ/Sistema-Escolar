package controllers;

import models.Conta;

public class ContaController {
    public void Criar(Conta conta) {
        String str = String.format("INSERT INTO Conta(login, senha, nomeCompleto, idPermissao) VALUES(%s, %s, %s, %i)");
    }
}
