import java.util.Scanner;

public class ExemploTryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir dois números
        System.out.print("Digite o numerador: ");
        int numerador = scanner.nextInt();

        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();

        try {
            // Dentro do bloco try, tentamos realizar a divisão
            int resultado = dividir(numerador, denominador);
            
            // Se a divisão for bem-sucedida, exibimos o resultado
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            // Se ocorrer uma exceção de divisão por zero, capturamos e tratamos aqui
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // O bloco finally é opcional e será sempre executado, independentemente de ocorrer uma exceção ou não
            System.out.println("Finalizando o programa.");
            scanner.close(); // Certificando-se de fechar o Scanner para evitar vazamento de recursos
        }
    }

    // Método para realizar a divisão e lançar uma exceção se denominador for zero
    private static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            // Lançando uma exceção de divisão por zero se o denominador for zero
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }
}

