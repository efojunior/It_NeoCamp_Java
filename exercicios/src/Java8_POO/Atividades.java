// Questão 01 - Class

package Java8_POO;

import java.util.Scanner;

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

// Questão 01 - Teste

package Java8_POO.Atividade01;

        import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Java8_POO.Atividade01.Cliente cliente1 = new Java8_POO.Atividade01.Cliente();
        Java8_POO.Atividade01.Cliente cliente2 = new Java8_POO.Atividade01.Cliente();
        System.out.println("Digite o nome do cliente: ");
        cliente1.setNome(leia.nextLine());
        System.out.printf("Digite o produto escolhido pelo cliente %s: \n", cliente1.getNome());
        cliente1.setProduto((leia.nextLine()));
        System.out.printf("Digite o valor unitário do produto s% em Reais: \n", cliente1.getProduto());
        cliente1.setValorUnitario(leia.nextDouble());
        System.out.printf("Quantas unidades do %s, foram compradas pelo cliente %s? \n", cliente1.getProduto(), cliente1.getNome());
        cliente1.setUnidade(leia.nextInt());
        cliente1.setValorTotal();
        cliente1.verificar();
        cliente2.verificar();

    }
}

//Questão 02 - Classe

package Java8_POO.Atividade02;

public class Funcionario {

    String nome, cargo, empresa;
    int matricula;
    double salario;

    public void verificar(){
        System.out.printf("Funcionário: %s.", this.getNome());
        System.out.printf("Cargo: %s.", this.getCargo());
        System.out.printf("Empresa: %s", this.getEmpresa());
        System.out.printf("Salário R$%.2f", this.getSalario());
        System.out.printf("Matricula: %d", this.getMatricula());
    }

    public Funcionario(String nome, String cargo, String empresa, int matricula, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.empresa = empresa;
        this.matricula = matricula;
        this.salario = salario;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Questão 02 - Teste

package Java8_POO.Atividade02;

        import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Java8_POO.Atividade02.Funcionario funcionario1 = new Java8_POO.Atividade02.Funcionario();
        Java8_POO.Atividade02.Funcionario funcionario2 = new Java8_POO.Atividade02.Funcionario("Edson", "Desenvolvedor", "Meli Developers", 780123,5000.00 );

        System.out.println("Digite o nome do Funcionário: \n");
        funcionario1.setNome(leia.nextLine());
        System.out.printf("Digite o cargo do funcionário %s: \n", funcionario1.getNome());
        funcionario1.setCargo(leia.nextLine());
        System.out.printf("Digite a empresa do funcionário %s: \n", funcionario1.getNome());
        funcionario1.setEmpresa(leia.nextLine());
        System.out.printf("Digite o matrícula do funcionário %s: \n", funcionario1.getNome());
        funcionario1.setMatricula(leia.nextInt());
        System.out.printf("Digite a salario do funcionário %s: \n", funcionario1.getNome());
        funcionario1.setSalario(leia.nextFloat());
        funcionario1.verificar();
        funcionario2.verificar();
    }
}

//Questão 03 - Classe

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

//Questão 03 - Teste

package Java8_POO.Atividade03;

public class TesteProduto {

    public static void main(String[] args){

        Java8_POO.Atividade03.Produto produto1 = new Java8_POO.Atividade03.Produto("The Last of Us", "Playstation", "Ação e Aventura", 250.00, 007543);
        Java8_POO.Atividade03.Produto produto2 = new Java8_POO.Atividade03.Produto("Gran Turismo 7", "Playstation", "Corrida", 250.00, 065321);
        produto1.verificar();
        produto2.verificar();
    }
}