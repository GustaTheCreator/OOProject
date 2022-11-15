import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class UserInterface{

    public void menu(){
        JFrame frame = new JFrame();
        frame.setTitle("StarThrive");
        frame.setSize(720, 720);
        frame.getContentPane().setBackground(new Color(255,255,255));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints posicao = new GridBagConstraints();


        JLabel text = new JLabel("St★rThrive");
        text.setFont(new Font(text.getFont().getFontName(), Font.BOLD, 100));
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,40,0);
        frame.add(text, posicao);

        JButton botao = new JButton("Consultar informção");
        personaliza(botao);
        posicao.insets = new Insets(10,10,10,10);
        posicao.gridx = 0;
        posicao.gridy = 1;
        frame.add(botao, posicao);

        botao = new JButton("Gerir base de dados");
        personaliza(botao);
        posicao.gridx = 0;
        posicao.gridy = 2;
        frame.add(botao, posicao);

        botao = new JButton("Terminar Sessão");
        personaliza(botao);
        posicao.gridx = 0;
        posicao.gridy = 3;
        frame.add(botao, posicao);

        frame.setVisible(true);
    }

    private void personaliza(JButton botao){
        Color cor = new Color(55,55,55);
        botao.setForeground(Color.WHITE);
        botao.setPreferredSize(new Dimension(300, 50));
        botao.setFont(new Font(botao.getFont().getFontName(), Font.BOLD, 16));
        botao.setBackground(cor);
        botao.setFocusPainted(false);
        Border line = new LineBorder(cor);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        botao.setBorder(compound);
    }
}

