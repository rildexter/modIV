package aula04;
// Exemplo de encapsulamento e reutilização de código
public class Pessoa {
    private String nome;// Atributo privado
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {// Método público para acessar o nome
        return nome;
    }
    public void setNome(String novoNome) { // Método público para modificar o nome
        nome = novoNome;
    }
    public int getIdade() {
        return idade;
    }
//momento de adição de metodos
    /*public void fazerAniversario() {
        idade++;
    }
    
    public void cumprimentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }*/ 
}


