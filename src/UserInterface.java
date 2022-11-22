package src;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

public class UserInterface extends JFrame {
    private GestorEmpresas gestor;
    private JPanel menu, baseDados, filtrar, listar, gerir, voltar;
    private JLabel textoTitulo;
    private DefaultListModel<Empresa> elementos;
    private JButton botaoBaseDados, botaoOpcoes, botaoSair, botaoVoltar, botaoCriar, botaoEditar, botaoApagar;

    public UserInterface(){

        // criar o gestor que vai funcionar através da GUI
        gestor = new GestorEmpresas();
        gestor.addEmpresa("Alma Shopping","Frutaria", 30, 12, 20, 'N', 10, 5, 45, 'E', "Coimbra", 315321.32f, 139232f, 104);
        gestor.addEmpresa("Coimbra Shopping","Frutaria", 30, 12, 20, 'N', 10, 5, 45, 'E', "Coimbra", 315321.32f, 139232f, 104);
        gestor.addEmpresa("Tia Adelaide","Frutaria", 30, 12, 20, 'N', 10, 5, 45, 'E', "Coimbra", 315321.32f, 139232f, 104);

        // definir o estilo da janela
        this.setTitle("StarThrive");
        this.setSize(720, 720);
        this.getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new GridBagLayout());
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
        UIManager.put("Button.border",new CompoundBorder(new LineBorder(ciano,3), new EmptyBorder(5, 15, 5, 15)));
        UIManager.put("Button.select", ciano);
        UIManager.put("ComboBox.background",cinza);
        UIManager.put("ComboBox.foreground",Color.WHITE);
        UIManager.put("ComboBox.disabledBackground",cinza);
        UIManager.put("ComboBox.disabledForeground",Color.WHITE);
        UIManager.put("ComboBox.selectionBackground",cinza);
        UIManager.put("ComboBox.selectionForeground",Color.WHITE);
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");         // os gifs perderam alguma qualidade ao
        UIManager.put("OptionPane.cancelButtonText","Cancelar"); // ser resized, talvez procurar outros
        UIManager.put("OptionPane.questionIcon",new ImageIcon("src/resources/question.gif"));
        UIManager.put("OptionPane.warningIcon",new ImageIcon("src/resources/resources/warning.gif"));
        UIManager.put("OptionPane.errorIcon",new ImageIcon("src/resources/error.gif"));
        UIManager.put("List.background",cinza);
        UIManager.put("List.foreground",Color.WHITE);
        UIManager.put("List.selectionBackground",ciano);
        UIManager.put("List.selectionForeground",cinza);


        // criar o listener para os clicks nos botões
        InteracoesBotao premirBotao = new InteracoesBotao();
        // criar o listener para a caixa com os filtros
        InteracoesCaixa selecElemento = new InteracoesCaixa();
        // criar a variável que guarda as definições de layout para cada componente antes de ser adicionado
        GridBagConstraints posicao = new GridBagConstraints();

        //construir o painel do menu
        menu = new JPanel();
        menu.setLayout(new GridBagLayout());
        textoTitulo = new JLabel("<html>St<img src=" + getClass().getResource("resources/star.gif").toString() + "></FONT>rThrive</html>");
        textoTitulo.setFont(new Font(textoTitulo.getFont().getFontName(), Font.BOLD, 100));
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,40,0);
        menu.add(textoTitulo, posicao);
        botaoBaseDados = new JButton("Base de Dados");
        posicao.gridx = 0;
        posicao.gridy = 1;
        botaoBaseDados.addActionListener(premirBotao);
        menu.add(botaoBaseDados, posicao);
        botaoOpcoes = new JButton("Opções");
        posicao.gridx = 0;
        posicao.gridy = 2;
        botaoOpcoes.addActionListener(premirBotao);
        menu.add(botaoOpcoes, posicao);
        botaoSair = new JButton("Terminar Sessão");
        posicao.gridx = 0;
        posicao.gridy = 3;
        botaoSair.addActionListener(premirBotao);
        menu.add(botaoSair,posicao);

        // construir o painel para filtrar as empresas com as diferentes opções do enunciado
        filtrar = new JPanel();
        filtrar.setLayout(new GridBagLayout());
        String[] opcoes = {
            "Mostrar todas",
            "Maior receita anual",
            "Menor despesa anual",
            "Maior lucro anual",
            "Restaurantes clientes/dia"
        };
        JComboBox<String> caixaFiltros = new JComboBox<String>(opcoes);
        caixaFiltros.addActionListener(selecElemento);
        caixaFiltros.setBorder(new CompoundBorder(new LineBorder(ciano,3), new EmptyBorder(5, 15, 5, 15)));
        posicao.insets = new Insets(200,0,200,0);
        filtrar.add(caixaFiltros);

        // construir o painel com a lista e a funcionalidade de dar scroll caso fica demasiado grande
        listar = new JPanel();
        listar.setLayout(new GridBagLayout());
        elementos = new DefaultListModel<Empresa>();
        JList<Empresa> lista = new JList<Empresa>(elementos);
        // por default criamos a lista a mostrar todas as empresas para quando o utlizadar aceder à base de dados
        ArrayList<Empresa> registo = gestor.getEmpresas();
        for (Empresa empresa : registo){
            elementos.addElement(empresa);
        }
        lista.setBorder(new CompoundBorder(new LineBorder(ciano,3), new EmptyBorder(5, 15, 5, 15)));
        lista.setFont(new Font("Arial",Font.BOLD,16));
        JScrollPane scroller = new JScrollPane(lista);
        posicao.gridx = 1;
        posicao.gridy = 0;
        listar.add(scroller);

        // construir o painel para gerir as empresas (criar/editar/apagar)
        gerir = new JPanel();
        gerir.setLayout(new GridBagLayout());
        botaoCriar = new JButton("Criar");
        posicao.insets = new Insets(0,50,30,0);
        posicao.gridx = 0;
        posicao.gridy = 0;
        gerir.add(botaoCriar, posicao);
        botaoEditar = new JButton("Editar");
        posicao.gridx = 0;
        posicao.gridy = 1;
        gerir.add(botaoEditar, posicao);
        botaoApagar = new JButton("Apagar");
        posicao.gridx = 0;
        posicao.gridy = 2;
        gerir.add(botaoApagar, posicao);

        // construir o painel com o botão para voltar ao menu;
        voltar = new JPanel();
        voltar.setLayout(new GridBagLayout());
        botaoVoltar = new JButton("←");
        posicao.insets = new Insets(0,50,0,50);
        posicao.gridx = 0;
        posicao.gridy = 3;
        botaoVoltar.addActionListener(premirBotao);
        voltar.add(botaoVoltar, posicao);

        // criar o painel base de dados que contém todos os outros
        baseDados = new JPanel();
        baseDados.setLayout(new BorderLayout());
        baseDados.add(voltar,BorderLayout.WEST);
        baseDados.add(filtrar,BorderLayout.NORTH);
        baseDados.add(listar,BorderLayout.CENTER);
        baseDados.add(gerir,BorderLayout.EAST);

        // uma vez que o construtor apenas é chamado quando a frame
        // é criada pela primeira vez sabemos que podemos mostrar
        // logo o menu depois de estar tudo construído
        this.add(menu);
    }

    private class InteracoesBotao implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            if(evento.getSource() == botaoBaseDados) {
                mostrarBaseDados();
            }
            if(evento.getSource() == botaoVoltar) {
                mostrarMenu();
            }
            if(evento.getSource() == botaoSair) { // confirmar saída e terminar
                if(JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair?", null, JOptionPane.YES_NO_OPTION) == 0){
                    System.exit(0);
                }
            }
        }
    }

    private class InteracoesCaixa implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
        }
    }

    //tentar metar tudo num painel e só botão de voltar separado
    private void mostrarMenu(){
        this.remove(baseDados);
        this.add(menu);
        this.validate();
        this.repaint();
    }

    private void mostrarBaseDados(){
        this.remove(menu);
        this.add(baseDados);
        this.validate();
        this.repaint();
    }
}
