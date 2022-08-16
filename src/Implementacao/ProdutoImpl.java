package Implementacao;

import Classes.Produto;
import ConexaoDB.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProdutoImpl {

    private String Taxa(int idtaxa) {

        switch (idtaxa) {
            case 0:
                return "0%";
            case 1:
                return "10%";
            case 2:
                return "15%";
            case 3:
                return "20%";

            default:
                return "Sem taxa";
        }
    }

    public void inserirProduto(Produto produto) {
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        
        boolean codProdutoExiste = false;
        ResultSet rst = null;

        if (produto.getCodProduto() > 0) {
            try {
                
                String sql = "SELECT COUNT(*) existe FROM produto WHERE codproduto = ?";
                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
                pst.setInt(1, produto.getCodProduto());
                
                rst = pst.executeQuery();
                
                while (rst.next()) {
                Integer aux = rst.getInt("existe");
                if (aux.equals(0)) {
                    codProdutoExiste = false;
                } else {
                    codProdutoExiste = true;
                }
            }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar se existe produto no banco de dados. " + ex.getMessage());
            }
        }

        if (codProdutoExiste) {
            try {
                String sql = " UPDATE Produto "
                        + " SET  Descricao = ?, "
                        + "      preco = ?, "
                        + "      taxa = ?, "
                        + "      obs = ? "
                        + " WHERE CodProduto = ?";
                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
                pst.setString(1, produto.getDescricao());
                pst.setDouble(2, produto.getPreco());
                pst.setInt(3, produto.getTaxa());
                pst.setString(4, produto.getObs());
                pst.setInt(5, produto.getCodProduto());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar o produto no banco de dados." + ex.getMessage());
            }
        } else {
            try {
                String sql = "INSERT INTO Produto (Descricao, preco, taxa, obs) VALUES (?,?,?,?)";
                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
                
                pst.setString(1, produto.getDescricao());
                pst.setDouble(2, produto.getPreco());
                pst.setInt(3, produto.getTaxa());
                pst.setString(4, produto.getObs());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir produto no banco de dados." + ex.getMessage());
            }
        }
        conexao.desconectar();
    }

    public void popularTabela(JTable jTable1) {

        while (jTable1.getModel().getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM produto ";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            rst = pst.executeQuery();
            while (rst.next()) {
                DefaultTableModel tabelaProdutos = (DefaultTableModel) jTable1.getModel(); //pega modelo da tabela

                String CodProduto = rst.getString("codproduto");
                String Descricao = rst.getString("descricao");
                String preco = rst.getString("preco");
                String taxa = Taxa(Integer.parseInt(rst.getString("taxa")));
                String obs = rst.getString("obs");

                Object[] obj = {CodProduto, Descricao, preco, taxa, obs};

                tabelaProdutos.addRow(obj);

            };
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados no banco de dados. " + ex.getMessage());
        }

        conexao.desconectar();
    }

    public void excluirProduto(Produto produto) {

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        try {
            String sql = "DELETE FROM produto WHERE codproduto = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setInt(1, produto.getCodProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados no banco de dados. " + ex.getMessage());
        }
        conexao.desconectar();

    }

    public void MostrarDados(Produto produto) {

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM produto WHERE codproduto = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setInt(1, produto.getCodProduto());

            rst = pst.executeQuery();

            while (rst.next()) {
                produto.setCodProduto(Integer.parseInt(rst.getString("codproduto")));
                produto.setDescricao(rst.getString("descricao"));
                produto.setPreco(Double.parseDouble(rst.getString("preco")));
                produto.setTaxa(Integer.parseInt(rst.getString("taxa")));
                produto.setObs(rst.getString("obs"));
            };

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar os dados na tela." + ex.getMessage());
        }

        conexao.desconectar();

    }

    public void pesquisarProduto(JTable jTable1, Integer codProduto, String clausula) {

        while (jTable1.getModel().getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM produto WHERE (codproduto = ?  OR descricao like ?)";

            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setInt(1, codProduto);
            pst.setString(2, clausula);
            rst = pst.executeQuery();

            while (rst.next()) {
                DefaultTableModel tabelaProdutos = (DefaultTableModel) jTable1.getModel(); //pega modelo da tabela

                String CodProduto = rst.getString("codproduto");
                String Descricao = rst.getString("descricao");
                String preco = rst.getString("preco");
                String taxa = Taxa(Integer.parseInt(rst.getString("taxa")));
                String obs = rst.getString("obs");

                Object[] obj = {CodProduto, Descricao, preco, taxa, obs};

                tabelaProdutos.addRow(obj);

            };

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados na tabela para tela. " + ex.getMessage());
        }

        conexao.desconectar();
    }

}
