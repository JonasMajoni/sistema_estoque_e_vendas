package Classes;

import java.util.Date;



public class Cliente {
    private Integer CodCliente;
    private String NumeroRegistro;
    private String Nome;
    private String Sobrenome;
    private String Endereco;
    private String Telefone;
    private int Cidade;
    private Date DataNascimento;
    private Date DataRegistro;
    private String Email;
    
    public String getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(String NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }
    
    
    public Integer getCodCliente() {
        return CodCliente;
    }

    public void setCodCliente(Integer CodCliente) {
        this.CodCliente = CodCliente;
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

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getCidade() {
        return Cidade;
    }

    public void setCidade(int Cidade) {
        this.Cidade = Cidade;
    }

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public Date getDataRegistro() {
        return DataRegistro;
    }

    public void setDataRegistro(Date DataRegistro) {
        this.DataRegistro = DataRegistro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


}
