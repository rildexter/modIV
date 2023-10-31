package aula05;

public class Calculadora {
    // Método para adicionar dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método sobrecarregado para adicionar dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }

    // Método sobrecarregado para concatenar duas strings
    public String somar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Usando métodos sobrecarregados
        int resultadoInt = calculadora.somar(5, 3);
        double resultadoDouble = calculadora.somar(2.5, 3.7);
        String resultadoString = calculadora.somar("Olá, ", "Mundo!");

        // Exibindo os resultados
        System.out.println("Soma Inteira: " + resultadoInt);
        System.out.println("Soma de Ponto Flutuante: " + resultadoDouble);
        System.out.println("Concatenação de Strings: " + resultadoString);
    }
}

