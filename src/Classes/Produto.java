package Classes;

public class Produto {

    private Integer CodProduto;
    private String Descricao;
    private Double preco;
    private int taxa;
    private String obs;

    public Integer getCodProduto() {
        return CodProduto;
    }

    public void setCodProduto(Integer CodProduto) {
        this.CodProduto = CodProduto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }


}
