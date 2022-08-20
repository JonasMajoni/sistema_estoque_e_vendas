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
       
   
    public int NumeroDeClientes(){
        return ContadorClientes;
    }
       
    public Cliente[] getClientes(){
        return VetCliente;
    }    
   
    
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
    
}