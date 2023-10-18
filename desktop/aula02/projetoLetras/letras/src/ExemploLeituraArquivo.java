import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraArquivo {
    public static void main(String[] args) {
        try {
            File arquivo = new File("C:\\arquivos\\dados.txt");
            Scanner scanner = new Scanner(arquivo);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println("Linha do arquivo: " + linha);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }
    }
}

