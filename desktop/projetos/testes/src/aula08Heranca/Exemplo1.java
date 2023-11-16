package aula08Heranca;

// Superclasse
class Animal {
    String tipo;

    Animal(String tipo) {
        this.tipo = tipo;
    }

    void emitirSom() {
        System.out.println("Som do animal");
    }
}

// Subclasse
class Cachorro extends Animal {
    Cachorro(String tipo) {
        super(tipo);
    }

    // Outros métodos específicos de Cachorro, se houver...
}

public class Exemplo1 {
    public static void main(String[] args) {
        // Criar uma instância de Cachorro
        Cachorro cachorro = new Cachorro("Doméstico");

        // Chamada para o método emitirSom()
        cachorro.emitirSom();
    }
}

