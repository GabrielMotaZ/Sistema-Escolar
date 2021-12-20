/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controllers.ContaController;
import javax.swing.JOptionPane;
import models.Conta;

/**
 *
 * @author gabri
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public ContaController cc = new ContaController();

    public TelaCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        abaAluno = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbSerie = new javax.swing.JLabel();
        lbTurma = new javax.swing.JLabel();
        lbUsername = new javax.swing.JLabel();
        lbSenhaAluno = new javax.swing.JLabel();
        lbConfirmSenhaAl = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        cbSerie = new javax.swing.JComboBox<>();
        cbTurma = new javax.swing.JComboBox<>();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmSenha = new javax.swing.JPasswordField();
        btEfetuarCadastroAl = new javax.swing.JButton();
        abaProfessor = new javax.swing.JPanel();
        lbNomeProf = new javax.swing.JLabel();
        lbUsernameProf = new javax.swing.JLabel();
        lbSenhaProf = new javax.swing.JLabel();
        lbConfirmSenhaProf = new javax.swing.JLabel();
        lbDisciplina = new javax.swing.JLabel();
        txtUsuarioProf = new javax.swing.JTextField();
        txtNomeProf = new javax.swing.JTextField();
        txtDisciplina = new javax.swing.JTextField();
        txtSenhaProf = new javax.swing.JPasswordField();
        txtConfirmSenhaProf = new javax.swing.JPasswordField();
        btEfetuarCadProf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro");

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        abaAluno.setBackground(new java.awt.Color(255, 255, 255));

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNome.setText("Nome Completo:");

        lbSerie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSerie.setText("Série:");

        lbTurma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTurma.setText("Turma:");

        lbUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUsername.setText("Nome de Usuário: ");

        lbSenhaAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSenhaAluno.setText("Senha:");

        lbConfirmSenhaAl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbConfirmSenhaAl.setText("Confirmar senha:");

        txtNomeAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeAluno.setForeground(new java.awt.Color(100, 100, 100));
        txtNomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAlunoActionPerformed(evt);
            }
        });

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(100, 100, 100));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        cbSerie.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5ª", "6ª", "7ª", "8ª", " " }));
        cbSerie.setPreferredSize(new java.awt.Dimension(56, 23));

        cbTurma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", " " }));
        cbTurma.setPreferredSize(new java.awt.Dimension(56, 23));

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(100, 100, 100));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtConfirmSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConfirmSenha.setForeground(new java.awt.Color(100, 100, 100));
        txtConfirmSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmSenhaActionPerformed(evt);
            }
        });

        btEfetuarCadastroAl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEfetuarCadastroAl.setText("Efetuar Cadastro");
        btEfetuarCadastroAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEfetuarCadastroAlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaAlunoLayout = new javax.swing.GroupLayout(abaAluno);
        abaAluno.setLayout(abaAlunoLayout);
        abaAlunoLayout.setHorizontalGroup(
            abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaAlunoLayout.createSequentialGroup()
                .addGroup(abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaAlunoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addComponent(lbUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(lbSerie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTurma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(abaAlunoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbSenhaAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbConfirmSenhaAl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEfetuarCadastroAl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        abaAlunoLayout.setVerticalGroup(
            abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaAlunoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome)
                    .addComponent(lbSerie)
                    .addComponent(cbSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTurma)
                    .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsername))
                .addGap(18, 18, 18)
                .addGroup(abaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbSenhaAluno)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbConfirmSenhaAl)
                    .addComponent(txtConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEfetuarCadastroAl))
                .addGap(101, 101, 101))
        );

        btEfetuarCadastroAl.getAccessibleContext().setAccessibleName("btEfetuarCadastro");

        jTabbedPane1.addTab("Aluno", abaAluno);

        abaProfessor.setBackground(new java.awt.Color(255, 255, 255));

        lbNomeProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbNomeProf.setText("Nome Completo:");

        lbUsernameProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbUsernameProf.setText("Nome de Usuário: ");

        lbSenhaProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbSenhaProf.setText("Senha:");

        lbConfirmSenhaProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbConfirmSenhaProf.setText("Confirmar senha:");

        lbDisciplina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbDisciplina.setText("Disciplina:");

        txtUsuarioProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuarioProf.setForeground(new java.awt.Color(100, 100, 100));
        txtUsuarioProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioProfActionPerformed(evt);
            }
        });

        txtNomeProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeProf.setForeground(new java.awt.Color(100, 100, 100));
        txtNomeProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProfActionPerformed(evt);
            }
        });

        txtDisciplina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSenhaProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenhaProf.setForeground(new java.awt.Color(100, 100, 100));
        txtSenhaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaProfActionPerformed(evt);
            }
        });

        txtConfirmSenhaProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtConfirmSenhaProf.setForeground(new java.awt.Color(100, 100, 100));
        txtConfirmSenhaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmSenhaProfActionPerformed(evt);
            }
        });

        btEfetuarCadProf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEfetuarCadProf.setText("Efetuar Cadastro");
        btEfetuarCadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEfetuarCadProfActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Para realizar o cadastro como professor, Digite a senha funcional:");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(100, 100, 100));
        jPasswordField1.setText("jPasswordF1");
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout abaProfessorLayout = new javax.swing.GroupLayout(abaProfessor);
        abaProfessor.setLayout(abaProfessorLayout);
        abaProfessorLayout.setHorizontalGroup(
            abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abaProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abaProfessorLayout.createSequentialGroup()
                        .addGroup(abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeProf)
                            .addComponent(lbUsernameProf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abaProfessorLayout.createSequentialGroup()
                                .addComponent(txtUsuarioProf, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(abaProfessorLayout.createSequentialGroup()
                                .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDisciplina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDisciplina))))
                    .addGroup(abaProfessorLayout.createSequentialGroup()
                        .addComponent(lbSenhaProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSenhaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbConfirmSenhaProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmSenhaProf, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btEfetuarCadProf))
                    .addGroup(abaProfessorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1)))
                .addContainerGap())
        );
        abaProfessorLayout.setVerticalGroup(
            abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abaProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbNomeProf)
                    .addComponent(txtNomeProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDisciplina)
                    .addComponent(txtDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbUsernameProf)
                    .addComponent(txtUsuarioProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(abaProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtSenhaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenhaProf)
                    .addComponent(lbConfirmSenhaProf)
                    .addComponent(txtConfirmSenhaProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEfetuarCadProf))
                .addGap(56, 56, 56))
        );

        jTabbedPane1.addTab("Professor", abaProfessor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void txtNomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAlunoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtConfirmSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmSenhaActionPerformed

    private void txtUsuarioProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioProfActionPerformed

    private void txtNomeProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProfActionPerformed

    private void txtSenhaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaProfActionPerformed

    private void txtConfirmSenhaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmSenhaProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmSenhaProfActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtNomeProf.setEditable(false);
        txtSenhaProf.setEditable(false);
        txtConfirmSenhaProf.setEditable(false);
        txtDisciplina.setEditable(false);
        txtUsuarioProf.setEditable(false);

    }//GEN-LAST:event_formWindowActivated

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        String senhaFuncional = "123";

        if (jPasswordField1.getText().equals(senhaFuncional)) {
            txtNomeProf.setEditable(true);
            txtSenhaProf.setEditable(true);
            txtConfirmSenhaProf.setEditable(true);
            txtDisciplina.setEditable(true);
            txtUsuarioProf.setEditable(true);
        }

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void btEfetuarCadastroAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEfetuarCadastroAlActionPerformed

        Conta usuario = new Conta();
        usuario.setIdPermissao(1);
        usuario.setLogin(txtUsuario.getText());
        usuario.setNomeCompleto(txtNomeAluno.getText());

        if (txtSenha.getText().equals(txtConfirmSenha.getText())) {
            usuario.setSenha(txtSenha.getText());

            cc.criarConta(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Senhas não coincidem!");

        }

    }//GEN-LAST:event_btEfetuarCadastroAlActionPerformed

    private void btEfetuarCadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEfetuarCadProfActionPerformed
        Conta usuario = new Conta();
        usuario.setIdPermissao(2);
        usuario.setLogin(txtUsuarioProf.getText());
        usuario.setNomeCompleto(txtNomeProf.getText());

        if (txtSenhaProf.getText().equals(txtConfirmSenhaProf.getText())) {
            usuario.setSenha(txtSenha.getText());

            cc.criarConta(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "Senhas não coincidem!");

        }
    }//GEN-LAST:event_btEfetuarCadProfActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaAluno;
    private javax.swing.JPanel abaProfessor;
    private javax.swing.JButton btEfetuarCadProf;
    private javax.swing.JButton btEfetuarCadastroAl;
    private javax.swing.JComboBox<String> cbSerie;
    private javax.swing.JComboBox<String> cbTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbConfirmSenhaAl;
    private javax.swing.JLabel lbConfirmSenhaProf;
    private javax.swing.JLabel lbDisciplina;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeProf;
    private javax.swing.JLabel lbSenhaAluno;
    private javax.swing.JLabel lbSenhaProf;
    private javax.swing.JLabel lbSerie;
    private javax.swing.JLabel lbTurma;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsernameProf;
    private javax.swing.JPasswordField txtConfirmSenha;
    private javax.swing.JPasswordField txtConfirmSenhaProf;
    private javax.swing.JTextField txtDisciplina;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeProf;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JPasswordField txtSenhaProf;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioProf;
    // End of variables declaration//GEN-END:variables
}
