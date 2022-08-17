package Implementacao;
import Classes.Cliente;
import ConexaoDB.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClienteImpl {
    
    
    private String cid(int idCidade){
            
        switch (idCidade){
            case 1: return"Porto Alegre" ;
            case 2: return"Caxias do Sul" ;
            case 3: return"Canoas" ;
            case 4: return"Pelotas" ;
            case 5: return"Gravataí" ;
            case 6: return"Santa Maria" ;
            case 7: return"Viamão" ;
            case 8: return"Novo Hamburgo" ;
            case 9: return"São Leopoldo" ;
            case 10: return"Rio Grande" ;
            case 11: return"Alvorada" ;
            case 12: return"Passo Fundo" ;    
            case 13: return"Sapucaia do Sul" ;    
            case 14: return"Santa Cruz do Sul" ;    
            case 15: return"Cachoeirinha" ;    
            case 16: return"Erechim" ;    
       
            default: return "Selecione a Cidade";
        }
    }
    
    /*INSERIR DADOS DO CLIENTE NO BANCO*/
    public void inserirCliente(Cliente cliente) {
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        boolean CodClienteExiste = false;
        ResultSet rst = null;

        if(cliente.getCodCliente() > 0){            
        
            try {
                String sql = "SELECT COUNT(*) existe FROM cliente WHERE codCliente = ?";
                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
                pst.setInt(1, cliente.getCodCliente());

                rst = pst.executeQuery();

                while (rst.next()) {
                    Integer aux = rst.getInt("existe");
                    if (aux.equals(0)) {
                        CodClienteExiste = false;
                    } else {
                        CodClienteExiste = true;
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao consultar se o cliente existe no banco de dados. " + ex.getMessage());
                return;
            }
        }
        
        
        /*SE O COD CLIENTE JÁ EXISTIR, REALIZAR APENAS UM UPTADE*/
        if (CodClienteExiste) {
            try {
                String sql = " UPDATE cliente "
                        + " SET  numregistro = ?, "
                        + "      nome = ?, "
                        + "      sobrenome = ?, "
                        + "      endereco = ?, "                        
                        + "      cidade = ?, "
                        + "      telefone = ?, "
                        + "      dt_nascimento = ? "
                        + "      dt_registro = ? "
                        + "      email = ? "
                        + " WHERE codCliente = ?";
                
                /*CONVERTENDO DATAS PARA O SQL*/
                SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy-MM-dd");
                String dataNasc = formatoTexto.format(cliente.getDataNascimento());
                String dataReg = formatoTexto.format(cliente.getDataRegistro());

                java.sql.Date dataSQLnasc, dataSQLreg;
                dataSQLnasc = java.sql.Date.valueOf(dataNasc);
                dataSQLreg = java.sql.Date.valueOf(dataReg);

                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
                pst.setString(1, cliente.getNumeroRegistro());
                pst.setString(2, cliente.getNome());
                pst.setString(3, cliente.getSobrenome());
                pst.setString(4, cliente.getEndereco());
                pst.setInt(5, cliente.getCidade());
                pst.setString(6, cliente.getTelefone());
                pst.setDate(7, dataSQLnasc);
                pst.setDate(8, dataSQLreg);
                pst.setString(9, cliente.getEmail());
                pst.setInt(10, cliente.getCodCliente());

                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar os dados do cliente no banco de dados." + ex.getMessage());
            }
            
        /*CASO COD N EXISTA NO BANCO, REALIZAR O CADASTRO*/    
        } else {
            
            
            try {
                String sql = "INSERT INTO cliente (numregistro, nome, sobrenome, endereco, cidade, telefone, dt_nascimento, dt_registro, email) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);

                /*CONVERTENDO DATAS PARA O SQL*/
                SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy-MM-dd");
                String dataNasc = formatoTexto.format(cliente.getDataNascimento());
                String dataReg = formatoTexto.format(cliente.getDataRegistro());

                java.sql.Date dataSQLnasc, dataSQLreg;
                dataSQLnasc = java.sql.Date.valueOf(dataNasc);
                dataSQLreg = java.sql.Date.valueOf(dataReg);

                pst.setString(1, cliente.getNumeroRegistro());
                pst.setString(2, cliente.getNome());
                pst.setString(3, cliente.getSobrenome());
                pst.setString(4, cliente.getEndereco());                
                pst.setInt(5, cliente.getCidade());
                pst.setString(6, cliente.getTelefone());
                pst.setDate(7, dataSQLnasc);
                pst.setDate(8, dataSQLreg);
                pst.setString(9, cliente.getEmail());
                pst.execute();

                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar os dados  do cliente no banco de dados." + ex.getMessage());
            }
        }
        conexao.desconectar();
    }
    
  
    
    
        /*VERIFICA SE O COD CLIENTE JÁ FOI CADASTRADO, SE FOR TRUE, ELE MOSTRA A MESAGEM IMPEDINDO DE USAR O MESMO CODIGO*/
        public boolean ClienteExiste(Cliente cliente) {
        
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        
        ResultSet rst = null;
        boolean ClienteExiste = false;
        
        try {
            String sql = "SELECT COUNT(*) existe FROM cliente WHERE codCliente = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setInt(1, cliente.getCodCliente());
            
            rst = pst.executeQuery();

            while (rst.next()) {
                Integer aux = rst.getInt("existe");
                
                if (aux.equals(0)) {
                   ClienteExiste = false;
                } else{
                    ClienteExiste = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar se o cliente já existe." + ex.getMessage());
            return false;
        }
        
        if(ClienteExiste){
            JOptionPane.showMessageDialog(null, "Este Codigo de cliente já existe, em nosso banco de dados, favor digite outro.");
            return false;
        }
        
        conexao.desconectar();
        return true;
    }
        
        
        
        

        
        
    /*CARREGAR DADOS NA TABELA*/    
    public void popularTabela(JTable jTable1) {

        while (jTable1.getModel().getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM cliente ";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            rst = pst.executeQuery();
            
            
            while (rst.next()) {

                DefaultTableModel tabelaClientes = (DefaultTableModel) jTable1.getModel(); //pega modelo da tabela

                String codcliente = rst.getString("codCliente");
                String numregistro = rst.getString("numregistro");
                String nome = rst.getString("nome");
                String sobrenome = rst.getString("sobrenome");
                String endereco = rst.getString("endereco");                
                String cidade = cid(Integer.parseInt(rst.getString("cidade")));
                String telefone = rst.getString("telefone");
                String Dt_nascimento = rst.getString("dt_nascimento");
                String Dt_registro = rst.getString("dt_registro");
                String email = rst.getString("email");

                Object[] obj = {codcliente, numregistro, nome, sobrenome, endereco, cidade, telefone, Dt_nascimento, Dt_registro, email};

                tabelaClientes.addRow(obj);

            };
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados no banco de dados. " + ex.getMessage());
        }

        conexao.desconectar();
    }        
    
    
    
    
    public void pesquisarCliente(JTable jTable1, Integer codCliente, String numregistro) {

        while (jTable1.getModel().getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM cliente WHERE (codCliente = ? OR numregistro like ?)";
            
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setInt(1, codCliente);
            pst.setString(2, numregistro);            
            rst = pst.executeQuery();
           
            while (rst.next()) {
                DefaultTableModel tabelaClientes = (DefaultTableModel) jTable1.getModel(); //pega modelo da tabela

                String codcliente = rst.getString("codCliente");
                String nregistro = rst.getString("numregistro");
                String nome = rst.getString("nome");
                String sobrenome = rst.getString("sobrenome");
                String endereco = rst.getString("endereco");                
                String cidade = rst.getString("cidade");
                String telefone = rst.getString("telefone");
                String Dt_nascimento = rst.getString("dt_nascimento");
                String Dt_registro = rst.getString("dt_registro");
                String email = rst.getString("email");

                Object[] obj = {codcliente, nregistro, nome, sobrenome, endereco, cidade, telefone, Dt_nascimento, Dt_registro, email};

                tabelaClientes.addRow(obj);

            };

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados na tabela para tela. " + ex.getMessage());
        }

        conexao.desconectar();
    }
    
    
    
    
    
    
    //MOSTRAR DADOS NA TABELA
    public void MostrarDados(Cliente cliente) {

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM cliente WHERE codCliente = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setInt(1, cliente.getCodCliente());

            rst = pst.executeQuery();

	
            while (rst.next()) {
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
            };

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar os dados na tela." + ex.getMessage());
        }

        conexao.desconectar();

    }
    
    

    
    /*EXCLUI OS DADOS DO CLIENTE SELECIONADO*/
    public void excluirCliente(Cliente cliente) {

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        try {
            String sql = "DELETE FROM cliente WHERE codCliente = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setInt(1, cliente.getCodCliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados no banco de dados. " + ex.getMessage());
        }
        conexao.desconectar();

    }

    
       
    
}