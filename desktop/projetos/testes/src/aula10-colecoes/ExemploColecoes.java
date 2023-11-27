import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExemploColecoes {

    public static void main(String[] args) {
        // Criando uma lista de produtos usando ArrayList
        List<String> listaProdutos = new ArrayList<>();
        listaProdutos.add("Camiseta");
        listaProdutos.add("Calça");
        listaProdutos.add("Tênis");
        listaProdutos.add("Boné");

        System.out.println("Lista de Produtos:");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println((i + 1) + ". " + listaProdutos.get(i));
        }

        // Criando um mapa para associar códigos aos produtos usando HashMap
        Map<Integer, String> codigoParaProduto = new HashMap<>();
        codigoParaProduto.put(101, "Camiseta");
        codigoParaProduto.put(102, "Calça");
        codigoParaProduto.put(103, "Tênis");
        codigoParaProduto.put(104, "Boné");

        // Exibindo opções de código para o usuário
        System.out.println("\nOpções de Código:");
        for (int codigo : codigoParaProduto.keySet()) {
            System.out.println(codigo);
        }

        // Solicitando que o usuário digite o código desejado
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o código do produto desejado: ");
        int codigoDesejado = scanner.nextInt();

        // Verificando se o código está no mapa
        if (codigoParaProduto.containsKey(codigoDesejado)) {
            String produtoDesejado = codigoParaProduto.get(codigoDesejado);
            System.out.println("Produto com código " + codigoDesejado + ": " + produtoDesejado);
        } else {
            System.out.println("Código inválido. Produto não encontrado.");
        }
    }
}
