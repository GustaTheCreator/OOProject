package src;
/**
 * Classe Main, contém apenas o método main isolado
 * @author Diogo Simões e Gustavo Alves
 * @version 1.0
 */

public class Main {
    /**
    * Método main, inicializa e torna vísivel a interface gráfica, a partir daí
    * todas as operações ocorrem na classe da interface gráfica
    * @see UserInterface
    */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserInterface GUI = new UserInterface();
                GUI.setVisible(true);
            }
        });
    }
}
