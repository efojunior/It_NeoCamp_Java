package Java8_POO.Atividade01;

public class Cliente {

    String nome, produto;
    double valorUnitario, valorTotal;
    int unidade;

    public void verificar() {
        System.out.println("Nome do Cliente: " + this.getNome());
        System.out.printf("A compra foi de %d unidades de %s, com valor R$%.2f cada, num total de R$%2f.\n", this.getUnidade(), this.getProduto(), this.getValorUnitario(), this.getValorTotal());

    }

    public Cliente() {
        this.nome = nome;
        this.produto = produto;
        this.valorUnitario = valorUnitario;
        this.unidade = unidade;
        this.valorTotal = this.valorUnitario * this.unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
        this.valorTotal = this.valorUnitario * this.unidade;
    }

    public Object getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
}
