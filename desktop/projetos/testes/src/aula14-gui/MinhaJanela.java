import javax.swing.*;
public class MinhaJanela extends JFrame {
    public MinhaJanela() {
        // Configurações básicas da janela
        setTitle("Minha Janela");
        setSize(400, 300); // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o aplicativo quando a janela é fechada
        setLocationRelativeTo(null); // Centraliza a janela na tela
        // Adiciona um rótulo (label) à janela
        JLabel rotulo = new JLabel("Bem-vindo à minha janela!");
        add(rotulo);
        // Define o layout como nulo para poder posicionar os componentes manualmente
        setLayout(null);
        // Define a posição e o tamanho do rótulo
        rotulo.setBounds(50, 50, 300, 20);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MinhaJanela minhaJanela = new MinhaJanela();
            minhaJanela.setVisible(true);
        });
    }
}
