package src;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class UserInterface extends JFrame {
    private GestorEmpresas gestor;
    private GridBagConstraints posicao;
    private JPanel menu, baseDados, filtrar, listar, voltar, gerir;
    private JLabel textoTitulo;
    private JComboBox<String> caixaFiltros, caixaOrdem;
    private JTable tabela;
    private DefaultTableModel elementos;
    private InteracoesCaixa selecElemento;
    private JButton botaoBaseDados, botaoSair, botaoVoltar,botaoCriar, botaoApagar, botaoEditar, botaoGuardar;
    private InteracoesBotao premirBotao;
    private boolean alteracoesPorGuardar;

    public UserInterface(){
        // criar o gestor que vai funcionar através da GUI e tenta carregar dados a partir dos ficheiros
        gestor = new GestorEmpresas();
        gestor.carregarDados();
        // criar o listener para os clicks nos botões
        premirBotao = new InteracoesBotao();
        // criar o listener para as comboBox
        selecElemento = new InteracoesCaixa();
        // criar a variável que guarda as definições de layout para cada componente antes de ser adicionado
        posicao = new GridBagConstraints();
        // inicar variavel que verifica se houve alterações aos ficheiros deste o último save
        alteracoesPorGuardar = false;
        // construir a aparencia da janela
        construirAparencia();
        //construir o painel do menu
        construirMenu();
        // construir o painel com o botão para voltar ao menu;
        construirVoltar();
        // construir o painel para filtrar as empresas com as diferentes opções do enunciado e o botao de guardar
        construirFiltrar();
        // construir o painel para gerir as empresas (criar/editar/apagar)
        construirGerir();
        // construir o painel com a tabela
        construirListar();
        // criar o painel base de dados que contém todos os anteriores
        construirBaseDados();
        // uma vez que o construtor apenas é chamado quando a frame
        // é criada pela primeira vez sabemos que podemos mostrar
        // logo o menu depois de estar tudo construído
        add(menu);
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
            if(evento.getSource() == botaoCriar) {
                alteracoesPorGuardar = true;
            }
            if(evento.getSource() == botaoEditar) {
                alteracoesPorGuardar = true;
            }
            if(evento.getSource() == botaoApagar) {
                int indexLinha = tabela.getSelectedRow();
                gestor.remove(indexLinha);
                recarregarTabela();
                alteracoesPorGuardar = true;
                botaoGuardar.setEnabled(true);
            }
            if(evento.getSource() == botaoGuardar) {
                gestor.guardarDados();
                alteracoesPorGuardar = false;
                botaoGuardar.setEnabled(false);
            }
            if(evento.getSource() == botaoSair) {
                // confirmar saída e terminar
                terminar();
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
        remove(baseDados);
        add(menu,BorderLayout.CENTER);
        validate();
        repaint();
    }

    private void mostrarBaseDados(){
        remove(menu);
        add(baseDados,BorderLayout.CENTER);
        validate();
        repaint();
    }

    private void recarregarTabela(){
        Integer caixaSelect = caixaFiltros.getSelectedIndex();
        ArrayList<Empresa> registo = gestor.getEmpresas();
        elementos.setRowCount(0);
        String tipos[]= {"Todas","Restauração","Pastelaria","Cafe","Restaurante","Restaurante Fast-Food","Restaurante Local","Mercearia","Frutaria","Mercado","Minimercado","Supermercado","Hipermercado"};
        if(caixaSelect==0){
            for (Empresa empresa : registo){
                elementos.addRow(new Object[]{empresa.getNome(),empresa.getTipo(),empresa.getDistrito(),empresa.despesaAnual(),empresa.receitaAnual(),empresa.lucroSimNao()});
            }
        }
        else{
            for (Empresa empresa : registo){
                if(empresa.getTipo().equals(tipos[caixaSelect]) || empresa.getCategoria().equals(tipos[caixaSelect]) || empresa.getSubCategoria().equals(tipos[caixaSelect])){
                    elementos.addRow(new Object[]{empresa.getNome(),empresa.getTipo(),empresa.getDistrito(),empresa.despesaAnual(),empresa.receitaAnual(),empresa.lucroSimNao()});
                }
            }
        }
    }

    private void construirAparencia(){
        // definir o estilo da janela
        setTitle("StarThrive");
        setSize(720, 720);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        // cria um listener personalizado para quando o utilizador tenta fechar o programa de qualquer forma
        addWindowListener(construirEventoTerminar());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());
        setIconImage(new ImageIcon("src/resources/icon.png").getImage());

        // criar cores e modelos personalizados para toda a interface através do UIManager
        Color invisivel = new Color(0,0,0,0);
        UIManager.put("OptionPane.background",Color.WHITE);
        UIManager.put("Panel.background",Color.WHITE);
        UIManager.put("Button.focus",invisivel);
        UIManager.put("ComboBox.font",new Font("Arial", Font.BOLD, 15));
        UIManager.put("Button.font",new Font("Arial", Font.BOLD, 15));
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        UIManager.put("OptionPane.cancelButtonText","Cancelar");
        UIManager.put("OptionPane.yesButtonText","Sim");
        UIManager.put("OptionPane.noButtonText","Não");
        UIManager.put("OptionPane.cancelButtonText","Cancelar");
        UIManager.put("OptionPane.okButtonMnemonic", "0");
        UIManager.put("OptionPane.cancelButtonMnemonic", "0");
        UIManager.put("OptionPane.noButtonMnemonic", "0");
        UIManager.put("OptionPane.questionIcon",new ImageIcon("src/resources/question.gif"));
        UIManager.put("OptionPane.warningIcon",new ImageIcon("src/resources/resources/warning.gif"));
        UIManager.put("OptionPane.errorIcon",new ImageIcon("src/resources/error.gif"));
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
        botaoSair = new JButton("Sair do Programa");
        posicao.gridx = 0;
        posicao.gridy = 2;
        botaoSair.addActionListener(premirBotao);
        menu.add(botaoSair,posicao);
    }

    private void construirVoltar(){
        voltar = new JPanel();
        voltar.setLayout(new GridBagLayout());
        posicao.gridx = 0;
        posicao.gridy = 0;
        botaoVoltar = new JButton("◄");
        posicao.insets = new Insets(0,0,0,0);
        botaoVoltar.addActionListener(premirBotao);
        voltar.add(botaoVoltar, posicao);
    }

    private void construirGerir(){
        gerir = new JPanel();
        gerir.setLayout(new GridBagLayout());
        botaoCriar = new JButton("Criar");
        posicao.insets = new Insets(0,0,30,50);
        posicao.gridx = 0;
        posicao.gridy = 0;
        botaoCriar.addActionListener(premirBotao);
        gerir.add(botaoCriar, posicao);
        botaoEditar = new JButton("Editar");
        posicao.gridx = 0;
        posicao.gridy = 1;
        botaoEditar.addActionListener(premirBotao);
        gerir.add(botaoEditar, posicao);
        botaoApagar = new JButton("Apagar");
        posicao.gridx = 0;
        posicao.gridy = 2;
        botaoApagar.addActionListener(premirBotao);
        gerir.add(botaoApagar, posicao);
    }


    private void construirListar(){
        listar = new JPanel();
        listar.setLayout(new GridBagLayout());
        // por default criamos a tabela a mostrar todas as empresas na primeira vez que o utlizadar aceder à base de dados
        String[] colunas = {"Nome", "Tipo", "Distrito", "Despesa", "Receita", "Lucro / Diferença"};
        elementos = new DefaultTableModel(colunas, 0){
            @Override
            public boolean isCellEditable(int fila, int coluna) {
                return false; //return (coluna == 0 || coluna == 1 || coluna == 2 || coluna == 3 || coluna == 4);
            }
        };
        ArrayList<Empresa> registo = gestor.getEmpresas();
        for (Empresa empresa : registo){
            elementos.addRow(new Object[]{empresa.getNome(),empresa.getTipo(),empresa.getDistrito(),empresa.despesaAnual(),empresa.receitaAnual(),empresa.lucroSimNao()});
        }
		tabela = new JTable(elementos);
        tabela.setFillsViewportHeight(true);
        DefaultTableCellRenderer justificarCentro = new DefaultTableCellRenderer();
        ((DefaultTableCellRenderer)tabela.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        justificarCentro.setHorizontalAlignment(JLabel.CENTER);
        for(int x=0;x<6;x++){
            tabela.getColumnModel().getColumn(x).setCellRenderer(justificarCentro);
        }
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scroller = new JScrollPane(tabela);
        posicao.gridx = 1;
        posicao.gridy = 0;
        posicao.fill = GridBagConstraints.BOTH;
        posicao.weightx = 1;
        posicao.weighty = 0;
        posicao.insets = new Insets(0,0,0,0);
        listar.add(scroller,posicao);
    }

    private void construirFiltrar(){
        filtrar = new JPanel();
        filtrar.setLayout(new GridBagLayout());
        String filtros[]= {"Todas", // 0
                            "Restauração (Categoria)", // 1
                            "  Pastelaria", // 2
                            "  Cafe", // 3
                            "  Restaurante (Sub-Categoria)", // 4
                            "      Restaurante Fast-Food", // 5
                            "      Restaurante Local", // 6
                            "Mercearia (Categoria)", // 7
                            "  Frutaria", // 8
                            "  Mercado (Sub-Categoria)", // 9
                            "    Minimercado", // 10
                            "    Hipermercado", // 11
                            "    Supermercado"}; // 12
        caixaFiltros = new JComboBox<String>(filtros);
        caixaFiltros.addActionListener(selecElemento);
        posicao.gridx = 1;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,10,40,0);
        JLabel textoFiltrar = new JLabel("Filtrar:");
        textoFiltrar.setFont(new Font("Arial", Font.BOLD, 15));
		textoFiltrar.setLabelFor( caixaFiltros );
        filtrar.add(caixaFiltros,posicao);
        posicao.gridx = 0;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,0,42,0);
        filtrar.add(textoFiltrar,posicao);
        String[] ordem = {"Nome ↓","Nome ↑","Distrito ↓","Distrito ↑","Despesa anual ↓","Despesa anual ↑","Receita anual ↓","Receita anual ↑","Lucro ↓","Lucro ↑"};
        caixaOrdem = new JComboBox<String>(ordem);
        caixaOrdem.addActionListener(selecElemento);
        posicao.gridx = 3;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,10,40,75);
        JLabel textoOrdenar = new JLabel("Ordenar:");
        textoOrdenar.setFont(new Font("Arial", Font.BOLD, 15));
		textoOrdenar.setLabelFor( caixaOrdem );
        filtrar.add(caixaOrdem,posicao);
        posicao.gridx = 2;
        posicao.gridy = 0;
        posicao.insets = new Insets(0,40,42,0);
        filtrar.add(textoOrdenar,posicao);
        posicao.gridx = 4;
        posicao.gridy = 0;
        botaoGuardar = new JButton("Guardar");
        botaoGuardar.setEnabled(false);
        posicao.insets = new Insets(0,40,40,0);
        botaoGuardar.addActionListener(premirBotao);
        filtrar.add(botaoGuardar, posicao);
    }

    private void construirBaseDados(){
        baseDados = new JPanel();
        baseDados.setLayout(new GridBagLayout());
        posicao.gridx = 1;
        posicao.gridy = 0;
        baseDados.add(filtrar,posicao);
        posicao.gridx = 0;
        posicao.gridy = 1;
        baseDados.add(voltar,posicao);
        posicao.gridx = 2;
        posicao.gridy = 1;
        baseDados.add(gerir,posicao);
        posicao.gridx = 1;
        posicao.gridy = 1;
        baseDados.add(listar,posicao);
    }

    private void terminar(){
        int resposta;
        if(alteracoesPorGuardar){
            resposta = JOptionPane.showConfirmDialog(null, "Existem alterações por guardar.\nDeseja guardar antes de sair?", null, JOptionPane.YES_NO_CANCEL_OPTION);
            if(resposta==JOptionPane.YES_OPTION){
                gestor.guardarDados();
                System.exit(0);
            }
            if(resposta==JOptionPane.NO_OPTION){
                System.exit(0);
            }
        }
        else{
            resposta = JOptionPane.showConfirmDialog(null, "Tem a certeza que pretende sair?", null, JOptionPane.YES_NO_OPTION);
            if(resposta==JOptionPane.YES_OPTION)
                System.exit(0);
        }
    }

    private WindowListener construirEventoTerminar(){
        WindowListener eventoTerminar = new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                terminar();
            }
        };
        return eventoTerminar;
    }
}
