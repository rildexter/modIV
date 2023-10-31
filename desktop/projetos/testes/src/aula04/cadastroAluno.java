package aula04;
// Exemplo de instância de objetos
public class cadastroAluno {
    public static void main(String[] args) {
        //Buscamos aqui lá na classe aluno 
        aluno aluno1 = new aluno();
        aluno aluno2 = new aluno();
        
        aluno1.nome = "João";
        aluno2.nome = "Maria";
        
        aluno1.estudar();
        aluno2.estudar();
    }
}


