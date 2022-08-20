package Formularios;


import Classes.Produto;
import utilidades.Utilidades;
import Implementacao.ProdutoImpl;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Produtos extends javax.swing.JInternalFrame {
    
    private int ProdutoAtual = 0;
    private DefaultTableModel UserTable;


    public Produtos() {
        initComponents();
        
        ProdutoImpl produtoImpl = new ProdutoImpl();
        produtoImpl.popularTabela(TabelaProdutos);
        
        if(TabelaProdutos.getRowCount() > 0) {
            TabelaProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            ProdutoAtual = 0;
            TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual);
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
        jLabel6 = new javax.swing.JLabel();
        TxtCodProduto = new javax.swing.JTextField();
        TxtDescricaoProd = new javax.swing.JTextField();
        TaxaProdutos = new javax.swing.JComboBox<String>();
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
        TabelaProdutos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtObsProd = new javax.swing.JTextArea();
        TxtPrecoProduto = new javax.swing.JFormattedTextField();
        bt_atualizar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(102, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Cod Produto:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Observação:");

        jLabel6.setText("Taxa:");

        TxtCodProduto.setEnabled(false);

        TxtDescricaoProd.setEnabled(false);

        TaxaProdutos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecionar Taxa", "10%", "15%", "20%" }));
        TaxaProdutos.setToolTipText("");
        TaxaProdutos.setEnabled(false);
        TaxaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxaProdutosActionPerformed(evt);
            }
        });

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

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cod Produto", "Descrição", "Preço", "Taxa", "Obs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaProdutos.getTableHeader().setReorderingAllowed(false);
        TabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutosMouseClicked(evt);
            }
        });
        TabelaProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaProdutos);

        jLabel7.setText("Preço:");

        TxtObsProd.setColumns(20);
        TxtObsProd.setRows(5);
        TxtObsProd.setEnabled(false);
        jScrollPane2.setViewportView(TxtObsProd);

        TxtPrecoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        TxtPrecoProduto.setEnabled(false);

        bt_atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDescricaoProd)
                            .addComponent(jScrollPane2)
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
                                .addGap(5, 5, 5)
                                .addComponent(BtEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TaxaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(TxtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TaxaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TxtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtDescricaoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                    .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(bt_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
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
        //TxtCodProduto.setEnabled(false);
        TxtPrecoProduto.setEnabled(false);
        TaxaProdutos.setEnabled(false);
        TxtDescricaoProd.setEnabled(false);
        TxtObsProd.setEnabled(false);
       
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
        //TxtCodProduto.setEnabled(true);
        TxtPrecoProduto.setEnabled(true);
        TaxaProdutos.setEnabled(true);
        TxtDescricaoProd.setEnabled(true);
        TxtObsProd.setEnabled(true);

        //Depois que sair do botao adicionar, clicando em
        //cancelar, as caixas de textos irao se limpar.
        TxtCodProduto.setText("");
        TxtPrecoProduto.setText("");
        TaxaProdutos.setSelectedIndex(0);
        TxtDescricaoProd.setText("");
        TxtObsProd.setText("");

       
        //Tira a necessidade de clicar na caixa de 
        //texto para digitar
        TxtCodProduto.requestFocusInWindow();



    }//GEN-LAST:event_BtAdicionarActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed

        //VALIDANDO AS CAIXAS DE TEXTOS
        if (TxtPrecoProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessario digitar um preço para o produto.");
            TxtPrecoProduto.requestFocusInWindow();
            return;
        }

        if (TxtDescricaoProd.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "É necessario digitar uma descrição ao produto.");
            TxtDescricaoProd.requestFocusInWindow();
            return;
        }
       
        

        try {

            Double preco = Double.parseDouble(TxtPrecoProduto.getText().replace(",", "."));
            if (preco <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Este valor é inválido.");
                TxtPrecoProduto.requestFocusInWindow();
                return;
            }
        } catch (Exception e) {

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
        //TxtCodProduto.setEnabled(true);
        TxtPrecoProduto.setEnabled(false);
        TaxaProdutos.setEnabled(false);
        TxtDescricaoProd.setEnabled(false);
        TxtObsProd.setEnabled(false);
        TxtPrecoProduto.setEnabled(false);

   
        Produto produto = new Produto();
        
        if(TxtCodProduto.getText().equals("")){
            produto.setCodProduto(0); 
        } else {
            produto.setCodProduto(Integer.parseInt(TxtCodProduto.getText()));
        }
 
        produto.setDescricao(TxtDescricaoProd.getText());
        produto.setPreco(Double.parseDouble(TxtPrecoProduto.getText().replace(",", ".")));
        produto.setTaxa(TaxaProdutos.getSelectedIndex());
        produto.setObs(TxtObsProd.getText());

        ProdutoImpl produtoImpl = new ProdutoImpl();
        produtoImpl.inserirProduto(produto);
        produtoImpl.popularTabela(TabelaProdutos);

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
        TxtPrecoProduto.setEnabled(true);
        TaxaProdutos.setEnabled(true);
        TxtDescricaoProd.setEnabled(true);
        TxtObsProd.setEnabled(true);
        
    }//GEN-LAST:event_BtEditarActionPerformed
    
    
    private void VisualizarCadastros(){
        Produto produto = new Produto();           
        ProdutoImpl produtoImpl = new ProdutoImpl();
        produtoImpl.popularTabela(TabelaProdutos);

        
    }

   

    private void BtPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPrimeiroActionPerformed
        // CONFIGURAÇÃO BOTAO VOLTAR PARA O PRIMEIRO USUARIO CADASTRADO
        
        ProdutoAtual = 0;
        TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual);
        visualizarDados();
        
    }//GEN-LAST:event_BtPrimeiroActionPerformed

    private void BtUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtUltimoActionPerformed
        // CONFIGURAÇÃO BOTAO IR PARA O ULTIMO USUARIO CADASTRADO

        ProdutoAtual = TabelaProdutos.getRowCount() - 1;
        TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual);
        visualizarDados();
        
    }//GEN-LAST:event_BtUltimoActionPerformed

    private void BtProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtProximoActionPerformed
        
        ProdutoAtual =  TabelaProdutos.getSelectedRow() + 1;
        
        if(ProdutoAtual == TabelaProdutos.getRowCount()){
            ProdutoAtual = 0;
            TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual);  
        } else {
            TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual);   
        }
        visualizarDados();      
       
    }//GEN-LAST:event_BtProximoActionPerformed

    private void BtAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAnteriorActionPerformed
        
        ProdutoAtual =  TabelaProdutos.getSelectedRow() - 1;
        
        if(ProdutoAtual == -1){
            ProdutoAtual = TabelaProdutos.getRowCount() - 1;
            TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual); 
        }else{
            TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual); 
        }
        visualizarDados();

    }//GEN-LAST:event_BtAnteriorActionPerformed

    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
        // CONFIGURAÇÃO BOTAO DELETAR USUARIO CADASTRADO
        
        
        DefaultTableModel pegaValor = (DefaultTableModel) TabelaProdutos.getModel();
        int row = TabelaProdutos.getSelectedRow();
        
        String ValorSelecionado = "";
        if(row > -1){
            ValorSelecionado = pegaValor.getValueAt(row, 0).toString();
        }
        
        if(ValorSelecionado.equals("")){
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir");
        } else {
            Produto produto = new Produto();
            produto.setCodProduto(Integer.parseInt(ValorSelecionado));
        
            ProdutoImpl produtoImpl = new ProdutoImpl();
            produtoImpl.excluirProduto(produto);
            produtoImpl.popularTabela(TabelaProdutos);
            
            TxtCodProduto.setText("");
            TxtPrecoProduto.setText("");
            TaxaProdutos.setSelectedIndex(0);
            TxtDescricaoProd.setText("");
            TxtObsProd.setText("");
        }
       

    }//GEN-LAST:event_BtDeletarActionPerformed

    private void BtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPesquisarActionPerformed
        // CONFIGURAÇÃO BOTAO PESQUISAR USUARIO CADASTRADO

        String produto = JOptionPane.showInputDialog("Digite o cod ou descrição do produto para realizar a pesquisa.");
        if (produto.equals("")) {
            return;
        }
        Integer codProduto = 0;
        
        try {
            codProduto = Integer.parseInt(produto);
        } catch (Exception e) {
            codProduto = 0;
        }
        
        ProdutoImpl produtoImpl = new ProdutoImpl();
        produtoImpl.pesquisarProduto(TabelaProdutos, codProduto, produto); 
        
        if(TabelaProdutos.getRowCount() > 0) {
            TabelaProdutos.setRowSelectionInterval(ProdutoAtual, ProdutoAtual); 
        } else {
             JOptionPane.showMessageDialog(null, "Não existe o produto cadastrado. " );
        }
        visualizarDados();

    }//GEN-LAST:event_BtPesquisarActionPerformed

    private void TaxaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaxaProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaxaProdutosActionPerformed

    private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
        // CHAMANDO OS DADOS NAS CAIXAS
        visualizarDados();
         
    }//GEN-LAST:event_TabelaProdutosMouseClicked

    private void TabelaProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaProdutosKeyReleased
        // TODO add your handling code here:
        
   
        TabelaProdutos.getSelectedRow();
        visualizarDados();
        
    }//GEN-LAST:event_TabelaProdutosKeyReleased

    private void bt_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_atualizarActionPerformed
        
         VisualizarCadastros();
    }//GEN-LAST:event_bt_atualizarActionPerformed
    
    
    private void visualizarDados(){
            
        DefaultTableModel pegaValor = (DefaultTableModel) TabelaProdutos.getModel();
        int row = TabelaProdutos.getSelectedRow();
        
        String ValorSelecionado = "";
        if(row > -1){
            ValorSelecionado = pegaValor.getValueAt(row, 0).toString();
        }
        
        if(ValorSelecionado.equals("")){
            
            TxtCodProduto.setText("");
            TxtDescricaoProd.setText("");
            TxtPrecoProduto.setText("");
            TaxaProdutos.setSelectedIndex(0);
            TxtObsProd.setText("");
        } else {
            
            Produto produto = new Produto();
            produto.setCodProduto(Integer.parseInt(ValorSelecionado));
        
            ProdutoImpl produtoImpl = new ProdutoImpl();
            produtoImpl.MostrarDados(produto);
            
            TxtCodProduto.setText(produto.getCodProduto().toString());
            TxtDescricaoProd.setText(produto.getDescricao());
            TxtPrecoProduto.setText(produto.getPreco().toString());
            TaxaProdutos.setSelectedIndex(produto.getTaxa());
            TxtObsProd.setText(produto.getObs());
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
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JComboBox<String> TaxaProdutos;
    private javax.swing.JTextField TxtCodProduto;
    private javax.swing.JTextField TxtDescricaoProd;
    private javax.swing.JTextArea TxtObsProd;
    private javax.swing.JFormattedTextField TxtPrecoProduto;
    private javax.swing.JButton bt_atualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
