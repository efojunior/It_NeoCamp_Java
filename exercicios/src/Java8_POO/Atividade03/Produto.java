package Java8_POO.Atividade03;

public class Produto {

    String produto, plataforma, genero;
    double preco;
    int codigoId;

    public void verificar(){
        System.out.println("Produto: " + this.getProduto());
        System.out.println("Plataforma: " + this.getPlataforma());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("CodigoId: " + this.getCodigoId());
    }

    public Produto(String produto, String plataforma, String genero, double preco, int id) {
        this.produto = produto;
        this.plataforma = plataforma;
        this.genero = genero;
        this.preco = preco;
        this.codigoId = codigoId;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigoId() {
        return codigoId;
    }

    public void setCodigoId(int codigoId) {
        this.codigoId = codigoId;
    }
}
