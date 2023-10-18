public class Letras {
    public static void main(String[] args) {
        // Vetor para armazenar letras
        char[] letras = {'A', 'B', 'C', 'D', 'E'};
        
        // Imprimir as letras e suas posições no vetor
        System.out.println("Letras armazenadas no vetor:");
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Posição " + i + ": Letra: " + letras[i]);
        }
    }
}
