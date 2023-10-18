import java.util.Scanner;

public class ArmazenaFrutas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] matrizFrutas = new String[5][2]; // Cria uma matriz de 5 linhas e 2 colunas.
        int posicao = 0;

        System.out.println("Digite frutas e suas cores (ou '0' para sair):");

        while (posicao < 5) {
            System.out.print("Digite uma fruta: ");
            String fruta = input.nextLine();

            if (fruta.equals("0")) {
                break;
            }

            System.out.print("Digite a cor da fruta: ");
            String cor = input.nextLine();

            matrizFrutas[posicao][0] = fruta; // Armazena a fruta na coluna 0.
            matrizFrutas[posicao][1] = cor;   // Armazena a cor na coluna 1.

            System.out.println("Fruta: " + fruta + ", Cor: " + cor + " armazenadas na posição " + posicao);

            posicao++;
        }

        if (posicao == 5) {
            System.out.println("Matriz cheia. Não é possível adicionar mais frutas.");
            System.out.println("Frutas e cores armazenadas:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Posição " + i + ": Fruta: " + matrizFrutas[i][0] + ", Cor: " + matrizFrutas[i][1]);
            }
        }

        input.close();
    }
}

