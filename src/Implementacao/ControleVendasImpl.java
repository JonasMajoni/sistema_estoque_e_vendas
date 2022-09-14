
package Implementacao;

import Classes.Cliente;
import Classes.Produto;
import ConexaoDB.ConexaoDB;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class ControleVendasImpl {
    
   
    public void listaClientes(JComboBox<String> CmbCliente){
        
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        ResultSet rst = null;
        
        
        try {
            ArrayList<Cliente> listaClientes = new ArrayList<>();
            
            ArrayList<String> listaNome  = new ArrayList<>();
            
            String sql = "SELECT * FROM cliente";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            
            rst = pst.executeQuery();
            
            
            while(rst.next()){
                
                Cliente cliente = new Cliente();
                
                cliente.setCodCliente(Integer.parseInt(rst.getString("codCliente")));
                cliente.setNumeroRegistro(rst.getString("numregistro"));
                cliente.setNome(rst.getString("nome"));
                cliente.setSobrenome(rst.getString("sobrenome"));
                cliente.setEndereco(rst.getString("endereco"));                
                cliente.setCidade(Integer.parseInt(rst.getString("cidade")));
                cliente.setTelefone(rst.getString("telefone"));
                cliente.setDataNascimento(rst.getDate("dt_nascimento"));
                cliente.setDataRegistro(rst.getDate("dt_registro"));
                cliente.setEmail(rst.getString("email"));
                
                listaClientes.add(cliente);
                listaNome.add(rst.getString("codCliente") + " - " + rst.getString("nome"));
            }
            
             
            DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(listaNome.toArray());
            CmbCliente.setModel(defaultComboBox);
            

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
           
        }
    
    }
    
    
    
    
    public void listaProdutos(JComboBox<String> CmbProduto){
        
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        ResultSet rst = null;
        
        try {
            
            ArrayList<Produto> listaProdutos = new ArrayList<>();
            ArrayList<String> listaNome  = new ArrayList<>();
            
            String sql = "SELECT * FROM produto";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            
            rst = pst.executeQuery();
            
            
            while(rst.next()){
                
                Produto produto = new Produto();
                
                produto.setCodProduto(Integer.parseInt(rst.getString("codproduto")));
                produto.setDescricao(rst.getString("descricao"));
                produto.setPreco(Double.parseDouble(rst.getString("preco")));
                produto.setTaxa(Integer.parseInt(rst.getString("taxa")));
                produto.setObs(rst.getString("obs"));
                
                listaProdutos.add(produto);
                listaNome.add(rst.getString("codproduto") + " - " + rst.getString("descricao"));
                
            }
            
            
            DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(listaNome.toArray());
            CmbProduto.setModel(defaultComboBox);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex.getMessage());
        }
    
    }
    
}
