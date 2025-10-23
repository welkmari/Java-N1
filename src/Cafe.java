public class Cafe {
    //atributos são Características do Café

    String tipo;
    String tamanho;
    double preco;
    int quantidade;
    int consumo;

    //métodos = São as ações do Café

    public void preparar(){
        System.out.println("Preparando um café" + this.tipo + "tamanho" + this.tamanho + "...");
        System.out.print("Quantidade atual:" + this.quantidade);

    }
    public void servir(){
        System.out.println("Servindo o café. Valor: R$" +this.preco);
    }

    public void diminuirQuantidade(){
        System.out.println("A quantidade de café é de:" + (this.quantidade - this.consumo));
    }
}
