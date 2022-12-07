/**
 * @author Diogo Simões e Gustavo Alves
 */

public class Main {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserInterface GUI = new UserInterface();
                GUI.setVisible(true);
            }
        });
    }
}
