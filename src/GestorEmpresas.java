package src;

import java.util.ArrayList;

public class GestorEmpresas {
    private ArrayList<Empresa> empresas;

    public GestorEmpresas() {
        this.empresas = new ArrayList<Empresa>();
    }

    public static void main(String[] args) {
        final UserInterface GUI = new UserInterface();
        GUI.setTitle("StarThrive");
        GUI.setSize(720, 720);
        GUI.setVisible(true);
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

}
