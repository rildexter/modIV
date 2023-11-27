import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JFrame implements ActionListener {

    private JTextField display;
    private JButton[] buttons;

    private double num1, num2, resultado;
    private String operacao;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
 // Configuração do display
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
// Configuração dos botões
        buttons = new JButton[16];
        String[] buttonText = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        // Criação e configuração dos botões
        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonText[i]);
            buttons[i].setPreferredSize(new Dimension(50, 50)); // Define o tamanho dos botões
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
// Adição dos botões ao painel central
        add(buttonPanel, BorderLayout.CENTER);
    }
    // Método para realizar cálculos
    private void calcular() {
        num2 = Double.parseDouble(display.getText());
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
        }
        display.setText(String.valueOf(resultado));
    }
// Implementação do método da interface ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonText = ((JButton) e.getSource()).getText();
// Tratamento dos eventos dos botões
        if (buttonText.matches("[0-9]")) {
            display.setText(display.getText() + buttonText);
        } else if (buttonText.matches("[+\\-*/=]")) {
            if (num1 == 0) {
                num1 = Double.parseDouble(display.getText());
                operacao = buttonText;
                display.setText("");
            } else {
                calcular();
                operacao = buttonText.equals("=") ? "" : buttonText;
                num1 = resultado;
                display.setText(String.valueOf(resultado)); // Corrige o problema de os números sumirem
            }
        } else if (buttonText.equals(".")) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + buttonText);
            }
        }
    }
    // Método principal para iniciar a aplicação
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraGUI().setVisible(true);
        });
    }
}