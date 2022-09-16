package Formularios;

import Classes.BackGround;
import Classes.Dados;
import Implementacao.UsuarioImpl;
import utilidades.PosicaoFormulario;


public class Menu extends javax.swing.JFrame {
    private UsuarioImpl usuarioimpl;
    private int perfil;
    private String senha;
    private String usuario;
    
    PosicaoFormulario form = new PosicaoFormulario();
    
    public void setUsuarioImpl (UsuarioImpl usuarioimpl){
        this.usuarioimpl = usuarioimpl;        
    }

    public void setupPerfil(int perfil){
        this.perfil = perfil;
    }
    
    public void setupSenha(String senha){
        this.senha = senha;
    }
    
    public void setupUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getupUsuario(){
       return usuario;
    }
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        DesktopPainelMenu = new BackGround ();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuArquivos = new javax.swing.JMenu();
        MenuArquivosClientes = new javax.swing.JMenuItem();
        MenuArquivosProdutos = new javax.swing.JMenuItem();
        MenuArquivosUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuArquivosAltSenha = new javax.swing.JMenuItem();
        MenuArquivosAltUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuArquivosSair = new javax.swing.JMenuItem();
        MenuMovimentos = new javax.swing.JMenu();
        MenuMovimentosVendas = new javax.swing.JMenuItem();
        MenuMovimentosRelVendas = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuAjudaAjuda = new javax.swing.JMenuItem();
        MenuAjudaSobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        DesktopPainelMenu.setBackground(new java.awt.Color(51, 153, 255));
        DesktopPainelMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout DesktopPainelMenuLayout = new javax.swing.GroupLayout(DesktopPainelMenu);
        DesktopPainelMenu.setLayout(DesktopPainelMenuLayout);
        DesktopPainelMenuLayout.setHorizontalGroup(
            DesktopPainelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        DesktopPainelMenuLayout.setVerticalGroup(
            DesktopPainelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 314, Short.MAX_VALUE)
        );

        MenuArquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconArquivos.png"))); // NOI18N
        MenuArquivos.setText("Arquivos");

        MenuArquivosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconClientes.png"))); // NOI18N
        MenuArquivosClientes.setText("Clientes");
        MenuArquivosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivosClientesActionPerformed(evt);
            }
        });
        MenuArquivos.add(MenuArquivosClientes);

        MenuArquivosProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconProdutos.png"))); // NOI18N
        MenuArquivosProdutos.setText("Produtos");
        MenuArquivosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivosProdutosActionPerformed(evt);
            }
        });
        MenuArquivos.add(MenuArquivosProdutos);

        MenuArquivosUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconUsuarios.png"))); // NOI18N
        MenuArquivosUsuarios.setText("Usuarios");
        MenuArquivosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivosUsuariosActionPerformed(evt);
            }
        });
        MenuArquivos.add(MenuArquivosUsuarios);
        MenuArquivos.add(jSeparator1);

        MenuArquivosAltSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAltSenha.png"))); // NOI18N
        MenuArquivosAltSenha.setText("Alterar Senha");
        MenuArquivosAltSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivosAltSenhaActionPerformed(evt);
            }
        });
        MenuArquivos.add(MenuArquivosAltSenha);

        MenuArquivosAltUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAltUsuarios.png"))); // NOI18N
        MenuArquivosAltUsuario.setText("Alterar Usuario");
        MenuArquivosAltUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivosAltUsuarioActionPerformed(evt);
            }
        });
        MenuArquivos.add(MenuArquivosAltUsuario);
        MenuArquivos.add(jSeparator2);

        MenuArquivosSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconSair.png"))); // NOI18N
        MenuArquivosSair.setText("Sair");
        MenuArquivosSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuArquivosSairActionPerformed(evt);
            }
        });
        MenuArquivos.add(MenuArquivosSair);

        jMenuBar1.add(MenuArquivos);

        MenuMovimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconMovimentos.png"))); // NOI18N
        MenuMovimentos.setText("Movimentos");

        MenuMovimentosVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconVendas.png"))); // NOI18N
        MenuMovimentosVendas.setText("Vendas");
        MenuMovimentosVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMovimentosVendasActionPerformed(evt);
            }
        });
        MenuMovimentos.add(MenuMovimentosVendas);

        MenuMovimentosRelVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconRelVendas.png"))); // NOI18N
        MenuMovimentosRelVendas.setText("Relatorios de vendas");
        MenuMovimentos.add(MenuMovimentosRelVendas);

        jMenuBar1.add(MenuMovimentos);

        MenuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAjuda.png"))); // NOI18N
        MenuAjuda.setText("Ajuda");

        MenuAjudaAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAjuda.png"))); // NOI18N
        MenuAjudaAjuda.setText("Ajuda");
        MenuAjuda.add(MenuAjudaAjuda);

        MenuAjudaSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAjudaSobre.png"))); // NOI18N
        MenuAjudaSobre.setText("Sobre");
        MenuAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuAjudaSobre);

        jMenuBar1.add(MenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPainelMenu, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPainelMenu, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuArquivosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivosUsuariosActionPerformed
        // ESTE CODIGO É DO USUARIOS DO DA BARRA MENU 
        
        Usuarios usuarios = new Usuarios();
        usuarios.setUsuarioImpl(usuarioimpl);
        form.centralizarFormulario(usuarios, DesktopPainelMenu);
        
    }//GEN-LAST:event_MenuArquivosUsuariosActionPerformed

    private void MenuArquivosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivosProdutosActionPerformed
        // TODO add your handling code here:
        
        Produtos produtos = new Produtos();
        form.centralizarFormulario(produtos, DesktopPainelMenu);

    }//GEN-LAST:event_MenuArquivosProdutosActionPerformed

    private void MenuArquivosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivosClientesActionPerformed
        // TODO add your handling code here:
        
        Clientes clientes = new Clientes();
        form.centralizarFormulario(clientes, DesktopPainelMenu);
   
    }//GEN-LAST:event_MenuArquivosClientesActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // CARREGAR IMAGEM DE FUNDO DO MENU
        
        ((BackGround)DesktopPainelMenu).setImagem("/img/imgfundo.jpg");
        
        if(perfil == 2){
            MenuArquivosUsuarios.setEnabled(false);
            MenuArquivosProdutos.setEnabled(false);
            MenuArquivosClientes.setEnabled(false);
            MenuMovimentosRelVendas.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void MenuArquivosSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivosSairActionPerformed
        // CÓDIGO DO BOTAO SAIR
        
        System.exit(0);
    }//GEN-LAST:event_MenuArquivosSairActionPerformed

    private void MenuArquivosAltUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivosAltUsuarioActionPerformed
        // CÓDIGO DO BOTAO ALTERAR USUARIOS
        
        this.setVisible(false);
        Login login = new Login();
        //login.setDados(dados);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_MenuArquivosAltUsuarioActionPerformed

    private void MenuArquivosAltSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuArquivosAltSenhaActionPerformed
        // CÓDIGO DO BOTAO ALTERAR SENHA USUARIOS
        
        AlterarSenha alterarSenha = new AlterarSenha(this, rootPaneCheckingEnabled);
        alterarSenha.setupSenha(senha);
        alterarSenha.setupUsuario(usuario);
        alterarSenha.setLocationRelativeTo(this);
        alterarSenha.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_MenuArquivosAltSenhaActionPerformed

    private void MenuAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaSobreActionPerformed
        // TODO add your handling code here:
        Sobre sobre = new Sobre(this, rootPaneCheckingEnabled);
        sobre.setLocationRelativeTo(this);
        sobre.setVisible(rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_MenuAjudaSobreActionPerformed

    private void MenuMovimentosVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMovimentosVendasActionPerformed

        ContrDeVendas controleVendas = new ContrDeVendas();
        form.centralizarFormulario(controleVendas, DesktopPainelMenu);
        controleVendas.show();
        
    }//GEN-LAST:event_MenuMovimentosVendasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPainelMenu;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuItem MenuAjudaAjuda;
    private javax.swing.JMenuItem MenuAjudaSobre;
    private javax.swing.JMenu MenuArquivos;
    private javax.swing.JMenuItem MenuArquivosAltSenha;
    private javax.swing.JMenuItem MenuArquivosAltUsuario;
    private javax.swing.JMenuItem MenuArquivosClientes;
    private javax.swing.JMenuItem MenuArquivosProdutos;
    private javax.swing.JMenuItem MenuArquivosSair;
    private javax.swing.JMenuItem MenuArquivosUsuarios;
    private javax.swing.JMenu MenuMovimentos;
    private javax.swing.JMenuItem MenuMovimentosRelVendas;
    private javax.swing.JMenuItem MenuMovimentosVendas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
