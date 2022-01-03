package Views;

import Controllers.ContaController;
import Controllers.vwTurmaController;
import Models.Conta;
import Models.vwTurma;

import java.awt.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class menu {
    private JFrame frame;
    private JPanel pane;
    private JButton[] buttons;
    private JLabel lblBemvindo;

    public void createAndShowGui(Conta conta) {
        frame = new JFrame(getClass().getSimpleName());
        pane = new JPanel();

        ResultSet resultado = vwTurmaController.ListarTurmas(conta.getIdConta());
        List<vwTurma> listaTurmas = new ArrayList<vwTurma>();
        vwTurma turmaParaAdd = new vwTurma();

        try {
            while (resultado.next()) {
                turmaParaAdd.setNumero(Integer.parseInt(resultado.getString("numero")));
                turmaParaAdd.setLetra(resultado.getString("letra").charAt(0));
                turmaParaAdd.setIdTurma(Integer.parseInt(resultado.getString("idTurma")));
                turmaParaAdd.setIdConta(Integer.parseInt(resultado.getString("idConta")));
                //turmaParaAdd.setIdParticipacao(Integer.parseInt(resultado.getString("idParticipacao")));
                turmaParaAdd.setAnoInicio(resultado.getDate("anoInicio"));
                listaTurmas.add(turmaParaAdd);
            }
        } catch(Exception e2){
            System.out.println(e2);
        }

        pane.setLayout(new GridLayout(listaTurmas.size(), 1));

        buttons = new JButton[listaTurmas.size()];

        for (int i = 0; i < listaTurmas.size(); i++) {
            buttons[i] = new JButton(String.valueOf(listaTurmas.get(i).getLetra()) + " "
                    + String.valueOf(listaTurmas.get(i).getNumero()) + " "
                    + String.valueOf(listaTurmas.get(i).getAnoInicio()));
            buttons[i].setHorizontalAlignment(JButton.CENTER);
            buttons[i].setMaximumSize(new Dimension(50,50));
            pane.add(buttons[i]);
        }

        lblBemvindo = new JLabel();
        lblBemvindo.setText(String.format("Seja bem vindo, %s!!!", conta.getNomeCompleto()));
        lblBemvindo.setHorizontalAlignment(JLabel.CENTER);
        frame.add(lblBemvindo, BorderLayout.NORTH);
        frame.add(pane, BorderLayout.CENTER);

        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws Exception{
        Conta conta = new Conta();
        conta.setLogin("login");
        conta.setSenha("senha");
        ResultSet resultado = ContaController.Login(conta);
        resultado.next();
        conta.setIdPermissao(Integer.parseInt(resultado.getString("idPermissao")));
        conta.setIdConta(Integer.parseInt(resultado.getString("idConta")));
        conta.setNomeCompleto(resultado.getString("nomeCompleto"));
        SwingUtilities.invokeLater(() -> new menu().createAndShowGui(conta));
    }
}