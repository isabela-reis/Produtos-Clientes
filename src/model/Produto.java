package model;

public class Produto {

    private String produto = "";
    private int tamanho= 0;
    private String descricao= "";
    private String fornecedor = "";
    private int custo = 0;
    private int venda = 0;
    private int icms = 0;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
    
    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }
    
    public int getIcms() {
        return icms;
    }

    public void setIcms(int icms) {
        this.icms = icms;
    }
    
    public void limpaProduto(){
       
       produto = "";
       tamanho = 0;
       descricao = "";
       fornecedor = "";
       custo= 0;
       venda=0;
       icms=0;
               
    }
}
