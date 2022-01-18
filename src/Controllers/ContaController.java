package controllers;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Aluno;
import models.Conta;
import models.Professor;
import view.TelaLogin;
import view.TelaMenu;

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
    public void criarContaAluno(Aluno obj) {
        try {
            //comando sql
            String str = "insert into conta(login, senha, nomeCompleto, idPermissao, fk_idSerie) values (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(str);

            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getSenha());
            stmt.setString(3, obj.getNomeCompleto());
            stmt.setInt(4, obj.getIdPermissao());
            stmt.setInt(5, obj.getIdSerie());

            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
             

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro CONTACONTROLLER: " + erro);
        }
    }
    public void criarContaProfessor(Professor obj) {
        try {
            //comando sql
            String str2 = "insert into disciplina (idDisciplina, nomeDisciplina) values (?,?)";
            
            PreparedStatement stmt2 = con.prepareStatement(str2);

            stmt2.setInt(1, obj.getIdDisciplina());
            stmt2.setString(2, obj.getNomeDisciplina());
            
            stmt2.execute();
            stmt2.close();
            
            
            String str = "insert into conta(login, senha, nomeCompleto, idPermissao, fk_idDisciplina) values (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(str);

            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getSenha());
            stmt.setString(3, obj.getNomeCompleto());
            stmt.setInt(4, obj.getIdPermissao());
            stmt.setInt(5, obj.getIdDisciplina());

            stmt.execute();
            stmt.close();
            
          
            
            
            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro CONTACONTROLLER: " + erro);
        }
    }

    public int fazerLogin(String login, String senha) {

        try {

            //comando sql
            String str = "select * from conta where login = ? and senha = ?;";

            PreparedStatement stmt = con.prepareStatement(str);
            stmt.setString(1, login);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                //caso aluno
                if (rs.getInt("idPermissao") == 1) {
                    TelaMenu telamenu = new TelaMenu();
                    
                    telamenu.setVisible(true);
                    telamenu.usuarioLogado = rs.getString("nomeCompleto");
                    telamenu.idUsuario = rs.getString("idConta");
                    telamenu.permissaoUsuario = "Aluno";
                    telamenu.idSerie = rs.getInt("fk_idSerie");
                    //desabilita funcoes de aluno
                    telamenu.menuProfessor.setVisible(false);
                    
                    //caso professor   
                    return 1;
                } else if (rs.getInt("idPermissao") == 2) {
                    TelaMenu telamenu = new TelaMenu();
                    telamenu.setVisible(true);
                    telamenu.usuarioLogado = rs.getString("nomeCompleto");
                    telamenu.permissaoUsuario = "Professor";
                    telamenu.menuAluno.setVisible(false);
                    telamenu.idDisciplina = rs.getInt("fk_idDisciplina");
                    telamenu.idSerie = 0;

                    return 1;
                }
            } else {
                //JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                return 0;
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro CONTACONTROLLER: " + erro);
            return 0;
        }
        return 0;

    }
}