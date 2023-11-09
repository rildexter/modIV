package aula06.projeto;

public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Divisão por zero não é permitida.");
            return Double.NaN; // Valor especial para representar "não é um número"
        }
    }

    public static double calcular(double num1, double num2, char operador) {
        double resultado = 0;

        switch (operador) {
            case Constantes.ADICAO:
                resultado = somar(num1, num2);
                break;
            case Constantes.SUBTRACAO:
                resultado = subtrair(num1, num2);
                break;
            case Constantes.MULTIPLICACAO:
                resultado = multiplicar(num1, num2);
                break;
            case Constantes.DIVISAO:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Operador inválido.");
                break;
        }

        return resultado;
    }
}
