package Views;

import Controllers.vwTurmaController;
import Models.Conta;
import Models.ParticipacaoTurma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class menu extends JFrame{
    private JPanel pnlMenu;
    private JLabel lblBemVindo;

    public menu(String title, Conta conta) throws SQLException {
        super(title);

        lblBemVindo.setText("Seja bem vindo, " + conta.getNomeCompleto());

        ResultSet resultado = vwTurmaController.ListarTurmas(conta.getIdConta());
        ParticipacaoTurma listaParticipa[];

        while(resultado.next()){
            ParticipacaoTurma participacao = new ParticipacaoTurma();
            participacao.setIdTurma(Integer.parseInt(resultado.getString("idTurma")));
            participacao.setIdConta(Integer.parseInt(resultado.getString("idConta")));
        }

        Box box= Box.createVerticalBox();
        for (int i=1; i<=icnt; i++) {
            JButton btn= new JButton("Button "+i);
            btn.setMaximumSize(new Dimension(150, 30));
            box.add(btn);
        }
        JScrollPane scroll= new JScrollPane(box);
        scroll.setPreferredSize(new Dimension(150, 100));
        add(scroll);
        setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlMenu);
        this.pack();
    }
}
