package aula05;

public class Produto_N {
    private String nome;
    private double preco;

    // Construtor padrão (sem parâmetros)
    public Produto_N() {
        // Inicialização com valores padrão
        this.nome = "Produto sem nome";
        this.preco = 0.0;
    }

    // Construtor parametrizado
    public Produto_N(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Métodos para acessar os atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        // Criando objetos usando construtores
        Produto produtoPadrao = new Produto(); // Construtor padrão
        Produto produtoParametrizado = new Produto("Laptop", 999.99); // Construtor parametrizado

        // Exibindo informações dos produtos
        System.out.println("Produto padrão: " + produtoPadrao.getNome() + ", Preço: " + produtoPadrao.getPreco());
        System.out.println("Produto parametrizado: " + produtoParametrizado.getNome() + ", Preço: " + produtoParametrizado.getPreco());
    }
}

