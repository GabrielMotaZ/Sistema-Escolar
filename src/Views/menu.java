package Views;

import Models.Conta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame{
    private JPanel pnlMenu;
    private JLabel lblBemVindo;

    public menu(String title, Conta conta) {
        super(title);

        lblBemVindo.setText("Seja bem vindo, " + conta.getNomeCompleto());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlMenu);
        this.pack();
    }
}
