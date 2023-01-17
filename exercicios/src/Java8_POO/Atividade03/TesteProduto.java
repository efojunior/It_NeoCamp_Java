package Java8_POO.Atividade03;

public class TesteProduto {

    public static void main(String[] args){

        Produto produto1 = new Produto("The Last of Us", "Playstation", "Ação e Aventura", 250.00, 007543);
        Produto produto2 = new Produto("Gran Turismo 7", "Playstation", "Corrida", 250.00, 065321);
        produto1.verificar();
        produto2.verificar();
    }
}
