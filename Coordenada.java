import java.io.Serializable;
/**
 * Classe que representa uma coordenada geográfica
 */
public class Coordenada implements Serializable {
    /**
     * Horas da coordenada
     */
    private int horas;
    /**
     * Minutos da coordenada
     */
    private int minutos;
    /**
     * Segundos da coordenada
     */
    private int segundos;
    /**
     * Direção da coordenada
     */
    private char direcao;

    /**
     * Construtor da classe Coordenada
     * @param horas Horas da coordenada
     * @param minutos Minutos da coordenada
     * @param segundos Segundos da coordenada
     * @param direcao Direção da coordenada
     */
    public Coordenada(int horas, int minutos, int segundos, char direcao) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.direcao = direcao;
    }
    /**
     * Método que retorna as horas da coordenada
     * @return Horas da coordenada
     */
    public int getHoras() {
        return horas;
    }
/**
     * Método toString da classe Coordenada
     * @return String com a informação da coordenada
     */
    @Override
    public String toString() {
        return horas + "°" + minutos + "'" + segundos + "\"" + direcao;
    }
/**
     * Método que define as horas da coordenada
     * @param horas Horas da coordenada
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Método que retorna os minutos da coordenada
     * @return Minutos da coordenada
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Método que define os minutos da coordenada
     * @param minutos Minutos da coordenada
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
/**
     * Método que retorna os segundos da coordenada
     * @return Segundos da coordenada
     */
    public int getSegundos() {
        return segundos;
    }
/**
     * Método que define os segundos da coordenada
     * @param segundos Segundos da coordenada
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
/**
     * Método que retorna a direção da coordenada
     * @return Direção da coordenada
     */
    public char getDirecao() {
        return direcao;
    }
/**
     * Método que define a direção da coordenada
     * @param direcao Direção da coordenada
     */
    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
}
