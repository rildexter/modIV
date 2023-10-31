package aula04;

public class Disciplina {
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
//vejam agora o cad_prof e depois o cad_total