import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploCheckboxRadio extends JFrame {

    private JCheckBox checkBox;
    private JRadioButton radioBotao1;
    private JRadioButton radioBotao2;
    private ButtonGroup grupoBotoes;

    public ExemploCheckboxRadio() {
        setTitle("Exemplo de Checkbox e Radio");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criar CheckBox
        checkBox = new JCheckBox("Habilitar recurso");
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean habilitado = checkBox.isSelected();
                JOptionPane.showMessageDialog(ExemploCheckboxRadio.this, 
                "Recurso habilitado: " + habilitado);
            }
        });
        add(checkBox);

        // Criar RadioButtons
        radioBotao1 = new JRadioButton("Opção 1");
        radioBotao2 = new JRadioButton("Opção 2");

        // Agrupar RadioButtons usando ButtonGroup
        grupoBotoes = new ButtonGroup();
        grupoBotoes.add(radioBotao1);
        grupoBotoes.add(radioBotao2);

        // Adicionar ActionListener aos RadioButtons
        ActionListener radioListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ExemploCheckboxRadio.this, 
                "Opção selecionada: " + ((JRadioButton) e.getSource()).getText());
            }
        };

        radioBotao1.addActionListener(radioListener);
        radioBotao2.addActionListener(radioListener);

        // Adicionar RadioButtons ao JFrame
        add(radioBotao1);
        add(radioBotao2);

        // Layout usando BoxLayout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExemploCheckboxRadio exemplo = new ExemploCheckboxRadio();
            exemplo.setVisible(true);
        });
    }
}
