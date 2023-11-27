import java.util.*;

/**
 * Importação do pacote java.util.*, que inclui classes relacionadas a utilidades
 * e estruturas de dados, como List, ArrayList, Scanner, entre outras. O uso de * 
 * significa que estamos importando todas as classes do pacote java.util.
 */
public class ToDoListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma lista de tarefas usando ArrayList
        List<String> toDoList = new ArrayList<>();

        // Solicitando ao usuário que adicione tarefas
        System.out.println("Bem-vindo ao Gerenciador de Tarefas!");

        while (true) {
            // Pedindo ao usuário que digite uma nova tarefa
            System.out.print("Digite uma nova tarefa (ou 'sair' para encerrar): ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("sair")) {
                // Se o usuário digitar 'sair', encerramos o loop
                break;
            }

            // Adicionando a tarefa à lista
            toDoList.add(userInput);

            // Exibindo a lista de tarefas atualizada
            System.out.println("\nSua Lista de Tarefas Atualizada:");
            printTasks(toDoList);

            // Perguntando se o usuário deseja adicionar mais tarefas
            System.out.print("\nDeseja adicionar mais tarefas? (Digite 'sim' ou 'sair'): ");
            String continueInput = scanner.nextLine();

            if (continueInput.equalsIgnoreCase("sair")) {
                // Se o usuário digitar 'sair', encerramos o loop
                break;
            }
        }

        // Exibindo a lista final de tarefas
        System.out.println("\nSua Lista de Tarefas Final:");
        printTasks(toDoList);

        // Restante do código mantido para manter as funcionalidades originais
        // ...

        scanner.close();
    }

    // Método auxiliar para imprimir as tarefas
    private static void printTasks(List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

