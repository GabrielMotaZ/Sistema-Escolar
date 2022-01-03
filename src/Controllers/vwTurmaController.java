package Controllers;

import Database.Database;

import java.sql.Connection;
import java.sql.ResultSet;

public class vwTurmaController {
    public static ResultSet ListarTurmas(int idConta){
        String str = String.format("select numero, letra, idConta, idTurma, anoInicio from vwTurma where idConta = %d", idConta);

        Connection conexao = Database.Conectar();

        return Database.ExecutarQuery(str, conexao);
    }
}
