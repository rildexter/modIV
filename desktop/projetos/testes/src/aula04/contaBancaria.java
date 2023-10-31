package aula04;
//public class contaBancaria {
// Exemplo de acesso controlado a dados em Java
class contaBancaria {
    private double saldo;
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    } 
    public double getSaldo() {
        return saldo;
    }
}

