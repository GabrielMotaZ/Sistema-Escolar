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
    public void criarConta(Conta obj) {
        try {
            //comando sql
            String str = "insert into sistemaescolar.conta(login, senha, nomeCompleto, idPermissao) values (?, ?, ?, ?)";
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

    public int fazerLogin(String login, String senha) {

        try {

            //comando sql
            String str = "select * from sistemaescolar.conta where login = ? and senha = ?;";

            PreparedStatement stmt = con.prepareStatement(str);
            stmt.setString(1, login);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                //caso aluno
                if (rs.getInt("idPermissao") == 3) {
                    TelaMenu telamenu = new TelaMenu();
                    telamenu.setVisible(true);
                    telamenu.usuarioLogado = rs.getString("nomeCompleto");
                    telamenu.idUsuario = rs.getString("idConta");
                    telamenu.permissaoUsuario = "Aluno";
                    //desabilita funcoes de aluno
                    telamenu.menuProfessor.setVisible(false);
                    //caso professor   
                    return 1;
                } else if (rs.getInt("idPermissao") == 4) {
                    TelaMenu telamenu = new TelaMenu();
                    telamenu.setVisible(true);
                    telamenu.usuarioLogado = rs.getString("nomeCompleto");
                    telamenu.permissaoUsuario = "Professor";

                    telamenu.menuAluno.setVisible(false);

                    return 1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
                return 0;
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro CONTACONTROLLER: " + erro);
            return 0;
        }
        return 0;

    }

    public List<Aluno> listarNotas(String nome) {
        try {

            //1 passo criar a lista
            List<Aluno> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from vwBoletim where nomeCompleto = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Aluno obj = new Aluno();
 
                obj.setNota(rs.getInt("nota"));
                obj.setDisciplina(rs.getString("Disciplina"));
                //obj.setSerie(rs.getString("serie"));
                //obj.setTurma(rs.getString("turma"));
                obj.setFaltas(rs.getInt("faltas"));
                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

    public List<Conta> ListarAlunos() {
        try {

            //1 passo criar a lista
            List<Conta> lista = new ArrayList<>();

            //2 passo - criar o sql , organizar e executar.
            String sql = "select * from conta where idPermissao = 3";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Conta obj = new Conta();
 
                obj.setNomeCompleto(rs.getString("nomeCompleto"));
                //obj.setSerie(rs.getString("serie"));
                //obj.setTurma(rs.getString("turma"));
                obj.setIdConta(rs.getInt("idConta"));
                lista.add(obj);
            }

            return lista;

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Erro :" + erro);
            return null;
        }

    }

}
