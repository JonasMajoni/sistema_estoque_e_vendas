package Classes;


public class Opcao {
    private String Valor;
    private String Descricao;

    
    public Opcao(String Valor, String Descricao) {
        this.Valor = Valor;
        this.Descricao = Descricao;
    }
    

    public String getValor() {
        return Valor;
    }

    public String getDescricao() {
        return Descricao;
    }

    @Override
    public String toString() {
        return Descricao;
    }  
    
}
