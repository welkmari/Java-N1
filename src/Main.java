import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //cria o leitor do terminal
        Scanner entrada = new Scanner(System.in);

        int g;
        System.out.print("Digite um valor para 'g':");
        //le o valor digitado e armazena em "g"
        g = entrada.nextInt();

        System.out.println("O valor de 'g' é:" + g);

    }
}

