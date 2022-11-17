package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class UserInterface{

    public void menu(){
        JFrame frame = new JFrame();
    private JFrame frame;
    private JLabel textoTitulo;
    private JButton botaoConsultar;
    private JButton botaoGerir;
    private JButton botaoSair;

    public UserInterface(){
        frame = new JFrame();
        frame.setTitle("StarThrive");
        frame.setSize(720, 720);
        frame.getContentPane().setBackground(new Color(255,255,255));
@ -13,48 +20,74 @@ public class UserInterface{
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints posicao = new GridBagConstraints();
        ButtonListener buttonActionListener = new ButtonListener();

        // criar cores e modelos personalizados para toda a interface através do UIManager
        Color cinza = new Color(55,55,55);
        Color cyan =  new Color(118,221,221);
        UIManager.put("OptionPane.background",Color.WHITE);
        UIManager.put("Panel.background",Color.WHITE);
        UIManager.put("Button.foreground",Color.WHITE);
        UIManager.put("Button.preferredSize",new Dimension(300, 50));
        UIManager.put("Button.font",new Font("Arial", Font.BOLD, 16));
        UIManager.put("Button.background",cinza);
        UIManager.put("Button.focus", new Color(0, 0, 0, 0));
        UIManager.put("Button.border",new CompoundBorder(new LineBorder(cinza), new EmptyBorder(5, 15, 5, 15)));
        UIManager.put("Button.select", cyan);
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        UIManager.put("OptionPane.cancelButtonText","Cancelar");
        UIManager.put("OptionPane.questionIcon",new ImageIcon("question.gif")); // os gifs perderam alguma qualidade ao ser
        UIManager.put("OptionPane.warningIcon",new ImageIcon("warning.gif")); // resized, talvez procurar outros
        UIManager.put("OptionPane.errorIcon",new ImageIcon("error.gif"));


        JLabel text = new JLabel("St★rThrive");
        text.setFont(new Font(text.getFont().getFontName(), Font.BOLD, 100));
        textoTitulo = new JLabel("<html>St<FONT COLOR=rgb(118,221,221)>★</FONT>rThrive</html>");
        textoTitulo.setFont(new Font(textoTitulo.getFont().getFontName(), Font.BOLD, 100));
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,40,0);
        frame.add(text, posicao);
        textoTitulo.addMouseListener(new MouseAdapter()
        {
            private int clicks=0;
            public void mouseClicked(MouseEvent e)
            {
                this.clicks+=1;
                if(clicks==2) //clicar duas vezes no textoTitulo do menu?
                    textoTitulo.setText("<html>St<img src=" + getClass().getResource("star.gif").toString() + "></FONT>rThrive</html>");
            }
        });
        frame.add(textoTitulo, posicao);

        JButton botao = new JButton("Consultar informção");
        personaliza(botao);
        posicao.insets = new Insets(10,10,10,10);
        botaoConsultar = new JButton("Consultar informção");
        posicao.gridx = 0;
        posicao.gridy = 1;
        frame.add(botao, posicao);
        posicao.insets = new Insets(10,10,10,10);
        frame.add(botaoConsultar, posicao);

        botao = new JButton("Gerir base de dados");
        personaliza(botao);
        botaoGerir = new JButton("Gerir base de dados");
        posicao.gridx = 0;
        posicao.gridy = 2;
        frame.add(botao, posicao);
        frame.add(botaoGerir, posicao);

        botao = new JButton("Terminar Sessão");
        personaliza(botao);
        botaoSair = new JButton("Terminar Sessão");
        posicao.gridx = 0;
        posicao.gridy = 3;
        frame.add(botao, posicao);
        botaoSair.addActionListener(buttonActionListener);
        frame.add(botaoSair, posicao);

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
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == botaoSair) {
                if(JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair?", null, JOptionPane.YES_NO_OPTION) == 0){
                    System.exit(0);
                }
            }
        }
    }

}
