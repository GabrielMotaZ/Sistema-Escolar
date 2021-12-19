package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static Connection Conectar(){
        try{
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaescolar", "java", "java");
            return conexao;
        }
        catch (Exception e){
            Connection conexao = null;
            System.out.println("Falha ao conectar no banco");
            System.out.println(e);
            return conexao;
        }
    }

    public static ResultSet ExecutarQuery(String string, Connection conexao){
        ResultSet resultado;
        try {
            Statement declaracao = conexao.createStatement();

            resultado = declaracao.executeQuery(string);

            return resultado;
        }

        catch(Exception e){
            resultado = null;
            System.out.println(e);
            System.out.println(string);
            return resultado;
        }
    }

    public static int ExecutarUpdate(String string, Connection conexao){
        int resultado;
        try {
            Statement declaracao = conexao.createStatement();

            resultado = declaracao.executeUpdate(string);

            return resultado;
        }

        catch(Exception e){
            resultado = 0;
            System.out.println(e);
            System.out.println(string);
            return resultado;
        }
    }

    public static void main(String[] args) {
        Connection conexao = null;
        ResultSet resultado = null;
        String str = "select * from Conta";

        conexao = Conectar();
        resultado = ExecutarQuery(str, conexao);
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
