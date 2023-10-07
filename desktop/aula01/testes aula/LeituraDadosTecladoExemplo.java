import java.util.Scanner;

public class LeituraDadosTecladoExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("Número digitado: " + numero);
    }
}