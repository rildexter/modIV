import javax.swing.JOptionPane;

public class Adicao {
    public static void main(String args[]) {
        String firstNumber; // primeira string digitada pelo usuário
        String secondNumber; // segunda string digitada pelo usuário
        int number1; // primeiro número
        int number2; // segundo número
        int sum; // soma

        // lê o primeiro número como uma string
        firstNumber = JOptionPane.showInputDialog("Digite o primeiro numero:");

        // lê o segundo número como uma string
        secondNumber = JOptionPane.showInputDialog("Digite o segundo numero:");

        // converte os números de String para int
        number1 = Integer.parseInt(firstNumber);
        number2 = Integer.parseInt(secondNumber);

        // adiciona os números
        sum = number1 + number2;

        // mostra o resultado
        JOptionPane.showMessageDialog(null, "A soma sera " + sum, "Resultado", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}

