package src;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.table.*;

public class UserInterface extends JFrame {
    private GestorEmpresas gestor;
    private GridBagConstraints posicao;
    private JPanel menu, baseDados, filtrar, listar, voltar;
    private JLabel textoTitulo;
    private JComboBox<String> caixaFiltros, caixaOrdem;
    private JTable tabela;
    private DefaultTableModel elementos;
    private InteracoesCaixa selecElemento;
    private JButton botaoBaseDados, botaoOpcoes, botaoSair, botaoVoltar;
    private InteracoesBotao premirBotao;

    public UserInterface(){

        // criar o gestor que vai funcionar através da GUI
        gestor = new GestorEmpresas();
        // criar o listener para os clicks nos botões
        premirBotao = new InteracoesBotao();
        // criar o listener para a caixa com os filtros
        selecElemento = new InteracoesCaixa();
        // criar a variável que guarda as definições de layout para cada componente antes de ser adicionado
        posicao = new GridBagConstraints();
        //temporario
        gestor.addEmpresa("Alma Shopping","Frutaria", 30, 12, 20, 'N', 10, 5, 45, 'E', "Coimbra", 315321.32f, 139232f, 104);
        gestor.addEmpresa("Coimbra Shopping","Frutaria", 30, 12, 20, 'N', 10, 5, 45, 'E', "Coimbra", 315321.32f, 139232f, 104);
        gestor.addEmpresa("Tia Adelaide","Frutaria", 30, 12, 20, 'N', 10, 5, 45, 'E', "Coimbra", 315321.32f, 139232f, 104);
        // construir a aparencia da janela tendo em conta o tema que o utilizador escolheu na última vez que usou o programa
        construirAparencia();
        //construir o painel do menu
        construirMenu();
        // construir o painel para filtrar as empresas com as diferentes opções do enunciado
        construirFiltrar();
        // construir o painel com a tabela
        construirListar();
        // construir o painel com o botão para voltar ao menu;
        construirVoltar();
        // criar o painel base de dados que contém o painel para voltar ao menu e os paineis relacionados com a tabela
        construirBaseDados();
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
            if(evento.getSource() == botaoOpcoes){
                mudarTema();
            }
            if(evento.getSource() == botaoVoltar) {
                mostrarMenu();
            }
            if(evento.getSource() == botaoSair) {
                // confirmar saída e terminar
                if(JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair?", null, JOptionPane.YES_NO_OPTION) == 0){
                    System.exit(0);
                }
            }
        }
    }

    private class InteracoesCaixa implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            requestFocusInWindow();
            if(evento.getSource() == caixaOrdem){
                Integer caixaSelect = caixaOrdem.getSelectedIndex();
                gestor.ordenarLista(caixaSelect);
            }
            recarregarTabela();
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

    private void recarregarTabela(){
        Integer caixaSelect = caixaFiltros.getSelectedIndex();
        ArrayList<Empresa> registo = gestor.getEmpresas();
        elementos.setRowCount(0);
        if(caixaSelect==0){
            for (Empresa empresa : registo){
                elementos.addRow(new Object[]{empresa.getNome(),empresa.getTipo(),empresa.getDistrito(),empresa.getFaturacaoMedia()});
            }
        }
        if(caixaSelect==1){
            for (Empresa empresa : registo){
                if(empresa.getTipo().equals("Restaurante")){
                    elementos.addRow(new Object[]{empresa.getNome(),empresa.getTipo(),empresa.getDistrito(),empresa.getFaturacaoMedia()});
                }
            }
        }
        if(caixaSelect==2){
            for (Empresa empresa : registo){
                if(empresa.getTipo().equals("Frutaria")){
                    elementos.addRow(new Object[]{empresa.getNome(),empresa.getTipo(),empresa.getDistrito(),empresa.getFaturacaoMedia()});
                }
            }
        }
    }

    private void mudarTema(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("Button.select",new Color(118,221,221));
            Color windowsGrey = new Color(240,240,240);
            UIManager.put("Button.foreground",new ColorUIResource(Color.BLACK));
            botaoOpcoes.setForeground(Color.BLACK);
            botaoSair.setForeground(Color.BLACK);
            botaoVoltar.setForeground(Color.BLACK);
            botaoBaseDados.setForeground(Color.BLACK);
            caixaFiltros.setForeground(Color.BLACK);
            caixaFiltros.setBackground(windowsGrey);
            caixaOrdem.setForeground(Color.BLACK);
            caixaOrdem.setBackground(windowsGrey);
            tabela.setBackground(Color.WHITE);
            tabela.setForeground(Color.BLACK);
            SwingUtilities.updateComponentTreeUI(this);
            SwingUtilities.updateComponentTreeUI(tabela);
            SwingUtilities.updateComponentTreeUI(botaoVoltar);
            SwingUtilities.updateComponentTreeUI(caixaFiltros);
            SwingUtilities.updateComponentTreeUI(caixaOrdem);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o tema, irá permanecer o anterior!",null, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void construirAparencia(){
        // definir o estilo da janela
        this.setTitle("StarThrive");
        this.setSize(720, 720);
        this.getContentPane().setBackground(Color.WHITE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new GridBagLayout());
        this.setIconImage(new ImageIcon("src/resources/icon.png").getImage());

        // criar cores e modelos personalizados para toda a interface através do UIManager
        Color cinza = new Color(55,55,55);
        Color azul =  new Color(118,221,221);
        Color invisivel = new Color(0,0,0,0);
        UIManager.put("OptionPane.background",Color.WHITE);
        UIManager.put("Panel.background",Color.WHITE);
        UIManager.put("Button.foreground",Color.WHITE);
        UIManager.put("Button.preferredSize",new Dimension(300, 50));
        UIManager.put("Button.font",new Font("Arial", Font.BOLD, 15));
        UIManager.put("Button.background",cinza);
        UIManager.put("Button.focus",invisivel);
        UIManager.put("Button.select",azul);
        UIManager.put("Button.selectForeground",azul);
        UIManager.put("ComboBox.font",new Font("Arial", Font.BOLD, 15));
        UIManager.put("ComboBox.background",cinza);
        UIManager.put("ComboBox.foreground",Color.WHITE);
        UIManager.put("ComboBox.selectionBackground",azul);
        UIManager.put("ComboBox.selectionForeground",cinza);
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");         // os gifs perderam alguma qualidade ao
        UIManager.put("OptionPane.cancelButtonText","Cancelar"); // ser resized, talvez procurar outros
        UIManager.put("OptionPane.questionIcon",new ImageIcon("src/resources/question.gif"));
        UIManager.put("OptionPane.warningIcon",new ImageIcon("src/resources/resources/warning.gif"));
        UIManager.put("OptionPane.errorIcon",new ImageIcon("src/resources/error.gif"));
        UIManager.put("Table.background",cinza);
        UIManager.put("Table.foreground",Color.WHITE);
        UIManager.put("Table.selectionBackground",azul);
        UIManager.put("Table.selectionForeground",cinza);
        UIManager.put("Table.focusCellBackground",azul);
        UIManager.put("Table.focusCellForeground",cinza);
    }

    private void construirVoltar(){
        voltar = new JPanel();
        voltar.setLayout(new GridBagLayout());
        botaoVoltar = new JButton("◄");
        posicao.insets = new Insets(0,0,0,50);
        posicao.gridx = 0;
        posicao.gridy = 3;
        botaoVoltar.addActionListener(premirBotao);
        voltar.add(botaoVoltar, posicao);
    }

    private void construirMenu(){
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
    }

    private void construirBaseDados(){
        baseDados = new JPanel();
        baseDados.setLayout(new BorderLayout());
        baseDados.add(voltar,BorderLayout.WEST);
        baseDados.add(filtrar,BorderLayout.NORTH);
        baseDados.add(listar,BorderLayout.CENTER);
    }

    private void construirListar(){
        listar = new JPanel();
        listar.setLayout(new GridBagLayout());
        // por default criamos a tabela a mostrar todas as empresas na primeira vez que o utlizadar aceder à base de dados
        String[] colunas = {"Nome", "Tipo", "Distrito", "Despesa anual", "Receita anual", "Lucro"};
        elementos = new DefaultTableModel(colunas, 0){
            @Override
            public boolean isCellEditable(int fila, int coluna) {
                return (coluna == 0 || coluna == 1 || coluna == 2 || coluna == 3 || coluna == 4);
            }
        };
        ArrayList<Empresa> registo = gestor.getEmpresas();
        for (Empresa empresa : registo){
            elementos.addRow(new Object[]{empresa.getNome(),empresa.getTipo(),empresa.getDistrito(),empresa.getFaturacaoMedia()});
        }
		tabela = new JTable(elementos);
        tabela.setFillsViewportHeight(true);
        JScrollPane scroller = new JScrollPane(tabela);
        posicao.gridx = 1;
        posicao.gridy = 0;
        listar.add(scroller);
    }

    private void construirFiltrar(){
        filtrar = new JPanel();
        filtrar.setLayout(new GridBagLayout());
        String[] filtros = {"Todas","Restauração","Mercearias"};
        caixaFiltros = new JComboBox<String>(filtros);
        caixaFiltros.setLayout(new GridBagLayout());
        caixaFiltros.setUI(new BasicComboBoxUI());
        caixaFiltros.setBorder(new EmptyBorder(5, 15, 5, 15));
        caixaFiltros.addActionListener(selecElemento);
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,100,40,0);
        filtrar.add(caixaFiltros,posicao);
        String[] ordem = {"Nome ↓","Nome ↑","Distrito ↓","Distrito ↑","Despesa anual ↓","Despesa anual ↑","Receita anual ↓","Receita anual ↑","Lucro anual ↓","Lucro anual ↑"};
        caixaOrdem = new JComboBox<String>(ordem);
        caixaOrdem.setLayout(new GridBagLayout());
        caixaOrdem.setUI(new BasicComboBoxUI());
        caixaOrdem.setBorder(new EmptyBorder(5, 15, 5, 15));
        caixaOrdem.addActionListener(selecElemento);
        posicao.gridx = 1;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,75,40,0);
        filtrar.add(caixaOrdem,posicao);
    }
}
