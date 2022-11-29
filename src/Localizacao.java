package src;

import java.io.Serializable;

public class Localizacao implements Serializable{
    private Coordenada latitude;
    private Coordenada longitude;

    public Localizacao(Coordenada latitude, Coordenada longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordenada getLatitude() {
        return latitude;
    }

    public void setLatitude(Coordenada latitude) {
        this.latitude = latitude;
    }

    public Coordenada getLongitude() {
        return longitude;
    }

    public void setLongitude(Coordenada longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return longitude + " " + latitude;
    }
}



