package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public Connection Conectar(Connection conexao){
        try{
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaescolar", "root", "016306");
            return conexao;
        }
        catch (SQLException erro){
            System.out.println("1*Falha ao conectar no banco");
            return conexao;
        }
    }

    public static ResultSet Executar(String string, Connection conexao, ResultSet resultado){
        try {
            Statement declaracao = conexao.createStatement();

            resultado = declaracao.executeQuery(string);

            return resultado;
        }

        catch(SQLException erro){
            System.out.println(erro);
            return resultado;
        }
    }

    public static void main(String[] args) {
        Connection conexao = null;
        ResultSet resultado = null; 
        String str = "select * from Conta";
        
        Database db = new Database();
        conexao = db.Conectar(conexao);
        resultado = Executar(str, conexao, resultado);
        try {
            while (resultado.next()) {
                System.out.println("login: " + resultado.getString("login") + " senha: " + resultado.getString("senha"));
            }
        }
        catch (SQLException erro){
            System.out.println(erro);
        }
    }

}
