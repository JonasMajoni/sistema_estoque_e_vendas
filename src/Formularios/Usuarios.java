package Formularios;


import Classes.Usuario;
import Classes.Utilidades;
import Implementacao.UsuarioImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JInternalFrame {
    
    private UsuarioImpl usuarioimpl;
    private int UsuarioAtual=0;    
    private DefaultTableModel UserTable;
    
    public void setUsuarioImpl (UsuarioImpl usuarioimpl){
        this.usuarioimpl = usuarioimpl;        
    }
    
    public Usuarios() {
        initComponents();
        
        UsuarioImpl usuarioimpl = new UsuarioImpl();
        usuarioimpl.popularTabela(TabelaUsuarios);
        
        
        if(TabelaUsuarios.getRowCount() > 0) {
            TabelaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            UsuarioAtual = 0;
            TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual);
            visualizarDados();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtLoginUsuario = new javax.swing.JTextField();
        TxtNomeUsuarios = new javax.swing.JTextField();
        TxtSbrnomeUsario = new javax.swing.JTextField();
        TxtSenhaUsuarios = new javax.swing.JPasswordField();
        TxtConfirmaSenhaUsuarios = new javax.swing.JPasswordField();
        PerfilUsuarios = new javax.swing.JComboBox<String>();
        BtPrimeiro = new javax.swing.JButton();
        BtAnterior = new javax.swing.JButton();
        BtProximo = new javax.swing.JButton();
        BtUltimo = new javax.swing.JButton();
        BtPesquisar = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
        BtAdicionar = new javax.swing.JButton();
        BtCancelar = new javax.swing.JButton();
        BtDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUsuarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        SituacaoUsuario = new javax.swing.JComboBox();
        DataInicio = new com.toedter.calendar.JDateChooser();
        DataFim = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bt_atualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Usuarios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Login Usuario:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Sobrenome:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Conf Senha:");

        jLabel6.setText("Perfil:");

        TxtLoginUsuario.setEnabled(false);
        TxtLoginUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtLoginUsuarioFocusLost(evt);
            }
        });

        TxtNomeUsuarios.setEnabled(false);

        TxtSbrnomeUsario.setEnabled(false);

        TxtSenhaUsuarios.setEnabled(false);
        TxtSenhaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaUsuariosActionPerformed(evt);
            }
        });

        TxtConfirmaSenhaUsuarios.setEnabled(false);
        TxtConfirmaSenhaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtConfirmaSenhaUsuariosActionPerformed(evt);
            }
        });

        PerfilUsuarios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione Perfil", "Administrador", "Funcionario", " " }));
        PerfilUsuarios.setToolTipText("");
        PerfilUsuarios.setEnabled(false);

        BtPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconPrevious.png"))); // NOI18N
        BtPrimeiro.setToolTipText("Primeiro Cadastro");
        BtPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPrimeiroActionPerformed(evt);
            }
        });

        BtAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconPrevious2.png"))); // NOI18N
        BtAnterior.setToolTipText("Anterior");
        BtAnterior.setBorder(null);
        BtAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAnteriorActionPerformed(evt);
            }
        });

        BtProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconNext2.png"))); // NOI18N
        BtProximo.setToolTipText("Proximo");
        BtProximo.setBorder(null);
        BtProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtProximoActionPerformed(evt);
            }
        });

        BtUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconNext.png"))); // NOI18N
        BtUltimo.setToolTipText("Ultimo Cadastro");
        BtUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtUltimoActionPerformed(evt);
            }
        });

        BtPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconPesquisar.png"))); // NOI18N
        BtPesquisar.setToolTipText("Pesquisar cadastro");
        BtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPesquisarActionPerformed(evt);
            }
        });

        BtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconSalvar.png"))); // NOI18N
        BtSalvar.setToolTipText("Salvar");
        BtSalvar.setBorder(null);
        BtSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtSalvar.setEnabled(false);
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        BtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconEditar.png"))); // NOI18N
        BtEditar.setToolTipText("Alterar Cadastro");
        BtEditar.setBorder(null);
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });

        BtAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAdicionar.png"))); // NOI18N
        BtAdicionar.setToolTipText("Adicionar");
        BtAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdicionarActionPerformed(evt);
            }
        });

        BtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconCancelar.png"))); // NOI18N
        BtCancelar.setToolTipText("Cancelar cadastro");
        BtCancelar.setEnabled(false);
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconDeletar.png"))); // NOI18N
        BtDeletar.setToolTipText("Deletar cadastro");
        BtDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletarActionPerformed(evt);
            }
        });

        TabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Login", "Nome", "Sobrenome", "Senha", "Confirmar Senha", "Perfil", "Situação", "Inicio", "Fim"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaUsuarios);

        jLabel7.setText("Situação:");

        SituacaoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a situação", "Ativo", "Inativo" }));
        SituacaoUsuario.setEnabled(false);

        DataInicio.setEnabled(false);

        DataFim.setEnabled(false);

        jLabel8.setText("Inicio:");

        jLabel9.setText("Fim:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N

        bt_atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        bt_atualizar.setBorder(null);
        bt_atualizar.setBorderPainted(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtLoginUsuario)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PerfilUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtSbrnomeUsario)
                                    .addComponent(TxtNomeUsuarios)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtSenhaUsuarios)
                                            .addComponent(TxtConfirmaSenhaUsuarios))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SituacaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(BtPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(TxtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PerfilUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNomeUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtSbrnomeUsario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtSenhaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(SituacaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtConfirmaSenhaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jLabel8)
                            .addComponent(DataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BtPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        // CONFIGURAÇÕES DO BOTAO CANCELAR
        
        //Depois de clicar em cancelar, apenas os botoes CANCELAR E SALVAR
        //ficam desabilitados.
        BtPrimeiro.setEnabled(true);
        BtAnterior.setEnabled(true);
        BtProximo.setEnabled(true);
        BtUltimo.setEnabled(true);
        BtAdicionar.setEnabled(true);
        BtSalvar.setEnabled(false); //FALSE
        BtEditar.setEnabled(true);
        BtCancelar.setEnabled(false); //FALSE
        BtPesquisar.setEnabled(true);
        
 
        //Desabilitando as caixas de textos depois de apertar cancelar.
        TxtLoginUsuario.setEnabled(false);
        TxtNomeUsuarios.setEnabled(false);
        TxtSbrnomeUsario.setEnabled(false);
        TxtSenhaUsuarios.setEnabled(false);
        TxtConfirmaSenhaUsuarios.setEnabled(false);
        PerfilUsuarios.setEnabled(false);
        SituacaoUsuario.setEnabled(false);
        DataInicio.setEnabled(false);
        DataFim.setEnabled(false);
        

    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarActionPerformed
        // CONFIGURAÇÕES DO BOTAO ADICIONAR USUARIOS
        
 
        //Quando clicar no botao adicionar, apenas os botoes 
        //cancelar e salvar ira ficar disponiveis.
        BtPrimeiro.setEnabled(false);
        BtAnterior.setEnabled(false);
        BtProximo.setEnabled(false);
        BtUltimo.setEnabled(false);
        BtAdicionar.setEnabled(false);
        BtSalvar.setEnabled(true); //TRUE
        BtEditar.setEnabled(false);
        BtCancelar.setEnabled(true); //TRUE
        BtPesquisar.setEnabled(false);
        
        //Habilitando as caixas de textos enquanto estiver no botao adicionar.
        TxtLoginUsuario.setEnabled(true);
        TxtNomeUsuarios.setEnabled(true);
        TxtSbrnomeUsario.setEnabled(true);
        TxtSenhaUsuarios.setEnabled(true);
        TxtConfirmaSenhaUsuarios.setEnabled(true);
        PerfilUsuarios.setEnabled(true);
        SituacaoUsuario.setEnabled(true);
        DataInicio.setEnabled(true);
        DataFim.setEnabled(true);
        
        
        //Depois que sair do botao adicionar, clicando em
        //cancelar, as caixas de textos irao se limpar.
        TxtLoginUsuario.setText("");
        TxtNomeUsuarios.setText("");
        TxtSbrnomeUsario.setText("");
        TxtSenhaUsuarios.setText("");
        TxtConfirmaSenhaUsuarios.setText("");
        PerfilUsuarios.setSelectedIndex(0);
        SituacaoUsuario.setSelectedIndex(0);
        DataInicio.setDate(null);
        DataFim.setDate(null);
        
   
        TxtLoginUsuario.requestFocusInWindow();
     
    }//GEN-LAST:event_BtAdicionarActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
       
        //VALIDANDO AS CAIXAS DE TEXTOS
        if(TxtLoginUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "É necessario um login de usuario.");
            TxtLoginUsuario.requestFocusInWindow();
            return;
        }
        
        if(PerfilUsuarios.getSelectedItem() == "Selecione Perfil"){
            JOptionPane.showMessageDialog(rootPane, "É necessario selecionar um perfil.");
            PerfilUsuarios.requestFocusInWindow();
            return;
        }
                       
        if(TxtNomeUsuarios.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "É necessario digitar um nome de usuario.");
            TxtNomeUsuarios.requestFocusInWindow();
            return;
        }
        if(TxtSbrnomeUsario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "É necessario digitar um sobrenome.");
            TxtSbrnomeUsario.requestFocusInWindow();
            return;
        }
        
                
        //Converter senha para string
        String SSenha = new String(TxtSenhaUsuarios.getPassword());
        String confSenha = new String(TxtConfirmaSenhaUsuarios.getPassword());
        
        if(SSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "É necessario digitar uma senha.");
            TxtSenhaUsuarios.requestFocusInWindow();
            return;
        }
        if(confSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "É necessario Confirmar a senha.");
            TxtConfirmaSenhaUsuarios.requestFocusInWindow();
            return;
        }
        
        //SENHA E CONTRASENHA IGUAIS
        if(!SSenha.equals(confSenha)){
            JOptionPane.showMessageDialog(rootPane, "Senhas não conferem!");
            TxtSenhaUsuarios.requestFocusInWindow();
            return;
        }
        
        if(SituacaoUsuario.getSelectedItem() == "Selecione a situação"){
            JOptionPane.showMessageDialog(rootPane, "É necessario selecionar a situação.");
            SituacaoUsuario.requestFocusInWindow();
            return;
        }
          
        if(DataInicio.getDate() == null){
            JOptionPane.showMessageDialog(rootPane, "É necessário uma data de inicio.");
            DataInicio.requestFocusInWindow();
            return;
        }
        if(DataFim.getDate() == null){
            JOptionPane.showMessageDialog(rootPane, "É necessário uma data final.");
            DataFim.requestFocusInWindow();
            return;
        }
        
        Date dataIni = DataInicio.getDate();
        Date dataFim = DataFim.getDate();
        
        if(dataIni.compareTo(dataFim) > 0){
            JOptionPane.showMessageDialog(rootPane, "Erro ao inserir as datas, verifique novamente.");
            return;
        }
        
        
       // CONFIGURAÇÕES DO BOTAO SALVAR        
       //Depois de salvar, apenas os botoes CANCELAR E SALVAR
       //ficam desabilitados novamente.
        BtPrimeiro.setEnabled(true);
        BtAnterior.setEnabled(true);
        BtProximo.setEnabled(true);
        BtUltimo.setEnabled(true);
        BtAdicionar.setEnabled(true);
        BtSalvar.setEnabled(false); //FALSE
        BtEditar.setEnabled(true);
        BtCancelar.setEnabled(false); //FALSE
        BtPesquisar.setEnabled(true);
        
        //Desabilitando as caixas de textos depois de salvar.
        TxtLoginUsuario.setEnabled(false);
        TxtNomeUsuarios.setEnabled(false);
        TxtSbrnomeUsario.setEnabled(false);
        TxtSenhaUsuarios.setEnabled(false);
        TxtConfirmaSenhaUsuarios.setEnabled(false);
        PerfilUsuarios.setEnabled(false);
        SituacaoUsuario.setEnabled(false);
        DataInicio.setEnabled(false);
        DataFim.setEnabled(false);

       Usuario usuario = new Usuario();
       
       
     
       usuario.setNomeLogin(TxtLoginUsuario.getText());
       usuario.setNome(TxtNomeUsuarios.getText());
       usuario.setSobrenome(TxtSbrnomeUsario.getText());
       usuario.setPerfil(PerfilUsuarios.getSelectedIndex());
       usuario.setSenha(SSenha);
       usuario.setConfirmarSenha(confSenha);
       usuario.setSituacao((String) SituacaoUsuario.getSelectedItem().toString());
       usuario.setDt_inicio(DataInicio.getDate());
       usuario.setDt_fim(DataFim.getDate());
       
       
       UsuarioImpl usuarioimpl = new UsuarioImpl();
       usuarioimpl.inserirUsuario(usuario);
       usuarioimpl.popularTabela(TabelaUsuarios);
   

    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        
        // CONFIGURAÇÕES DO BOTAO EDITAR;
        //Quando clicar no botao Editar, apenas os botoes 
        //cancelar e salvar ficam disponiveis.
        BtPrimeiro.setEnabled(false);
        BtAnterior.setEnabled(false);
        BtProximo.setEnabled(false);
        BtUltimo.setEnabled(false);
        BtAdicionar.setEnabled(false);
        BtSalvar.setEnabled(true); //TRUE
        BtEditar.setEnabled(false);
        BtCancelar.setEnabled(true); //TRUE
        BtPesquisar.setEnabled(false);
        
        //Habilitando as caixas de textos enquanto estiver no botao adicionar.        
        TxtNomeUsuarios.setEnabled(true);
        TxtSbrnomeUsario.setEnabled(true);
        TxtSenhaUsuarios.setEnabled(true);        
        TxtConfirmaSenhaUsuarios.setEnabled(true);
        PerfilUsuarios.setEnabled(true);
        SituacaoUsuario.setEnabled(true);
        DataFim.setEnabled(true);
      
        
    }//GEN-LAST:event_BtEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened
    
    
    private void VisualizarCadastros(){
        
       Usuario usuario = new Usuario();
       UsuarioImpl usuarioimpl = new UsuarioImpl();
       usuarioimpl.popularTabela(TabelaUsuarios);
     
    }
   
    
    private void TxtConfirmaSenhaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtConfirmaSenhaUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtConfirmaSenhaUsuariosActionPerformed

    private void BtPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPrimeiroActionPerformed
        // CONFIGURAÇÃO BOTAO VOLTAR PARA O PRIMEIRO USUARIO CADASTRADO
        
        UsuarioAtual = 0;
        TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual);
        visualizarDados();
    }//GEN-LAST:event_BtPrimeiroActionPerformed

    private void BtUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUltimoActionPerformed
        // CONFIGURAÇÃO BOTAO IR PARA O ULTIMO USUARIO CADASTRADO
        
        UsuarioAtual = TabelaUsuarios.getRowCount() - 1;
        TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual);
        visualizarDados();
        
    }//GEN-LAST:event_BtUltimoActionPerformed

    private void BtProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtProximoActionPerformed
        // CONFIGURAÇÃO BOTAO PROXIMO USUARIO CADASTRADO
        UsuarioAtual =  TabelaUsuarios.getSelectedRow() + 1;
        
        if(UsuarioAtual == TabelaUsuarios.getRowCount()){
            UsuarioAtual = 0;
            TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual);  
        } else {
            TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual);   
        }
        visualizarDados();   
    }//GEN-LAST:event_BtProximoActionPerformed

    private void BtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAnteriorActionPerformed
        // CONFIGURAÇÃO BOTAO ANTERIOR USUARIO CADASTRADO
        UsuarioAtual =  TabelaUsuarios.getSelectedRow() - 1;
        
        
        if(UsuarioAtual == -1){
            UsuarioAtual = TabelaUsuarios.getRowCount() - 1;
            TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual); 
        }else{
            TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual); 
        }
        visualizarDados();
    }//GEN-LAST:event_BtAnteriorActionPerformed

    private void TxtSenhaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaUsuariosActionPerformed

    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
        // CONFIGURAÇÃO BOTAO DELETAR USUARIO CADASTRADO
        
        DefaultTableModel pegaValor = (DefaultTableModel) TabelaUsuarios.getModel();
        int row = TabelaUsuarios.getSelectedRow();
        
        String ValorSelecionado = "";
        if(row > -1){
            ValorSelecionado = pegaValor.getValueAt(row, 0).toString();
        }
        
        if(ValorSelecionado.equals("")){
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir");
        } else {
            Usuario usuario = new Usuario();
            usuario.setNomeLogin(ValorSelecionado);
            
            UsuarioImpl usuarioimpl = new UsuarioImpl();
            usuarioimpl.excluirUsuario(usuario);
            usuarioimpl.popularTabela(TabelaUsuarios);
            
            TxtLoginUsuario.setText("");
            TxtNomeUsuarios.setText("");
            TxtSbrnomeUsario.setText("");
            TxtSenhaUsuarios.setText("");
            TxtConfirmaSenhaUsuarios.setText("");
            PerfilUsuarios.setSelectedIndex(0);
            SituacaoUsuario.setSelectedIndex(0);
            DataInicio.setDate(null);
            DataFim.setDate(null);

        }

    }//GEN-LAST:event_BtDeletarActionPerformed

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // CONFIGURAÇÃO BOTAO PESQUISAR USUARIO CADASTRADO
        
       
        String usuario = JOptionPane.showInputDialog("Digite o Nome de Login para realizar a pesquisa.");
        if (usuario.equals("")) {
            return;
        }
        String NomeLogin = "";
        
        try {
            NomeLogin = usuario;
        } catch (Exception e) {
            NomeLogin = "";
        }
        
        UsuarioImpl usuarioimpl = new UsuarioImpl();
        usuarioimpl.pesquisarUsuario(TabelaUsuarios, NomeLogin);
        
        if(TabelaUsuarios.getRowCount() > 0) {
            TabelaUsuarios.setRowSelectionInterval(UsuarioAtual, UsuarioAtual); 
        } else {
             JOptionPane.showMessageDialog(null, "Não existe o usuario cadastrado. " );
        }
        visualizarDados();
        
        
    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void TxtLoginUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtLoginUsuarioFocusLost
        // VERIFICA SE O NOME LOGIN JÁ EXISTE NO BANCO.
        
        Usuario usuario = new Usuario();
        usuario.setNomeLogin(TxtLoginUsuario.getText());
        UsuarioImpl usuarioimpl = new UsuarioImpl();
        
        if(!usuarioimpl.UsuarioExiste(usuario)){
            TxtLoginUsuario.setText("");
            TxtLoginUsuario.requestFocusInWindow();
        }
    }//GEN-LAST:event_TxtLoginUsuarioFocusLost

    
    
    
    private void visualizarDados(){
            
        DefaultTableModel pegaValor = (DefaultTableModel) TabelaUsuarios.getModel();
        int row = TabelaUsuarios.getSelectedRow();
        
        String ValorSelecionado = "";
        if(row > -1){
            ValorSelecionado = pegaValor.getValueAt(row, 0).toString();
        }
        
        if(ValorSelecionado.equals("")){
            
            TxtLoginUsuario.setText("");
            TxtNomeUsuarios.setText("");
            TxtSbrnomeUsario.setText("");
            TxtSenhaUsuarios.setText("");
            TxtConfirmaSenhaUsuarios.setText("");
            PerfilUsuarios.setSelectedIndex(0);
            SituacaoUsuario.setSelectedIndex(0);
            DataInicio.setDate(null);
            DataFim.setDate(null);
           
        } else {
            
            Usuario usuario = new Usuario();
            usuario.setNomeLogin(ValorSelecionado);
            
            UsuarioImpl usuarioimpl = new UsuarioImpl();
            usuarioimpl.MostrarDados(usuario);
            
            TxtLoginUsuario.setText(usuario.getNomeLogin());
            TxtNomeUsuarios.setText(usuario.getNome());
            TxtSbrnomeUsario.setText(usuario.getSobrenome());
            TxtSenhaUsuarios.setText(usuario.getSenha());
            TxtConfirmaSenhaUsuarios.setText(usuario.getConfirmarSenha());
            PerfilUsuarios.setSelectedIndex(usuario.getPerfil());
            SituacaoUsuario.setSelectedItem(usuario.getSituacao());
            DataInicio.setDate(usuario.getDt_inicio());
            DataFim.setDate(usuario.getDt_fim());

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdicionar;
    private javax.swing.JButton BtAnterior;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtDeletar;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtPesquisar;
    private javax.swing.JButton BtPrimeiro;
    private javax.swing.JButton BtProximo;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JButton BtUltimo;
    private com.toedter.calendar.JDateChooser DataFim;
    private com.toedter.calendar.JDateChooser DataInicio;
    private javax.swing.JComboBox<String> PerfilUsuarios;
    private javax.swing.JComboBox SituacaoUsuario;
    private javax.swing.JTable TabelaUsuarios;
    private javax.swing.JPasswordField TxtConfirmaSenhaUsuarios;
    private javax.swing.JTextField TxtLoginUsuario;
    private javax.swing.JTextField TxtNomeUsuarios;
    private javax.swing.JTextField TxtSbrnomeUsario;
    private javax.swing.JPasswordField TxtSenhaUsuarios;
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
