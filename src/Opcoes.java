package src;

import java.io.Serializable;

public class Opcoes implements Serializable{
    private int tema;
    private int estilo;
    private boolean confirmarSair;
    private boolean AutoGuardar;
    public Opcoes() {
        this.tema = 0;
        this.estilo = 0;
        this.confirmarSair = true;
        this.AutoGuardar = false;
    }
    public int getEstilo() {
        return estilo;
    }
    public void setEstilo(int estilo) {
        this.estilo = estilo;
    }
    public int getTema() {
        return tema;
    }
    public void setTema(int tema) {
        this.tema = tema;
    }
    public boolean isConfirmarSair() {
        return confirmarSair;
    }
    public void setConfirmarSair(boolean confirmarSair) {
        this.confirmarSair = confirmarSair;
    }
    public boolean isAutoGuardar() {
        return AutoGuardar;
    }
    public void setAutoGuardar(boolean autoGuardar) {
        AutoGuardar = autoGuardar;
    }
}
