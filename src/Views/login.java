package Views;

import Controllers.ContaController;
import Models.Conta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame{
    private JTextField tfLogin;
    private JPasswordField pfSenha;
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
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conta conta = new Conta();
                conta.setLogin(tfLogin.getText());
                conta.setSenha(String.valueOf(pfSenha.getPassword()));
                ResultSet resultado = ContaController.Login(conta);
                try{
                    resultado.first();
                    conta.setIdPermissao(Integer.parseInt(resultado.getString("idPermissao")));
                    conta.setIdConta(Integer.parseInt(resultado.getString("idConta")));
                    conta.setNomeCompleto(resultado.getString("nomeCompleto"));
                }
                catch(Exception e2){
                    System.out.println("Erro na leitura");
                }
                JFrame frame = new menu("Menu", conta);
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new login("Login");
        frame.setVisible(true);
    }
}
