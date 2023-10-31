package aula03;
import java.util.Scanner;

public class ExemploVariaveisString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira três palavras
        System.out.print("Digite a primeira palavra: ");
        String variavel1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String variavel2 = scanner.nextLine();

        System.out.print("Digite a terceira palavra: ");
        String variavel3 = scanner.nextLine();

        // Inicializando um vetor de Strings
        String[] vetorString = new String[3];

        // Transferindo os valores das variáveis para o vetor
        vetorString[0] = variavel1;
        vetorString[1] = variavel2;
        vetorString[2] = variavel3;

        // Transformando as letras das variáveis em maiúsculas
        variavel1 = variavel1.toUpperCase();
        variavel2 = variavel2.toUpperCase();
        variavel3 = variavel3.toUpperCase();

        // Imprimindo os valores maiúsculos das variáveis
        System.out.println("Valores das variáveis em maiúsculas:");
        System.out.println("Variável 1: " + variavel1);
        System.out.println("Variável 2: " + variavel2);
        System.out.println("Variável 3: " + variavel3);

        // Imprimindo os elementos do vetor de Strings
        System.out.println("Elementos do vetor de Strings:");
        for (String elemento : vetorString) {
            System.out.println(elemento);
        }

        // Contagem do tamanho do vetor
        int tamanhoDoVetor = vetorString.length;

        // Imprimindo o tamanho do vetor
        System.out.println("O vetor é de tamanho: " + tamanhoDoVetor);

        // Fechando o Scanner
        scanner.close();
    }
}

