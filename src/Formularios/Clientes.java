package Formularios;

import Classes.Cliente;
import Implementacao.ClienteImpl;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.text.MaskFormatter;

public class Clientes extends javax.swing.JInternalFrame {

    private int ClienteAtual = 0;
    private DefaultTableModel UserTable;

    public Clientes() {
        initComponents();

        ClienteImpl clienteImpl = new ClienteImpl();
        clienteImpl.popularTabela(TabelaClientes);

        if (TabelaClientes.getRowCount() > 0) {
            TabelaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            ClienteAtual = 0;
            TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
            visualizarDados();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtCodCliente = new javax.swing.JTextField();
        TxtNomeCliente = new javax.swing.JTextField();
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
        TabelaClientes = new javax.swing.JTable();
        TxtSNomeCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        TxtTelefone = new javax.swing.JTextField();
        TxtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Cidade = new javax.swing.JComboBox<String>();
        DataNascimento = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        dataRegistro = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        bt_atualizar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(102, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");
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

        jLabel1.setText("Cod Cliente:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Sobrenome:");

        TxtCodCliente.setEnabled(false);

        TxtNomeCliente.setEnabled(false);

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

        TabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cpf/cnpj", "Nome", "Sobrenome", "Endereço", "Cidade", "Telefone", "Nascimento", "Data Registro", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TabelaClientes);

        TxtSNomeCliente.setEnabled(false);

        jLabel4.setText("Endereço:");

        jLabel5.setText("Telefone:");

        jLabel7.setText("Email:");

        TxtEmail.setEnabled(false);

        TxtTelefone.setEnabled(false);
        TxtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtTelefoneFocusLost(evt);
            }
        });

        TxtEndereco.setEnabled(false);

        jLabel8.setText("Data:");

        jLabel9.setText("Data nascimento:");

        jLabel10.setText("Cidade:");

        Cidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar Cidade", "Porto Alegre", "Caxias do Sul", "Canoas", "Pelotas", "Gravataí", "Santa Maria", "Viamão", "Novo Hamburgo", "São Leopoldo", "Rio Grande", "Alvorada", "Passo Fundo", "Sapucaia do Sul", "Santa Cruz do Sul", "Cachoeirinha", "Erechim" }));
        Cidade.setToolTipText("");
        Cidade.setEnabled(false);
        Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidadeActionPerformed(evt);
            }
        });

        DataNascimento.setEnabled(false);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clientes.png"))); // NOI18N

        dataRegistro.setEnabled(false);

        jLabel12.setText("CPF/CNPJ");

        txtNum.setEnabled(false);
        txtNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumFocusLost(evt);
            }
        });

        bt_atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        bt_atualizar.setToolTipText("Atualizar");
        bt_atualizar.setBorder(null);
        bt_atualizar.setBorderPainted(false);
        bt_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_atualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtSNomeCliente)
                                    .addComponent(TxtNomeCliente)
                                    .addComponent(TxtEndereco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxtEmail)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel12)
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dataRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtSNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(TxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        bt_atualizar.setEnabled(true);
                
                

        //Desabilitando as caixas de textos depois de apertar cancelar.
        TxtCodCliente.setEnabled(false);
        dataRegistro.setEnabled(false);
        TxtNomeCliente.setEnabled(false);
        TxtSNomeCliente.setEnabled(false);
        TxtEndereco.setEnabled(false);
        TxtTelefone.setEnabled(false);
        DataNascimento.setEnabled(false);
        Cidade.setEnabled(false);
        TxtEmail.setEnabled(false);
        txtNum.setEnabled(false);

        //Desabilitando as caixas de textos depois de apertar cancelar.
        TxtCodCliente.setText("");
        dataRegistro.setDate(new Date());
        TxtNomeCliente.setText("");
        TxtSNomeCliente.setText("");
        TxtEndereco.setText("");
        TxtTelefone.setText("");
        DataNascimento.setDate(new Date());
        Cidade.setSelectedIndex(0);
        TxtEmail.setText("");
        txtNum.setText("");

    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdicionarActionPerformed
        // CONFIGURAÇÕES DO BOTAO ADICIONAR USUARIOS

        //Quando clicar no botao adicionar, apenas os botoes 
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
        bt_atualizar.setEnabled(false);

        //Habilitando as caixas de textos enquanto estiver no botao adicionar.
        //TxtCodCliente.setEnabled(true);
        dataRegistro.setEnabled(true);
        TxtNomeCliente.setEnabled(true);
        TxtSNomeCliente.setEnabled(true);
        TxtEndereco.setEnabled(true);
        TxtTelefone.setEnabled(true);
        DataNascimento.setEnabled(true);
        Cidade.setEnabled(true);
        TxtEmail.setEnabled(true);
        txtNum.setEnabled(true);

        //Depois que sair do botao adicionar, clicando em
        //cancelar, as caixas de textos irao se limpar.
        TxtCodCliente.setText("");
        dataRegistro.setDate(null);
        TxtNomeCliente.setText("");
        TxtSNomeCliente.setText("");
        TxtEndereco.setText("");
        TxtTelefone.setText("");
        DataNascimento.setDate(null);
        Cidade.setSelectedIndex(0);
        TxtEmail.setText("");
        txtNum.setText("");

    }//GEN-LAST:event_BtAdicionarActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        
        if (txtNum.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessário informar o CPF ou CNPJ.");
            txtNum.requestFocusInWindow();
            return;
        }
        
        if(dataRegistro.getDate() == null){
            JOptionPane.showMessageDialog(rootPane, "É necessário informar a data do registro.");
            dataRegistro.requestFocusInWindow();
            return;
        }

        if (TxtNomeCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessario informar um nome.");
            TxtNomeCliente.requestFocusInWindow();
            return;
        }

        if (TxtSNomeCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessario informar um sobrenome.");
            TxtSNomeCliente.requestFocusInWindow();
            return;
        }
        if (TxtEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessario informar um endereço.");
            TxtEndereco.requestFocusInWindow();
            return;
        }

        if (TxtTelefone.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessario informar um numero de telefone.");
            TxtTelefone.requestFocusInWindow();
            return;
        }
        
        if(DataNascimento.getDate() == null){
            JOptionPane.showMessageDialog(rootPane, "É necessário informar a data de nascimento.");
            dataRegistro.requestFocusInWindow();
            return;
        }

        if (Cidade.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "É necessario selecionar uma cidade.");
            Cidade.requestFocusInWindow();
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
        bt_atualizar.setEnabled(true);

        //Desabilitando as caixas de textos depois de salvar.
        TxtCodCliente.setEnabled(false);
        dataRegistro.setEnabled(false);
        TxtNomeCliente.setEnabled(false);
        TxtSNomeCliente.setEnabled(false);
        TxtEndereco.setEnabled(false);
        TxtTelefone.setEnabled(false);
        DataNascimento.setEnabled(false);
        Cidade.setEnabled(false);
        TxtEmail.setEnabled(false);
        txtNum.setEnabled(false);

        Cliente cliente = new Cliente();

        if (TxtCodCliente.getText().equals("")) {
            cliente.setCodCliente(0);
        } else {
            cliente.setCodCliente(Integer.parseInt(TxtCodCliente.getText()));
        }

        cliente.setNumeroRegistro(txtNum.getText().replace(".", "").replace("-", "").replace("/", ""));
        cliente.setNome(TxtNomeCliente.getText());
        cliente.setSobrenome(TxtSNomeCliente.getText());
        cliente.setEndereco(TxtEndereco.getText());
        cliente.setTelefone(TxtTelefone.getText());
        cliente.setCidade(Cidade.getSelectedIndex());
        cliente.setDataNascimento(DataNascimento.getDate());
        cliente.setDataRegistro(dataRegistro.getDate());
        cliente.setEmail(TxtEmail.getText());

        ClienteImpl clienteImpl = new ClienteImpl();
        clienteImpl.inserirCliente(cliente);
        clienteImpl.popularTabela(TabelaClientes);


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
        bt_atualizar.setEnabled(false);

        
        
        //Habilitando as caixas de textos enquanto estiver no botao EDITAR.
        dataRegistro.setEnabled(true);
        TxtNomeCliente.setEnabled(true);
        TxtSNomeCliente.setEnabled(true);
        TxtEndereco.setEnabled(true);
        TxtTelefone.setEnabled(true);
        DataNascimento.setEnabled(true);
        Cidade.setEnabled(true);
        TxtEmail.setEnabled(true);
        txtNum.setEnabled(true);

    }//GEN-LAST:event_BtEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void VisualizarCadastros() {
        Cliente cliente = new Cliente();
        ClienteImpl clienteImpl = new ClienteImpl();
        clienteImpl.popularTabela(TabelaClientes);

    }


    private void BtPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPrimeiroActionPerformed
        // CONFIGURAÇÃO BOTAO VOLTAR PARA O PRIMEIRO USUARIO CADASTRADO

        ClienteAtual = 0;
        TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
        visualizarDados();

    }//GEN-LAST:event_BtPrimeiroActionPerformed

    private void BtUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUltimoActionPerformed
        // CONFIGURAÇÃO BOTAO IR PARA O ULTIMO USUARIO CADASTRADO

        ClienteAtual = TabelaClientes.getRowCount() - 1;
        TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
        visualizarDados();

    }//GEN-LAST:event_BtUltimoActionPerformed

    private void BtProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtProximoActionPerformed
        // CONFIGURAÇÃO BOTAO PROXIMO USUARIO CADASTRADO
        ClienteAtual = TabelaClientes.getSelectedRow() + 1;

        if (ClienteAtual == TabelaClientes.getRowCount()) {
            ClienteAtual = 0;
            TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
        } else {
            TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
        }
        visualizarDados();
    }//GEN-LAST:event_BtProximoActionPerformed

    private void BtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAnteriorActionPerformed
        // CONFIGURAÇÃO BOTAO ANTERIOR USUARIO CADASTRADO        
        ClienteAtual = TabelaClientes.getSelectedRow() - 1;
        if (ClienteAtual == -1) {
            ClienteAtual = TabelaClientes.getRowCount() - 1;
            TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
        } else {
            TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
        }
        visualizarDados();
    }//GEN-LAST:event_BtAnteriorActionPerformed

    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
        // CONFIGURAÇÃO BOTAO DELETAR USUARIO CADASTRADO

        DefaultTableModel pegaValor = (DefaultTableModel) TabelaClientes.getModel();
        int row = TabelaClientes.getSelectedRow();

        String ValorSelecionado = "";
        if (row > -1) {
            ValorSelecionado = pegaValor.getValueAt(row, 0).toString();
        }

        if (ValorSelecionado.equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir");
        } else {

            Cliente cliente = new Cliente();
            cliente.setCodCliente(Integer.parseInt(ValorSelecionado));

            ClienteImpl clienteImpl = new ClienteImpl();
            clienteImpl.excluirCliente(cliente);
            clienteImpl.popularTabela(TabelaClientes);

            TxtCodCliente.setText("");
            txtNum.setText("");
            dataRegistro.setDate(null);
            TxtNomeCliente.setText("");
            TxtSNomeCliente.setText("");
            TxtEndereco.setText("");
            TxtTelefone.setText("");
            DataNascimento.setDate(null);
            Cidade.setSelectedIndex(0);
            TxtEmail.setText("");
        }

    }//GEN-LAST:event_BtDeletarActionPerformed

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // CONFIGURAÇÃO BOTAO PESQUISAR USUARIO CADASTRADO

        String cliente = JOptionPane.showInputDialog("Digite o cod do cliente ou CPF/CNPJ para realizar a pesquisa.");
        if (cliente.equals("")) {
            return;
        }
        Integer codCliente = 0;
        
        try {
            codCliente = Integer.parseInt(cliente);
        } catch (Exception e) {
            codCliente = 0;
        }
        
        ClienteImpl clienteImpl = new ClienteImpl();
        clienteImpl.pesquisarCliente(TabelaClientes, codCliente, cliente);
         
        if(TabelaClientes.getRowCount() > 0){
            TabelaClientes.setRowSelectionInterval(ClienteAtual, ClienteAtual);
        }else{
            JOptionPane.showMessageDialog(null, "Não retornou dados. " );
        }
        visualizarDados();

    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidadeActionPerformed

    private void txtNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumFocusLost
        // TODO add your handling code here:

        String cpfCnpjSemPonto = txtNum.getText().replace(".", "");
        String cpfCnpjSemBarra = cpfCnpjSemPonto.replace("/", "");
        String cpfCnpj = cpfCnpjSemBarra.replace("-", "");
        if (cpfCnpj.length() == 11) {
            
            try {
                
                MaskFormatter mask = new MaskFormatter("###.###.###-##");
                mask.setValueContainsLiteralCharacters(false);
                txtNum.setText(mask.valueToString(cpfCnpj));
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Valor inválido.");
            }
            
        } else if (cpfCnpj.length() == 14) {
            
            try {
                
                MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
                mask.setValueContainsLiteralCharacters(false);
                txtNum.setText(mask.valueToString(cpfCnpj));
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        } else {
            txtNum.setText(cpfCnpj);
        }

    }//GEN-LAST:event_txtNumFocusLost

    private void TxtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtTelefoneFocusLost
        // TODO add your handling code here:
        
        String Telefone = TxtTelefone.getText().replace("-", "");
        
        if(Telefone.length() == 11){
            
            try {
                MaskFormatter mask = new MaskFormatter("(##) # ####-####");
                mask.setValueContainsLiteralCharacters(false);
                TxtTelefone.setText(mask.valueToString(Telefone));
                
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Numero inválido!");
            }
            
        } else{
            TxtTelefone.setText(Telefone);
        }
        
    }//GEN-LAST:event_TxtTelefoneFocusLost

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        // TODO add your handling code here:
        
         VisualizarCadastros();
        
    }//GEN-LAST:event_bt_atualizarActionPerformed

    private void visualizarDados() {

        DefaultTableModel pegaValor = (DefaultTableModel) TabelaClientes.getModel();
        int row = TabelaClientes.getSelectedRow();

        String ValorSelecionado = "";
        if (row > -1) {
            ValorSelecionado = pegaValor.getValueAt(row, 0).toString();
        }

        if (ValorSelecionado.equals("")) {

            TxtCodCliente.setText("");
            txtNum.setText("");
            dataRegistro.setDate(null);
            TxtNomeCliente.setText("");
            TxtSNomeCliente.setText("");
            TxtEndereco.setText("");
            TxtTelefone.setText("");
            DataNascimento.setDate(null);
            Cidade.setSelectedIndex(0);
            TxtEmail.setText("");
        } else {

            Cliente cliente = new Cliente();
            cliente.setCodCliente(Integer.parseInt(ValorSelecionado));

            ClienteImpl clienteImpl = new ClienteImpl();
            clienteImpl.MostrarDados(cliente);

            TxtCodCliente.setText(cliente.getCodCliente().toString());

            String cpfCnpj = cliente.getNumeroRegistro();
            if (cpfCnpj.length() == 11) {
                try {
                    
                    MaskFormatter mask = new MaskFormatter("###.###.###-##");
                    mask.setValueContainsLiteralCharacters(false); 
                    txtNum.setText(mask.valueToString(cpfCnpj));
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido.");
                }
                
            } else if (cpfCnpj.length() == 14) {
                
                try {
                    
                    MaskFormatter mask = new MaskFormatter("##.###.###/####-##");
                    mask.setValueContainsLiteralCharacters(false);
                    txtNum.setText(mask.valueToString(cpfCnpj));
                    
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido.");
                }
            }
            
            dataRegistro.setDate(cliente.getDataRegistro());
            TxtNomeCliente.setText(cliente.getNome());
            TxtSNomeCliente.setText(cliente.getSobrenome());
            TxtEndereco.setText(cliente.getEndereco());
            TxtTelefone.setText(cliente.getTelefone());
            DataNascimento.setDate(cliente.getDataNascimento());
            Cidade.setSelectedIndex(cliente.getCidade());
            TxtEmail.setText(cliente.getEmail());

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
    private javax.swing.JComboBox<String> Cidade;
    private com.toedter.calendar.JDateChooser DataNascimento;
    private javax.swing.JTable TabelaClientes;
    private javax.swing.JTextField TxtCodCliente;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEndereco;
    private javax.swing.JTextField TxtNomeCliente;
    private javax.swing.JTextField TxtSNomeCliente;
    private javax.swing.JTextField TxtTelefone;
    private javax.swing.JButton bt_atualizar;
    private com.toedter.calendar.JDateChooser dataRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtNum;
    // End of variables declaration//GEN-END:variables

}
