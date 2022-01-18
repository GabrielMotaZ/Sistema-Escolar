/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Aluno;
import models.Conta;

/**
 *
 * @author User
 */
public class NotaController {

    private Connection con;

    public NotaController() {
        Database db = new Database();
        this.con = db.Conectar(con);
    }

    public void gravarNota(Aluno aluno, String disciplina) {
        try {
            //comando sql

            String str = "insert into notas(fk_idDisciplina, fk_idConta, nota, faltas) values((select idDisciplina from Disciplina where nomeDisciplina = '"
                    + disciplina + "'), ?, ?, ?);";
            PreparedStatement stmt = con.prepareStatement(str);

            stmt.setString(1, aluno.getRA());
            stmt.setInt(2, aluno.getNota());
            stmt.setInt(3, aluno.getFaltas());

            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Nota cadastrada com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro NotaController: " + erro);
        }
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
            String sql = "select * from conta where idPermissao = 1";
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

    public String getSerie(int idSerie) throws SQLException {
        String str = "select * from serie where idSerie = ?";

        String serie;
        PreparedStatement stmt = con.prepareStatement(str);
        stmt.setInt(1, idSerie);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            serie = rs.getInt("numero") + "";
        } else {
            serie = "";
        }

        return serie;
    }

    public String getTurma(int idSerie) throws SQLException {
        String str = "select * from sistemaescolar.serie where idSerie = ?";

        String turma;
        PreparedStatement stmt = con.prepareStatement(str);

        stmt.setInt(1, idSerie);
        
        
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            turma = rs.getString("letra");
        } else {
            turma = "";
        }
        rs.close();

        return turma;
    }
}
