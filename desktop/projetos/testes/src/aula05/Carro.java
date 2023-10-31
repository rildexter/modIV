package aula05;

public class Carro {
    // Construtor padrão
    public Carro(Carro_n carro_n) {
        // Inicializa o objeto
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    // Construtor parametrizado
    public Carro(String marca, String modelo, int ano) {
        // Inicializa o objeto com valores passados como parâmetros
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Atributos da classe
    private String marca;
    private String modelo;
    private int ano;
}


