package aula07;
//ligada a diretor e cliente
public class Diretor extends Funcionario {
    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 2; // Exemplo simples, dobrando o salário.
    }
}
