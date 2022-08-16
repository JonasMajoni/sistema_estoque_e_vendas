package Classes;

import java.util.Date;

public class Usuario {
    //Salvar os usuarios recebidos.
    private String NomeLogin;
    private String Nome;
    private String Sobrenome;
    private String Senha;
    private String ConfirmarSenha; 
    private int Perfil;
    private String Situacao;
    private Date Dt_inicio;
    private Date Dt_fim;
    

    //GEREI GETTER E SETTER

    public String getNomeLogin() {
        return NomeLogin;
    }

    public void setNomeLogin(String NomeLogin) {
        this.NomeLogin = NomeLogin;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getConfirmarSenha() {
        return ConfirmarSenha;
    }

    public void setConfirmarSenha(String ConfirmarSenha) {
        this.ConfirmarSenha = ConfirmarSenha;
    }

    public int getPerfil() {
        return Perfil;
    }

    public void setPerfil(int Perfil) {
        this.Perfil = Perfil;
    }

    
    
    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situacao) {
        this.Situacao = Situacao;
    }

    
    
    public Date getDt_inicio() {
        return Dt_inicio;
    }

    public void setDt_inicio(Date Dt_inicio) {
        this.Dt_inicio = Dt_inicio;
    }

    public Date getDt_fim() {
        return Dt_fim;
    }

    public void setDt_fim(Date Dt_fim) {
        this.Dt_fim = Dt_fim;
    }

    
}