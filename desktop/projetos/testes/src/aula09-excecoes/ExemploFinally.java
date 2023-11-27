import java.io.FileWriter;
import java.io.IOException;

public class ExemploFinally {

    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            // Tentativa de abrir um arquivo para escrita
            fileWriter = new FileWriter("exemplo.txt");
            fileWriter.write("Conteúdo de exemplo.");

            // Simulando uma exceção
            if (true) {
                throw new IOException("Erro simulado");
            }

        } catch (IOException e) {
            // Tratamento da exceção de IO
            System.out.println("Erro de IO: " + e.getMessage());
        } finally {
            // Bloco finally para garantir que o recurso seja fechado, mesmo em caso de exceção
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }

            System.out.println("Bloco finally executado.");
        }

        System.out.println("Programa continua após o bloco finally.");
    }
}

