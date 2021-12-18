package Database;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static Connection Conectar(Connection conexao){
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaescolar", "root", "root");
            return conexao;
        }
        catch (Exception e){
            System.out.println("Falha ao conectar no banco");
            return conexao;
        }
    }

    public static ResultSet Executar(String string, Connection conexao, ResultSet resultado){
        try {
            Statement declaracao = conexao.createStatement();

            resultado = declaracao.executeQuery(string);

            return resultado;
        }

        catch(Exception e){
            System.out.println(e);
            return resultado;
        }
    }

    public static void main(String[] args) {
        Connection conexao = null;
        ResultSet resultado = null;
        String str = "select * from Conta";

        conexao = Conectar(conexao);
        resultado = Executar(str, conexao, resultado);
        try {
            while (resultado.next()) {
                System.out.println("login: " + resultado.getString("login") + " senha: " + resultado.getString("senha"));
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
