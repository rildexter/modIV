package aula07;
//ligada a diretor e cliente
public class Funcionario {
    private String nome;
    private double salarioBase;
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
        return salarioBase;
    }
    
    public String getNome() {
        return nome;
    }
}
