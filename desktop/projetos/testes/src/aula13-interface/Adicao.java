import javax.swing.JOptionPane;

public class Adicao{
    public static void main(String[] args) {
        String firstNumber;
        String secondNumber;
        int number1;
        int number2;
        int sum;

     firstNumber = 
     JOptionPane.showInputDialog("Digite o Primeiro Número:");
     secondNumber = 
     JOptionPane.showInputDialog("Digite o Segundo Número:");

    number1= Integer.parseInt(firstNumber);
    number2= Integer.parseInt(secondNumber);
    sum=number1+number2;

    JOptionPane.showMessageDialog
    (null,"A soma será "+sum, 
    "Resultado",JOptionPane.PLAIN_MESSAGE);
    System.exit(0);
    }
}