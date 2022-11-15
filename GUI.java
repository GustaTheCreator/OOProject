import javax.swing.*;

public class GUI {
    public void mainMenu()
    {
    JFrame frame = new JFrame();
    frame.setTitle("Painel AbsoluteLayout");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Valor");
    label.setBounds(50, 50, 100, 25);
    JTextField text = new JTextField(10);
    text.setBounds(50, 75, 200, 25);
    JButton button = new JButton("Calcular");
    button.setBounds(50, 110, 100, 25);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.add(label);
    panel.add(text);
    panel.add(button);
    frame.add(panel);
    frame.setVisible(true);
    }
}
