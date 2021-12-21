
package controllers;

import Database.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Conta;

public class ContaController {

    /*new ContaController.Conectar();
     */
    private Connection con;

    public ContaController() {
        Database db = new Database();
        this.con = db.Conectar(con);
    }

    //Metodo cadastrarCliente
    //recebera o objeto usuario da classe do model
    public void criarConta(Conta obj) {
        try {
            //comando sql
            String str = "insert into bdsistemaescolar.conta(login, senha, nomeCompleto, idPermissao) values (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(str);

            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getSenha());
            stmt.setString(3, obj.getNomeCompleto());
            stmt.setInt(4, obj.getIdPermissao());

            stmt.execute();
            stmt.close();

            if (obj.getIdPermissao() == 1) {
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
            } else if (obj.getIdPermissao() == 2) {
                JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro CONTACONTROLLER: " + erro);
        }
    }

    public ResultSet fazerLogin(Conta obj) {

        try {

            //comando sql
            String str = "select * from bdsistemaescolar.conta where login = ? and senha = ?";

            PreparedStatement stmt = con.prepareStatement(str);
            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getSenha());

            ResultSet rs = stmt.executeQuery();

            return rs;

        } catch (SQLException erro) {

            return null;
        }

    }
}
