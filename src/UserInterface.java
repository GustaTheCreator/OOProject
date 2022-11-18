package src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class UserInterface extends JFrame{
    private JPanel menu, consultar, gerir;
    private JLabel textoTitulo, textoListaConsultar, textoListaGerir;
    private JButton botaoConsultar, botaoMostrarTodas, botaoGerir, botaoCriar, botaoEditar, botaoApagar,
    botaoSair, botaoVoltarGerir, botaoVoltarConsultar;

    public UserInterface(){

        // definir o estilo da janela
        this.getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.setIconImage(new ImageIcon("src/resources/icon.png").getImage());

        // criar cores e modelos personalizados para toda a interface através do UIManager
        Color cinza = new Color(55,55,55);
        Color ciano =  new Color(118,221,221);
        UIManager.put("OptionPane.background",Color.WHITE);
        UIManager.put("Panel.background",Color.WHITE);
        UIManager.put("Button.foreground",Color.WHITE);
        UIManager.put("Button.preferredSize",new Dimension(300, 50));
        UIManager.put("Button.font",new Font("Arial", Font.BOLD, 16));
        UIManager.put("Button.background",cinza);
        UIManager.put("Button.focus", new Color(0, 0, 0, 0));
        UIManager.put("Button.border",new CompoundBorder(new LineBorder(cinza), new EmptyBorder(5, 15, 5, 15)));
        UIManager.put("Button.select", ciano);
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");         // os gifs perderam alguma qualidade ao
        UIManager.put("OptionPane.cancelButtonText","Cancelar"); // ser resized, talvez procurar outros
        UIManager.put("OptionPane.questionIcon",new ImageIcon("src/resources/question.gif"));
        UIManager.put("OptionPane.warningIcon",new ImageIcon("src/resources/resources/warning.gif"));
        UIManager.put("OptionPane.errorIcon",new ImageIcon("src/resources/error.gif"));

        // criar o listener para os clicks nos botões
        ButtonListener buttonPress = new ButtonListener();
        // criar a variável que guarda as definições de layout para cada componente antes de ser adicionado ao painel
        GridBagConstraints posicao = new GridBagConstraints();

        //construir o painel do menu
        menu = new JPanel();
        menu.setLayout(new GridBagLayout());
        textoTitulo = new JLabel("<html>St<FONT COLOR=rgb(118,221,221)>★</FONT>rThrive</html>");
        textoTitulo.setFont(new Font(textoTitulo.getFont().getFontName(), Font.BOLD, 100));
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,40,0);
        textoTitulo.addMouseListener(new MouseAdapter(){ //clicar duas vezes no titulo do menu!
            private int clicks=0;
            public void mouseClicked(MouseEvent evento){
                this.clicks+=1;
                if(clicks==2)
                    textoTitulo.setText("<html>St<img src=" + getClass().getResource("resources/star.gif").toString() + "></FONT>rThrive</html>");
            }
        });
        menu.add(textoTitulo, posicao);
        botaoConsultar = new JButton("Consultar informção");
        posicao.gridx = 0;
        posicao.gridy = 1;
        posicao.insets = new Insets(10,10,10,10);
        botaoConsultar.addActionListener(buttonPress);
        menu.add(botaoConsultar, posicao);
        botaoGerir = new JButton("Gerir base de dados");
        posicao.gridx = 0;
        posicao.gridy = 2;
        botaoGerir.addActionListener(buttonPress);
        menu.add(botaoGerir, posicao);
        botaoSair = new JButton("Terminar Sessão");
        posicao.gridx = 0;
        posicao.gridy = 3;
        botaoSair.addActionListener(buttonPress);
        menu.add(botaoSair,posicao);

        // construir o painel para consultar
        consultar = new JPanel();
        consultar.setLayout(new GridBagLayout());
        textoListaConsultar = new JLabel("<html><FONT COLOR=rgb(118,221,221)>★</FONT> Lista de Empresas</html>");
        textoListaConsultar.setFont(new Font(textoTitulo.getFont().getFontName(), Font.BOLD, 50));
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,40,0);
        consultar.add(textoListaConsultar, posicao);
        botaoMostrarTodas = new JButton("Mostrar todas");
        posicao.gridx = 0;
        posicao.gridy = 1;
        posicao.insets = new Insets(10,2,10,2);
        consultar.add(botaoMostrarTodas, posicao);
        botaoVoltarConsultar= new JButton("Voltar ao menu");
        posicao.gridx = 0;
        posicao.gridy = 2;
        botaoVoltarConsultar.addActionListener(buttonPress);
        consultar.add(botaoVoltarConsultar, posicao);

        // construir o painel para gerir
        gerir = new JPanel();
        gerir.setLayout(new GridBagLayout());
        textoListaGerir = new JLabel("<html><FONT COLOR=rgb(118,221,221)>★</FONT> Lista de Empresas</html>");
        textoListaGerir.setFont(new Font(textoTitulo.getFont().getFontName(), Font.BOLD, 50));
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,40,0);
        gerir.add(textoListaGerir, posicao);
        botaoCriar = new JButton("Criar");
        posicao.gridx = 0;
        posicao.gridy = 1;
        posicao.insets = new Insets(10,2,10,2);
        gerir.add(botaoCriar, posicao);
        botaoEditar = new JButton("Editar");
        posicao.gridx = 0;
        posicao.gridy = 2;
        gerir.add(botaoEditar, posicao);
        botaoApagar = new JButton("Apagar");
        posicao.gridx = 0;
        posicao.gridy = 3;
        gerir.add(botaoApagar, posicao);
        botaoVoltarGerir= new JButton("Voltar ao menu");
        posicao.gridx = 0;
        posicao.gridy = 4;
        botaoVoltarGerir.addActionListener(buttonPress);
        gerir.add(botaoVoltarGerir, posicao);

        // uma vez que o construtor apenas é chamado quando a frame
        // é criada pela primeira vez sabemos que podemos mostrar
        // logo o menu depois de estar tudo construído
        this.add(menu,BorderLayout.CENTER);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            if(evento.getSource() == botaoConsultar) {
                mostrarConsultar();
            }
            if(evento.getSource() == botaoGerir) {
                mostrarGerir();
            }
            if(evento.getSource() == botaoVoltarConsultar) {
                mostrarMenu(1);
            }
            if(evento.getSource() == botaoVoltarGerir) {
                mostrarMenu(2);
            }
            if(evento.getSource() == botaoSair) { // confirmar saída e terminar
                if(JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair?", null, JOptionPane.YES_NO_OPTION) == 0){
                    System.exit(0);
                }
            }
        }
    }

    private void mostrarMenu(int lastPage){
        switch (lastPage) {
            case 1 -> this.remove(consultar);
            case 2 -> this.remove(gerir);
        }
        this.add(menu,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }

    private void mostrarConsultar(){
        this.remove(menu);
        this.add(consultar,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }

    private void mostrarGerir(){
        this.remove(menu);
        this.add(gerir,BorderLayout.CENTER);
        this.validate();
        this.repaint();
    }

}
