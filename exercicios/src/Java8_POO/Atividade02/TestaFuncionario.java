package Java8_POO.Atividade02;

import java.util.Scanner;

public class TestaFuncionario {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario("Edson", "Desenvolvedor", "Meli Developers", 780123,5000.00 );

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
