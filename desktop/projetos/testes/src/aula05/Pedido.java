package aula05;

public class Pedido {
    private int numeroPedido;
    private String descricao;
    private double valor;

    // Construtor parametrizado
    public Pedido(int numeroPedido, String descricao, double valor) {
        this.numeroPedido = numeroPedido;
        this.descricao = descricao;
        this.valor = valor;
    }

    // Método para calcular desconto
    public double calcularDesconto(double percentagem) {
        return valor * (percentagem / 100);
    }

    // Outros métodos e atributos da classe...
}

