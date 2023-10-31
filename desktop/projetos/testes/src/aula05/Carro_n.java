package aula05;

public class Carro_n {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor de cópia
    public Carro_n(Carro_n outroCarro) {
        // Inicializa o objeto com os valores do outroCarro
        this.marca = outroCarro.marca;
        this.modelo = outroCarro.modelo;
        this.ano = outroCarro.ano;
    }
    // Método para clonar um carro
    public Carro clonar() {
        return new Carro(this); // Usa o construtor de cópia para criar uma cópia
    }
}

