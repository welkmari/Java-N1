import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do objeto café
        Cafe meuCafe = new Cafe("Expresso", "Pequeno", 5.50);

        // Usando os métodos
        meuCafe.preparar();
        meuCafe.servir();
    }
}

