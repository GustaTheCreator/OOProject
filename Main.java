/**
 * @author Diogo Simões e Gustavo Alves
 */

public class Main {
    /**
    * Método que inicializa e torna vísivel a interface gráfica, a partir daí
    * todas as operações ocorrem na classe UserInterface
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
