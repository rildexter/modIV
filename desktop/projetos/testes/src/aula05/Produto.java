package aula05;

public class Produto {
    private String nome;
    private double preco;

    // Construtor padrão
    public Produto() {
        // Inicialização com valores padrão
        this.nome = "Produto sem nome";
        this.preco = 0.0;
    }

    // Construtor parametrizado
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return null;
    }

    public String getPreco() {
        return null;
    }

    // Outros métodos e atributos da classe...
}
