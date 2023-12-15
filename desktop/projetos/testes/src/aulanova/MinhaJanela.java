package aulanova;
import javax.swing.*;

public class MinhaJanela extends JFrame{
public MinhaJanela(){
  setTitle("Minha Janela");
  setSize(400, 300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  JLabel rotulo= new JLabel("Bem-vindo!");
  add(rotulo);
  setLayout(null);
  rotulo.setBounds(5, 5, 300, 20);
}
public static void main(String[] args){
  SwingUtilities.invokeLater(() ->{
    MinhaJanela minhaJanela = new MinhaJanela();
    minhaJanela.setVisible(true);
  }
  );
}
}