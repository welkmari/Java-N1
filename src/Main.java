import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do objeto café
        Cafe meuCafe = new Cafe();

        meuCafe.quantidade = 350;
        meuCafe.tamanho ="Médio";
        meuCafe.preco = 4.50;
        meuCafe.consumo = 10;
        meuCafe.tipo = "gelado";

        // Usando os métodos
        meuCafe.preparar();
        meuCafe.servir();
    }
}

