package Views;

import Controllers.ContaController;
import Models.Conta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastro extends JFrame{
    private JPanel panelCadastro;
    private JTextField tfNomeCompleto;
    private JTextField tfLogin;
    private JPasswordField pfSenha;
    private JLabel lblNome;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JButton button1;

    public cadastro(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelCadastro);
        this.pack();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conta conta = new Conta();

                conta.setIdPermissao(1);
                conta.setLogin(tfLogin.getText());
                conta.setNomeCompleto(tfNomeCompleto.getText());
                conta.setSenha(String.valueOf(pfSenha.getPassword()));

                ContaController.Criar(conta);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new cadastro("Cadastrar");
        frame.setVisible(true);
    }
}
