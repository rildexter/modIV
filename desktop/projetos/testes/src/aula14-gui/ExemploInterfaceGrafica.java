import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploInterfaceGrafica extends JFrame {

    private JLabel rotulo;
    private JTextField campoTexto;

    public ExemploInterfaceGrafica() {
        setTitle("Exemplo de Interface Gráfica");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criação do rótulo
        rotulo = new JLabel("Digite alguma coisa:");
        add(rotulo);

        // Criação do campo de texto
        campoTexto = new JTextField(20);
        add(campoTexto);

        // Criação do botão
        JButton botao = new JButton("Clique Aqui");
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = campoTexto.getText();
                JOptionPane.showMessageDialog(ExemploInterfaceGrafica.this, "Você digitou: "
                 + textoDigitado);
            }
        });
        add(botao);

        // Layout usando FlowLayout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExemploInterfaceGrafica exemplo = new ExemploInterfaceGrafica();
            exemplo.setVisible(true);
        });
    }
}

