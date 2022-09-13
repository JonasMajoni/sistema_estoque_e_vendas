package Formularios;

import Classes.Opcao;
import Classes.Dados;
import Implementacao.ClienteImpl;
import Implementacao.ControleVendasImpl;
import utilidades.Utilidades;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ContrDeVendas extends javax.swing.JInternalFrame {
    private Dados dados;
    private DefaultTableModel UserTable;
    
    public void setDados(Dados dados){
        this.dados = dados;
    }
    public ContrDeVendas() {
        initComponents();
        ControleVendasImpl controlVendas = new ControleVendasImpl();
        controlVendas.listaClientes(CmbCliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxCliente = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxProduto = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        TxtQuantidade = new javax.swing.JTextField();
        BotaoPesqCliente = new javax.swing.JButton();
        BotaoPesqProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabContVendas = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CmbCliente = new javax.swing.JComboBox<String>();
        CmbProduto = new javax.swing.JComboBox<String>();
        BtPesqCliente = new javax.swing.JButton();
        BtPesqProduto = new javax.swing.JButton();
        txtData = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        BotaoAdicionar = new javax.swing.JButton();
        BotaoAddCompra = new javax.swing.JButton();
        BotaoDeletar = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabControleDeVendas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        TxtQntTotal = new javax.swing.JTextField();
        TxtValorTotal = new javax.swing.JTextField();

        jLabel1.setText("Data:");

        TxtData.setEnabled(false);

        jLabel2.setText("Cliente:");

        jLabel3.setText("Produto:");

        jLabel4.setText("Quantidade:");

        BotaoPesqCliente.setText("...");
        BotaoPesqCliente.setToolTipText("Buscar clientes");

        BotaoPesqProduto.setText("...");
        BotaoPesqProduto.setToolTipText("Buscar Produtos");

        TabContVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabContVendas);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Controle de Vendas");
        setToolTipText("");
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

        jLabel5.setText("Data:");

        jLabel6.setText("Cliente:");

        jLabel7.setText("Produto:");

        jLabel8.setText("Quantidade:");

        CmbCliente.setToolTipText("");
        CmbCliente.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CmbClienteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        BtPesqCliente.setText("...");

        BtPesqProduto.setText("...");

        txtData.setEnabled(false);

        BotaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAdicionar.png"))); // NOI18N
        BotaoAdicionar.setToolTipText("Adicionar");
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });

        BotaoAddCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconAddVendas.png"))); // NOI18N
        BotaoAddCompra.setToolTipText("Add Compra");

        BotaoDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconDeletar.png"))); // NOI18N
        BotaoDeletar.setToolTipText("Deletar");

        BotaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconCancelar.png"))); // NOI18N
        BotaoCancelar.setToolTipText("Cancelar");

        TabControleDeVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TabControleDeVendas);

        jLabel9.setText("TOTAL:");

        TxtQntTotal.setEnabled(false);

        TxtValorTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CmbProduto, 0, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtPesqProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtPesqCliente, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoAddCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtQntTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtPesqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CmbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtPesqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoAddCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtQntTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       
        
        Opcao opcao = new Opcao("","Selecione o cliente");
        CmbCliente.addItem(opcao.toString());
        
        
        /*for(int i=0; i < dados.NumeroDeClientes(); i++){
            opcao = new Opcao(
            
            dados.getClientes()[i].getCodCliente().toString(),
            dados.getClientes()[i].getNome() + " " +
            dados.getClientes()[i].getSobrenome());
            
            CmbCliente.addItem(opcao.toString());
        }
        
        */
        opcao = new Opcao("","Selecione o produto");
        CmbProduto.addItem(opcao.toString());
        /*for(int i=0; i < dados.NumeroDeProdutos(); i++){
            opcao = new Opcao(
            dados.getProdutos()[i].getCodProduto(),
            dados.getProdutos()[i].getDescricao());
            
            CmbProduto.addItem(opcao.toString());
        }
        */
        txtData.setText(Utilidades.formatDate(new Date()));
        TxtQntTotal.setText(" "+"0");
        TxtValorTotal.setText(" "+"0");
        
        CarregarTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarActionPerformed
        
        if(CmbProduto.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Selecione o produto.");
            CmbProduto.requestFocusInWindow();
                
            return;
        }
        
        
        if(txtQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Digite a quantidade desejada.");
            txtQuantidade.requestFocusInWindow();
                
            return;
        }
        
        
        if(!Utilidades.isNumeric(txtQuantidade.getText())){
            JOptionPane.showMessageDialog(rootPane, "Valor inválido.");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
                
            return;
        }
       
        
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        if(quantidade <= 0){
            JOptionPane.showMessageDialog(rootPane, "Valor inválido.");
            txtQuantidade.setText("");
            txtQuantidade.requestFocusInWindow();
             
        }
        
        
       /* int pos = dados.LinhaProdutos(( (Opcao)CmbProduto.getSelectedItem()).getValor());        
        String RegistroContrVendas[] = new String[5];
        RegistroContrVendas[0] = dados.getProdutos()[pos].getCodProduto();
        RegistroContrVendas[1] = dados.getProdutos()[pos].getDescricao();
        RegistroContrVendas[2] = "" + dados.getProdutos()[pos].getPreco();
        RegistroContrVendas[3] = "" + quantidade;
        RegistroContrVendas[4] = "" + (quantidade * dados.getProdutos()[pos].getPreco()); 
        UserTable.addRow(RegistroContrVendas);
        */
        /*for(int i=0; i<dados.NumeroDeProdutos(); i++){
            String RegistroContrVendas[] = new String[5];
            RegistroContrVendas[0] = dados.getProdutos()[i].getCodProduto();
            RegistroContrVendas[1] = dados.getProdutos()[i].getDescricao();
            RegistroContrVendas[2] = "" + dados.getProdutos()[i].getPreco();
            RegistroContrVendas[3] = "" + quantidade;
            RegistroContrVendas[4] = "" + (quantidade * dados.getProdutos()[i].getPreco()); 
            UserTable.addRow(RegistroContrVendas);
        }*/
    }//GEN-LAST:event_BotaoAdicionarActionPerformed

    private void CmbClienteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CmbClienteAncestorAdded
        
        ControleVendasImpl controlVendas = new ControleVendasImpl();
    }//GEN-LAST:event_CmbClienteAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAddCompra;
    private javax.swing.JButton BotaoAdicionar;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoDeletar;
    private javax.swing.JButton BotaoPesqCliente;
    private javax.swing.JButton BotaoPesqProduto;
    private javax.swing.JButton BtPesqCliente;
    private javax.swing.JButton BtPesqProduto;
    private javax.swing.JComboBox<String> CmbCliente;
    private javax.swing.JComboBox<String> CmbProduto;
    private javax.swing.JComboBox<String> ComboBoxCliente;
    private javax.swing.JComboBox<String> ComboBoxProduto;
    private javax.swing.JTable TabContVendas;
    private javax.swing.JTable TabControleDeVendas;
    private javax.swing.JTextField TxtData;
    private javax.swing.JTextField TxtQntTotal;
    private javax.swing.JTextField TxtQuantidade;
    private javax.swing.JTextField TxtValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

    
    private void CarregarTable(){        
        String TituloCabecalho[]={"Cod Produto", "Descrição", "Preço", "Quantidade", "Valor"};
        String RegistroContrVendas[]= new String[5];
        UserTable = new DefaultTableModel(null, TituloCabecalho);
        TabControleDeVendas.setModel(UserTable);
                
    }

}

