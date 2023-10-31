package aula04;
import java.util.ArrayList;

public class cad_Total {
    public static void main(String[] args) {
        ArrayList<Disciplina> disciplinasCadastradas = new ArrayList<>();

        while (true) {
            // Solicita ao usuário que insira o nome do professor
            System.out.print("Digite o nome do professor: ");
            String nomeProfessor = System.console().readLine();

            // Cria um objeto Professor com o nome fornecido pelo usuário
            Professor professor = new Professor(nomeProfessor);

            // Solicita ao usuário que insira o nome da disciplina
            System.out.print("Digite o nome da disciplina: ");
            String nomeDisciplina = System.console().readLine();

            // Cria um objeto Disciplina com o nome fornecido pelo usuário e o professor criado anteriormente
            Disciplina disciplina = new Disciplina(nomeDisciplina, professor);

            // Adiciona a disciplina à lista de disciplinas cadastradas
            disciplinasCadastradas.add(disciplina);

            // Mostra os detalhes da disciplina na tela
            System.out.println("Detalhes da Disciplina:");
            System.out.println("Nome da Disciplina: " + disciplina.getNome());
            System.out.println("Professor Responsável: " + disciplina.getProfessorResponsavel().getNome());

            // Pergunta ao usuário se deseja cadastrar outra disciplina
            System.out.print("Deseja cadastrar outra disciplina? (S/N): ");
            String resposta = System.console().readLine();

            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        }

        // Mostra as disciplinas cadastradas
        System.out.println("\nDisciplinas Cadastradas:");
        for (Disciplina disciplina : disciplinasCadastradas) {
            System.out.println("Nome da Disciplina: " + disciplina.getNome());
            System.out.println("Professor Responsável: " + disciplina.getProfessorResponsavel().getNome());
            System.out.println();
        }
    }
}

