import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaDialog extends JDialog {
    public MinhaDialog(JFrame frame, boolean modal) {
        super(frame, modal);
        setTitle("Minha Caixa de Diálogo");
        setSize(300, 200);
        setLocationRelativeTo(frame);

        // Adiciona um rótulo (label) à caixa de diálogo
        JLabel rotulo = new JLabel("Isso é uma caixa de diálogo!");
        add(rotulo, BorderLayout.CENTER);

        // Adiciona um botão para fechar a caixa de diálogo
        JButton fecharBotao = new JButton("Fechar");
        fecharBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a caixa de diálogo ao clicar no botão "Fechar"
            }
        });
        // Adiciona o botão à parte inferior da caixa de diálogo
        add(fecharBotao, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame minhaJanela = new JFrame("Minha Janela Principal");
            minhaJanela.setSize(400, 300);
            minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            minhaJanela.setLocationRelativeTo(null);

            JButton abrirDialogBotao = new JButton("Abrir Caixa de Diálogo");
            abrirDialogBotao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MinhaDialog minhaDialog = new MinhaDialog(minhaJanela, true);
                    minhaDialog.setVisible(true);
                }
            });
            minhaJanela.setLayout(new FlowLayout());
            minhaJanela.add(abrirDialogBotao);
            minhaJanela.setVisible(true);
        });
    }
}
