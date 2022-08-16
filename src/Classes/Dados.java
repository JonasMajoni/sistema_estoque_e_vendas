package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Dados {
    //Este é para usuarios
    private int MaxUsuarios = 50;
    private Usuario VetUsuario[] = new Usuario [MaxUsuarios];    
    private int ContadorUsuarios = 0;
    
    
    //Este é para produtos
    private int MaxProdutos = 180;
    private Produto VetProduto[] = new Produto [MaxProdutos];    
    private int ContadorProdutos = 0;    
    
    //Este é para Clientes
    private int MaxClientes = 150;
    private Cliente VetCliente[] = new Cliente [MaxClientes];
    private int ContadorClientes = 0;
    
    
    public Dados(){
       
        //CRIANDO CADASTROS DE CLIENTES
        PreencherClientes();
        
    }
    

    //CONTADOR USUARIOS
    //CHAMAR NO BOTOES DE NAVEGACAO DE CADASTRO USUARIOS
    //CONTADOR CLIENTES
    //CHAMAR NO BOTOES DE NAVEGACAO DE CADASTRO CLIENTES  
    
    
    public int NumeroDeClientes(){
        return ContadorClientes;
    }
       
    public Cliente[] getClientes(){
        return VetCliente;
    }    
     
    //--------------------------------------------------------------- 
    //VALIDAR USUARIO E SENHA
    //VALIDAR PERFIL ADM OU FUNC

    
    
    //METODO PARA ACEITAR A TROCA DE SENHA
    public void AlterarSenha(String usuario, String senha){ 
        
        for(int i=0; i<ContadorUsuarios; i++){
            
            if(VetUsuario[i].getNomeLogin().equals(usuario)){
                VetUsuario[i].setSenha(senha);
            }
        }
       
    }
    
    
    //VALIDAR SE O USUARIO JÁ EXISTE NO CONTADOR
    //TAMBÉM É FEITO NO FORM USUARIOS
    public int LinhaUsuarios(String usuario){        
        for(int i=0; i<ContadorUsuarios; i++){
            if(VetUsuario[i].getNomeLogin().equals(usuario)){
                return i;
            }
        }
        return -1;
    }
    
    
    //Se atingir 50 usuarios cadastrados, exibira a mensagem
    public String CadUsuario (Usuario MUsuario){
        if(ContadorUsuarios == MaxUsuarios ){
            return "Limite de cadastros atingido: 50 ";
            
        }
        VetUsuario[ContadorUsuarios] = MUsuario;
        ContadorUsuarios ++;
        return "Usuario cadastrado com sucesso! ";
    }
        
    //METODO PARA EDITAR OS DADOS DO USUARIO
    //METODO PARA DELETAR O USUARIO
    //---------------------------------------------------------------
    
  
    //Se atingir 80 produtos cadastrados, exibira a mensagem
    public String CadProduto (Produto MProduto){
        if(ContadorProdutos == MaxProdutos ){
            return "Limite de produtos cadastrados atingido: 180 ";
            
        }
        VetProduto[ContadorProdutos] = MProduto;
        ContadorProdutos ++;
        return "Produto cadastrado com sucesso! ";
    }    
    
       
    //---------------------------------------------------------------
   
    
    //VALIDAR SE O CLIENTE JÁ EXISTE NO CONTADOR
    public int LinhaClientes(String cliente){        
        for(int i=0; i<ContadorClientes; i++){
            if(VetCliente[i].getCodCliente().equals(cliente)){
                return i;
            }
        }
        return -1;
    }
    
    
    //Se atingir 150 clientes cadastrados, exibira a mensagem
    public String CadCliente (Cliente MCliente){
        if(ContadorClientes == MaxClientes ){
            return "Limite de clientes cadastrados atingido: 150 ";
            
        }
        VetCliente[ContadorClientes] = MCliente;
        ContadorClientes ++;
        return "Cliente cadastrado com sucesso! ";
    }    
    
    
    //METODO PARA EDITAR OS DADOS DO CLIENTE
    public String EditarCliente (Cliente MCliente, int posicaoLinha){
        
        VetCliente[posicaoLinha].setIdentificacao(MCliente.getIdentificacao());
        VetCliente[posicaoLinha].setNome(MCliente.getNome());
        VetCliente[posicaoLinha].setSobrenome(MCliente.getSobrenome());
        VetCliente[posicaoLinha].setEndereco(MCliente.getEndereco());
        VetCliente[posicaoLinha].setTelefone(MCliente.getTelefone());
        VetCliente[posicaoLinha].setCidade(MCliente.getCidade());
        VetCliente[posicaoLinha].setDataNascimento(MCliente.getDataNascimento());
        VetCliente[posicaoLinha].setDataVenda(MCliente.getDataVenda());
        VetCliente[posicaoLinha].setEmail(MCliente.getEmail());
        
  
        return "Dados alterados com sucesso! ";
    }
    
    
    //METODO PARA DELETAR CLIENTE
    public String DeletarCliente (int posicaoLinha){
        
        for(int i= posicaoLinha; i<ContadorClientes -1; i++){
            VetCliente[i] = VetCliente[i + 1];
        }            
        
        ContadorClientes --;
        return "Cliente deletado com sucesso! ";
    }
    
    
    //---------------------------------------------------------------
    
    //SALVAR DADOS NO BLOCO DE NOTAS E CARREGAR OS DADOS SALVOS NAS TABELAS
    public void CadastroGeral(){

        SalvaCliente();
        
    }
    

    //METODO PARA SALVAR CLIENTES NO BLOCO DE NOTAS
    public void SalvaCliente(){
        
        FileWriter FW = null;
        PrintWriter PW = null;
        
        try {
            
            FW = new FileWriter("DadosBD/clientes.txt");
            PW = new PrintWriter(FW);
            
            for(int i = 0; i<ContadorClientes; i++){
                PW.println(VetCliente[i].Tostring());
            }
            
        } catch (Exception ec) {
            ec.printStackTrace();
            
        }finally{
            try {
                if(FW != null){
                    FW.close();
                }
            } catch (Exception ec2) {
                ec2.printStackTrace();
            }
        }
        
    }
    
    
    //CARREGANDO OS DADOS SALVOS NO BLOCO DE NOTAS DO PRODUTOS PARA A TABELA
    private void PreencherClientes(){
        
        File Arquivo = null;
        FileReader FR = null;
        BufferedReader BR = null;
        
        try {
            
            Arquivo = new File("DadosBD/clientes.txt");
            FR = new FileReader(Arquivo);
            BR = new BufferedReader(FR);
            
            int pos;
            String Ax;
            String Linha;
            
            String CodCliente;
            int Identificacao;
            String Nome;
            String Sobrenome;
            String Endereco;
            String Telefone;
            int Cidade;
            Date DataNascimento;
            Date DataVenda;
            String Email;

            while((Linha = BR.readLine()) != null) {
                
                //Carregar CodCliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                CodCliente = Ax;            
                Linha = Linha.substring(pos +1);
                
                
                //Carregar DIdentificação do Cliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                Identificacao = new Integer (Ax);            
                Linha = Linha.substring(pos +1);
                
                
                //Carregar Nome do cliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                Nome = Ax;            
                Linha = Linha.substring(pos +1);
                
                
                //Carregar Sobrenome do cliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                Sobrenome = Ax;            
                Linha = Linha.substring(pos +1);
                
                
                //Carregar Endereço do cliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                Endereco = Ax;            
                Linha = Linha.substring(pos +1); 
                
                //Carregar telefone do cliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                Telefone = Ax;            
                Linha = Linha.substring(pos +1);
              
                
                //Carregar cidade
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                Cidade = new Integer (Ax);            
                Linha = Linha.substring(pos +1); 
                
                
                //Carregar Data de nascimento do cliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                DataNascimento = Utilidades.StringToDate(Ax);            
                Linha = Linha.substring(pos +1); 
                DataVenda = Utilidades.StringToDate(Ax);          
 
                
                //Carregar email do cliente
                pos = Linha.indexOf("-");
                Ax = Linha.substring(0,pos);
                Email = Ax;            
                Linha = Linha.substring(pos +1);
                
                
                Cliente SalvaCliente;
                SalvaCliente = new Cliente(CodCliente, Identificacao, Nome, Sobrenome, 
                Endereco, Telefone, Cidade, DataNascimento, DataVenda, Email);
                VetCliente[ContadorClientes] = SalvaCliente;
                ContadorClientes ++;                      
                
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
            
        }finally{
            
            try {
                if(FR != null){
                    FR.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
   
}