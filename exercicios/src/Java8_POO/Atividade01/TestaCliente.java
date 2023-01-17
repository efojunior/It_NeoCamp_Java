package Java8_POO.Atividade01;

import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
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
