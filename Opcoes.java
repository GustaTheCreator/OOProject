import java.io.Serializable;

/**
 * Classe das opcoes da interface grafica.
 */
public class Opcoes implements Serializable{
    /**
     * Inteiro para o tema
     */
    private int tema;
     /**
     * Inteiro para o estoçp
     */
    private int estilo;
     /**
     * Booleano para confirmar se confirma antes de sair
     */
    private boolean confirmarSair;
     /**
     * Booleano para se guarda automaticamente depois de uma alteracao
     */
    private boolean AutoGuardar;
    /**
     * Booleano para se a janela dever ser ou nao preencher o ecra sem bordas
     */
    private boolean fullscreen;

    /**
     * Construtor da class Opcoes
     * Coloca o tema por defeito a claro
     * Coloca o estilo por defeito ao clássico
     * Coloca o confirmarSair por defeito a true
     * Coloca o AutoGuardar por defeito a true
     * Coloca o fullscreen por defeito a false
     */
    public Opcoes() {
        this.tema = 0;
        this.estilo = 0;
        this.confirmarSair = true;
        this.AutoGuardar = true;
        this.fullscreen = false;
    }
    public int getEstilo() {
        return estilo;
    }
    public boolean isFullscreen() {
        return fullscreen;
    }
    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
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
