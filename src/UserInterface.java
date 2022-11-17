package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class UserInterface{
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
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(new GridBagLayout());
        frame.setIconImage(new ImageIcon("src/resources/icon.png").getImage());
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
        UIManager.put("OptionPane.questionIcon",new ImageIcon("src/resources/question.gif")); // os gifs perderam alguma qualidade ao ser
        UIManager.put("OptionPane.warningIcon",new ImageIcon("src/resources/resources/warning.gif")); // resized, talvez procurar outros
        UIManager.put("OptionPane.errorIcon",new ImageIcon("src/resources/error.gif"));

        textoTitulo = new JLabel("<html>St<FONT COLOR=rgb(118,221,221)>★</FONT>rThrive</html>");
        textoTitulo.setFont(new Font(textoTitulo.getFont().getFontName(), Font.BOLD, 100));
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,40,0);
        textoTitulo.addMouseListener(new MouseAdapter()
        {
            private int clicks=0;
            public void mouseClicked(MouseEvent e)
            {
                this.clicks+=1;
                if(clicks==2) //clicar duas vezes no textoTitulo do menu?
                    textoTitulo.setText("<html>St<img src=" + getClass().getResource("resources/star.gif").toString() + "></FONT>rThrive</html>");
            }
        });

        frame.add(textoTitulo, posicao);
        botaoConsultar = new JButton("Consultar informção");
        posicao.gridx = 0;
        posicao.gridy = 1;
        posicao.insets = new Insets(10,10,10,10);
        frame.add(botaoConsultar, posicao);
        botaoGerir = new JButton("Gerir base de dados");
        posicao.gridx = 0;
        posicao.gridy = 2;
        frame.add(botaoGerir, posicao);
        botaoSair = new JButton("Terminar Sessão");
        posicao.gridx = 0;
        posicao.gridy = 3;
        botaoSair.addActionListener(buttonActionListener);
        frame.add(botaoSair, posicao);
        frame.setVisible(true);
    }
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
