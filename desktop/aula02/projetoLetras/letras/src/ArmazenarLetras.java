import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário.

public class ArmazenarLetras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] vetorLetras = new char[5]; // Cria um vetor de caracteres com tamanho 5.
        int posicao = 0; // Inicializa a posição do vetor.

        System.out.println("Digite letras para armazenar (ou '0' para sair):");

        while (posicao < 5) { // Enquanto não atingir o limite de 5 letras.
            System.out.print("Digite uma letra: ");
            char letra = input.nextLine().charAt(0); // Lê a letra digitada.

            if (letra == '0') {
                break; // Se o usuário digitar '0', sai do loop.
            }

            vetorLetras[posicao] = letra; // Armazena a letra no vetor na posição atual.
            System.out.println("Letra " + letra + " armazenada na posição " + posicao);

            posicao++; // Avança para a próxima posição do vetor.
        }

        if (posicao == 5) {
            System.out.println("Vetor cheio. Não é possível adicionar mais letras.");
            System.out.println("Letras armazenadas:");
            for (int i = 0; i < 5; i++) {
                System.out.println("Posição " + i + ": " + vetorLetras[i]);
            }
        }

        input.close(); // Fecha o Scanner.
    }
}
