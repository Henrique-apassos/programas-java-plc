public class Produto {
    private String descricao;
    private Integer quantidade;
    private Double valor;

    public Produto(String descricao, Integer quantidade, Double valor){
        this.descricao = descricao ;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Produto(String descricao, Double valor){
        this.descricao = descricao;
        this.valor = valor;
        quantidade = 0;
    }

    public Double GetVal(){
        return this.valor;
    }

    public String GetDescricao(){
        return this.descricao;
    }

    public Integer GetQuantidade(){
        return this.quantidade;
    }

    public void SetDescricao(String desc){
        descricao = desc;
    }

    public void SetValor(Double val){
        valor = val;
    }

    public void SetQuantidade(Integer qnt){
        quantidade = qnt;
    }

    public void Comprar(){
        quantidade = quantidade--;
    }

}
