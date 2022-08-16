package Implementacao;

import Classes.Usuario;
import ConexaoDB.ConexaoDB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UsuarioImpl {

    private String Perf(int perfil) {

        switch (perfil) {
            case 1:
                return "Administrador";
            case 2:
                return "Funcionario";

            default:
                return "Sem perfil";
        }
    }

    
    
    
    
    //INSERIR DADOS DO USUARIO NO BANCO DE DADOS
    public void inserirUsuario(Usuario usuario) {
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        boolean LoginUsuarioExiste = false;
        ResultSet rst = null;

        //JOptionPane.showMessageDialog(null, " usuario.getNomeLogin() " + usuario.getNomeLogin());

        try {
            String sql = "SELECT COUNT(*) existe FROM usuario WHERE NomeLogin = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());

            rst = pst.executeQuery();

            while (rst.next()) {
                Integer aux = rst.getInt("existe");
                if (aux.equals(0)) {
                    LoginUsuarioExiste = false;
                } else {
                    LoginUsuarioExiste = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar se o usuario existe no banco de dados INSERIR. " + ex.getMessage());
            return;
        }

       // JOptionPane.showMessageDialog(null, " LoginUsuarioExiste " + LoginUsuarioExiste);

        
        if (LoginUsuarioExiste) {
            try {
                String sql = " UPDATE usuario "
                        + " SET  Nome = ?, "
                        + "      Sobrenome = ?, "
                        + "      Senha = ?, "
                        + "      ConfirmarSenha = ?, "
                        + "      Perfil = ?, "
                        + "      Situacao = ?, "
                        + "      Dt_inicio = ?, "
                        + "      Dt_fim = ? "
                        + " WHERE NomeLogin = ?";

                SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy-MM-dd");
                String dataInicio = formatoTexto.format(usuario.getDt_inicio());
                String dataFim = formatoTexto.format(usuario.getDt_fim());

                java.sql.Date dataSQLIni, dataSQLFim;
                dataSQLIni = java.sql.Date.valueOf(dataInicio);
                dataSQLFim = java.sql.Date.valueOf(dataFim);

                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
                pst.setString(1, usuario.getNome());
                pst.setString(2, usuario.getSobrenome());
                pst.setString(3, usuario.getSenha());
                pst.setString(4, usuario.getConfirmarSenha());
                pst.setInt(5, usuario.getPerfil());
                pst.setString(6, usuario.getSituacao());
                pst.setDate(7, dataSQLIni);
                pst.setDate(8, dataSQLFim);
                pst.setString(9, usuario.getNomeLogin());

                pst.execute();
                
                
                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar os dados do usuario no banco de dados." + ex.getMessage());
            }
        } else {
            try {
                String sql = "INSERT INTO usuario (NomeLogin, Nome, Sobrenome, Senha, ConfirmarSenha, Perfil, Situacao, Dt_inicio, Dt_fim) VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);

                SimpleDateFormat formatoTexto = new SimpleDateFormat("yyyy-MM-dd");
                String dataInicio = formatoTexto.format(usuario.getDt_inicio());
                String dataFim = formatoTexto.format(usuario.getDt_fim());

                java.sql.Date dataSQLIni, dataSQLFim;
                dataSQLIni = java.sql.Date.valueOf(dataInicio);
                dataSQLFim = java.sql.Date.valueOf(dataFim);

               //JOptionPane.showMessageDialog(null, " testa data " + dataInicio);

                pst.setString(1, usuario.getNomeLogin());
                pst.setString(2, usuario.getNome());
                pst.setString(3, usuario.getSobrenome());
                pst.setString(4, usuario.getSenha());
                pst.setString(5, usuario.getConfirmarSenha());
                pst.setInt(6, usuario.getPerfil());
                pst.setString(7, usuario.getSituacao());
                pst.setDate(8, dataSQLIni);
                pst.setDate(9, dataSQLFim);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir os dados  do usuario no banco de dados." + ex.getMessage());
            }
        }
        conexao.desconectar();
    }
    
    
    
    
    public boolean UsuarioExiste(Usuario usuario) {
        
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        
        ResultSet rst = null;
        boolean UsuExiste = false;
        
        try {
            String sql = "SELECT COUNT(*) existe FROM usuario WHERE NomeLogin = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());
            
            rst = pst.executeQuery();

            while (rst.next()) {
                Integer aux = rst.getInt("existe");
                
                if (aux.equals(0)) {
                   UsuExiste = false;
                } else{
                    UsuExiste = true;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar se o usuario já existe." + ex.getMessage());
            return false;
        }
        
        if(UsuExiste){
            JOptionPane.showMessageDialog(null, "Este Login já existe.");
            return false;
        }
        
        conexao.desconectar();
        return true;
    }
    
    
    
    

    //INSERINDO OS DADOS NA TABELA
    public void popularTabela(JTable jTable1) {

        while (jTable1.getModel().getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM usuario ";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            rst = pst.executeQuery();

            while (rst.next()) {

                DefaultTableModel tabelaUsuarios = (DefaultTableModel) jTable1.getModel(); //pega modelo da tabela

                String NomeLogin = rst.getString("NomeLogin");
                String Nome = rst.getString("Nome");
                String Sobrenome = rst.getString("Sobrenome");
                String Senha = rst.getString("Senha");
                String ConfirmarSenha = rst.getString("ConfirmarSenha");
                String Perfil = Perf(Integer.parseInt(rst.getString("Perfil")));
                String Situacao = rst.getString("Situacao");
                String Dt_inicio = rst.getString("Dt_inicio");
                String Dt_fim = rst.getString("Dt_fim");

                Object[] obj = {NomeLogin, Nome, Sobrenome, Senha, ConfirmarSenha, Perfil, Situacao, Dt_inicio, Dt_fim};

                tabelaUsuarios.addRow(obj);

            };
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados no banco de dados. " + ex.getMessage());
        }

        conexao.desconectar();
    }
    
    

    
    
    public void excluirUsuario(Usuario usuario) {

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        try {
            String sql = "DELETE FROM usuario WHERE NomeLogin = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir os dados no banco de dados. " + ex.getMessage());
        }
        conexao.desconectar();

    }

    
    
    
    //MOSTRAR DADOS NA TABELA
    public void MostrarDados(Usuario usuario) {

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();
        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM usuario WHERE NomeLogin = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());

            rst = pst.executeQuery();

            while (rst.next()) {
                usuario.setNomeLogin(rst.getString("NomeLogin"));
                usuario.setNome(rst.getString("Nome"));
                usuario.setSobrenome(rst.getString("Sobrenome"));
                usuario.setSenha(rst.getString("Senha"));
                usuario.setConfirmarSenha(rst.getString("ConfirmarSenha"));
                usuario.setPerfil(Integer.parseInt(rst.getString("Perfil")));
                usuario.setSituacao(rst.getString("Situacao"));
                usuario.setDt_inicio(rst.getDate("Dt_inicio"));
                usuario.setDt_fim(rst.getDate("Dt_fim"));
            };

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar os dados na tela." + ex.getMessage());
        }

        conexao.desconectar();

    }

    
    
    
    
    public void pesquisarUsuario(JTable jTable1, String NomeLogin) {

        while (jTable1.getModel().getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }

        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;

        try {
            String sql = "SELECT * FROM usuario WHERE (NomeLogin = ?)";

            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, NomeLogin);
            
            rst = pst.executeQuery();

            while (rst.next()) {
                DefaultTableModel tabelaUsuarios = (DefaultTableModel) jTable1.getModel(); //pega modelo da tabela

                String Nomelogin = rst.getString("NomeLogin");
                String Nome = rst.getString("Nome");
                String Sobrenome = rst.getString("Sobrenome");
                String Senha = rst.getString("Senha");
                String ConfirmarSenha = rst.getString("ConfirmarSenha");
                String Perfil = Perf(Integer.parseInt(rst.getString("Perfil")));
                String situacao = rst.getString("Situacao");
                String dataInicio = rst.getString("Dt_inicio");
                String dataFim = rst.getString("Dt_fim");

                Object[] obj = {NomeLogin, Nome, Sobrenome, Senha, ConfirmarSenha, Perfil, situacao, dataInicio, dataFim};

                tabelaUsuarios.addRow(obj);

            };

        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar os dados na tabela para tela. " + ex.getMessage());
        }

        conexao.desconectar();
     }
     
    
    
    
    
    //VALIDAR LOGIN E SENHA DE USUARIO AO ENTRAR NO SISTEMA
    public boolean ValidarUsuario(Usuario usuario) {
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;
        try {
            String sql = "SELECT COUNT(*) existe FROM usuario WHERE NomeLogin = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());
            rst = pst.executeQuery();

            while (rst.next()) {
                Integer aux = rst.getInt("existe");
                if (aux.equals(0)) {
                    JOptionPane.showMessageDialog(null, "Usuario não existe.", "", JOptionPane.CANCEL_OPTION);
                    return false;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar se existe usuario no banco de dados. " + ex.getMessage());
            return false;
        }

        rst = null;
        try {
            String sql = "SELECT COUNT(*) existe FROM usuario WHERE NomeLogin = ? AND senha = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());
            pst.setString(2, usuario.getSenha());
            rst = pst.executeQuery();
            while (rst.next()) {
                Integer aux = rst.getInt("existe");
                if (aux.equals(0)) {
                    JOptionPane.showMessageDialog(null, "Senha incorreta.", "", JOptionPane.CANCEL_OPTION);
                    return false;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar se a senha existe no banco de dados. " + ex.getMessage());
             return false;
        }

        //VERIFICANDO SE O USUARIO ESTA ATIVO OU INATIVO NO SISTEMA
        rst = null;
        try {
            String sql = "SELECT COUNT(*) existe FROM usuario WHERE NomeLogin = ? AND senha = ? AND situacao = 'Ativo' AND (CURRENT_DATE between dt_inicio and dt_fim or dt_fim is null)";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());
            pst.setString(2, usuario.getSenha());

            rst = pst.executeQuery();
            while (rst.next()) {
                Integer aux = rst.getInt("existe");
                if (aux.equals(0)) {
                    JOptionPane.showMessageDialog(null, "Usuario inativo.", "", JOptionPane.CANCEL_OPTION);
                     return false;
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar se o usuario esta inativo no banco de dados. " + ex.getMessage());
             return false;
        }
        
        return true;
    }
    
    
    

    //VERIFICA SE O USUARIO É ADM OU FUNCIONARIO
    public Integer VerificarPerfil(Usuario usuario) {
        ConexaoDB conexao = new ConexaoDB();
        conexao.conectar();

        ResultSet rst = null;
        Integer aux = 0;
        try {
            String sql = "SELECT perfil FROM usuario WHERE NomeLogin = ? AND senha = ?";
            PreparedStatement pst = (PreparedStatement) conexao.conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNomeLogin());
            pst.setString(2, usuario.getSenha());
            rst = pst.executeQuery();

            while (rst.next()) {
                aux = rst.getInt("perfil");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar o perfil do usuario " + ex.getMessage());
        }
        return aux;
    }

}
