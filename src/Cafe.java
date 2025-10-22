public class Cafe {
    //atributos são Características do Café

    String tipo;
    String tamanho;
    double preco;

    //inicializa o objeto
    public Cafe(String tipo, String tamanho, double preco){
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    //métodos = São as ações do Café

    public void preparar(){
        System.out.println("Preparando um café" + tipo + "tamanho" + tamanho + "...");

    }
    public void servir(){
        System.out.println("Servindo o café. Valor: R$" +preco);
    }


}
