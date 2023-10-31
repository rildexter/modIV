package aula04;

public class cad_prof {
        public static void main(String[] args) {
            Professor professor = new Professor("João");
            Disciplina disciplina = new Disciplina("Matemática", professor);
    
            System.out.println("Disciplina: " + disciplina.getNome());
            System.out.println("Professor Responsável: " + disciplina.getProfessorResponsavel().getNome());
        }
    }
    
    class Professor {
        private String nome;
    
        public Professor(String nome) {
            this.nome = nome;
        }
    
        public String getNome() {
            return nome;
        }
    }
    
    class Disciplina {
        private String nome;
        private Professor professorResponsavel;
    
        public Disciplina(String nome, Professor professor) {
            this.nome = nome;
            this.professorResponsavel = professor;
        }
    
        public String getNome() {
            return nome;
        }
    
        public Professor getProfessorResponsavel() {
            return professorResponsavel;
        }
    }
    
