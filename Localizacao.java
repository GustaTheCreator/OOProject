import java.io.Serializable;

/**
 * Classe que localiza uma empresa através da latitude e longitude
 */
public class Localizacao implements Serializable{
    /**
     * Latitude da empresa
     */
    private Coordenada latitude;
    /**
     * Longitude da empresa
     */
    private Coordenada longitude;
    /**
     * Construtor da classe Localizacao
     * @param latitude Latitude da empresa
     * @param longitude Longitude da empresa
     */

    public Localizacao(Coordenada latitude, Coordenada longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    /**
     * Método que retorna a latitude da empresa
     * @return Latitude da empresa
     */

    public Coordenada getLatitude() {
        return latitude;
    }
    /**
     * Método que define a latitude da empresa
     * @param latitude Latitude da empresa
     */

    public void setLatitude(Coordenada latitude) {
        this.latitude = latitude;
    }
    /**
     * Método que retorna a longitude da empresa
     * @return Longitude da empresa
     */

    public Coordenada getLongitude() {
        return longitude;
    }
    /**
     * Método que define a longitude da empresa
     * @param longitude Longitude da empresa
     */

    public void setLongitude(Coordenada longitude) {
        this.longitude = longitude;
    }
    /**
     * Método toString da classe Localizacao
     * @return String com a informação da localização da empresa
     */

    @Override
    public String toString() {
        return longitude + " " + latitude;
    }
}



