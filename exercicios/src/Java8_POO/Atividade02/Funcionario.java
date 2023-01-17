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
