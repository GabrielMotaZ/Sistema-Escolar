package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton btnLogin;
    private JButton btnRegistro;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JPanel pnlLogin;

    public login(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlLogin);
        this.pack();
        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new cadastro("Cadastrar");
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new login("Login");
        frame.setVisible(true);
    }
}
