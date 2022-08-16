package Formularios;

import Classes.Dados;
import Classes.Usuario;
import Implementacao.UsuarioImpl;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        TxtSenha = new javax.swing.JPasswordField();
        BtSair = new javax.swing.JButton();
        BtEntrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SOFT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("VENDAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 58, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 108, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 139, -1, -1));

        TxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 105, 200, -1));

        TxtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(TxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 136, 201, -1));

        BtSair.setText("Sair");
        BtSair.setBorderPainted(false);
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });
        getContentPane().add(BtSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 205, 110, -1));

        BtEntrar.setText("Entrar");
        BtEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEntrarActionPerformed(evt);
            }
        });
        BtEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(BtEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 205, 110, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 174, 235, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgfundo.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        // CONFIGURAÇAO BOTAO SAIR
        System.exit(0);
    }//GEN-LAST:event_BtSairActionPerformed

    private void BtEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEntrarActionPerformed
        // CONFIGURAÇÃO BOTAO ENTRAR

        if (TxtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite um usuario.");
            return;
        }
        if (TxtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite uma senha.");
            return;
        }

        Usuario usuario = new Usuario();
        usuario.setNomeLogin(TxtUsuario.getText());
        usuario.setSenha(TxtSenha.getText());

        UsuarioImpl usuarioimpl = new UsuarioImpl();

        if (usuarioimpl.ValidarUsuario(usuario)) {
            Menu menu = new Menu();
            this.setVisible(false);

            menu.setupPerfil(usuarioimpl.VerificarPerfil(usuario));
            menu.setupSenha(new String(TxtSenha.getPassword()));
            menu.setupUsuario(TxtUsuario.getText());
            menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            menu.setVisible(true);
        }


    }//GEN-LAST:event_BtEntrarActionPerformed

    private void BtEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtEntrarKeyPressed
        // TECLA ENTER PARA O BOTAO ENTRAR

        if (TxtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite um usuario.");
            return;
        }
        if (TxtSenha.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite uma senha.");
            return;
        }

        Usuario usuario = new Usuario();
        usuario.setNomeLogin(TxtUsuario.getText());
        usuario.setSenha(TxtSenha.getText());
        
        UsuarioImpl usuarioimpl = new UsuarioImpl();
        
        

        if (evt.getKeyCode() == evt.VK_ENTER) {
            
            if (usuarioimpl.ValidarUsuario(usuario)) {
                Menu menu = new Menu();
                
                this.setVisible(false);
                menu.setupPerfil(usuarioimpl.VerificarPerfil(usuario));
                menu.setupSenha(new String(TxtSenha.getPassword()));
                menu.setupUsuario(TxtUsuario.getText());
                menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                menu.setVisible(true);
                
            }
        }
    }//GEN-LAST:event_BtEntrarKeyPressed

    private void TxtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtUsuarioKeyPressed
        // CONFIGURANDO O BOTAO ENTER NA CAIXA DE LOGIN E SENHA
        if (evt.getKeyCode() == evt.VK_ENTER) {

            TxtSenha.requestFocusInWindow();
        }
    }//GEN-LAST:event_TxtUsuarioKeyPressed

    private void TxtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSenhaKeyPressed
        // CONFIGURANDO O BOTAO ENTER NA CAIXA DE LOGIN E SENHA
        if (evt.getKeyCode() == evt.VK_ENTER) {

            BtEntrar.requestFocusInWindow();

        }
    }//GEN-LAST:event_TxtSenhaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEntrar;
    private javax.swing.JButton BtSair;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
