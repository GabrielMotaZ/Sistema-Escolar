package Controllers;

import Database.Database;
import Models.Conta;

import java.sql.Connection;
import java.sql.ResultSet;

public class ContaController {
    public static int Criar(Conta conta) {
        String str = String.format("INSERT INTO Conta(login, senha, nomeCompleto, idPermissao) " +
                "VALUES('%s', '%s', '%s', %d);", conta.getLogin(), conta.getSenha(), conta.getNomeCompleto(), conta.getIdPermissao());

        Connection conexao = Database.Conectar();

        return Database.ExecutarUpdate(str, conexao);
    }

    public static ResultSet Login(Conta conta) {
        String str = String.format("SELECT idPermissao, idConta WHERE login = '%s' AND senha = '%s';", conta.getLogin(), conta.getSenha());

        Connection conexao = Database.Conectar();

        ResultSet resultado = Database.ExecutarQuery(str, conexao);

        try {
            return resultado;
        }
        catch (Exception e){
            System.out.println("Conta nao existe");
            return resultado;
        }
    }
}
