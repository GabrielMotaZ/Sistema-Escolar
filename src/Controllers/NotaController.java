/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Aluno;

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

    public void gravarNota(Aluno aluno){
        try {
            //comando sql
            String str = "insert into disciplina(fk_idConta, nomeDisciplina) values (?, ?);";
            PreparedStatement stmt = con.prepareStatement(str);

            stmt.setString(1, aluno.getRA());
            stmt.setString(2, aluno.getDisciplina());

            System.out.println(stmt);

            stmt.execute();
            stmt.close();

            str = "insert into notas(fk_idDisciplina, fk_idConta, nota, faltas) values((select idDisciplina from Disciplina where nomeDisciplina = '" +
 aluno.getDisciplina() + "'), ?, ?, ?);";
            stmt = con.prepareStatement(str);

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
}
