import javax.swing.*;
public class Hello {
public static void main(String[] args) {
JFrame frame = new JFrame("HelloWorldSwing");
final JLabel label = new JLabel("Hello World");
frame.getContentPane().add(label);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);
}
}