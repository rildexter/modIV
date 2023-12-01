import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends 
JFrame implements ActionListener{
    private JTextField display;
    private JButton[] buttons;

    private double num1, num2, resultado;
    private String operacao;

   public CalculadoraGUI(){
    setTitle("Calculadora");
    setSize(300,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    display = new JTextField();
    display.setEditable(false);
    add(display, BorderLayout.NORTH);

    buttons = new JButton[16];
    String[] buttonText = {"7","8","9","/","4","5","6","*",
"1","2","3","-","0",".","=","+"};

JPanel buttonPanel = new JPanel(new GridLayout(4,4));

for(int i=0; i < 16; i++){
    buttons[i] = new JButton(buttonText[i]);
    buttons[i].setPreferredSize(new Dimension(50,50));
    buttons[i].addActionListener(this);
    buttonPanel.add(buttons[i]);
}
add(buttonPanel, BorderLayout.CENTER);
   } 
    public static void main(String[] args) {
        
    }
}