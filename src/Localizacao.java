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

    public boolean verificaCoordenadas() {
        if (latitude.getHoras() < 0 || latitude.getMinutos() < 0 || latitude.getSegundos() < 0 || latitude.getHoras() > 90
                || latitude.getMinutos() > 59 || latitude.getSegundos() > 59 || longitude.getHoras() < 0 || longitude.getMinutos() < 0 ||
                longitude.getSegundos() < 0 || longitude.getHoras() > 180
                || longitude.getMinutos() > 59 || longitude.getSegundos() > 59)
            return false;
        if (latitude.getHoras() == 90 && latitude.getMinutos() != 59 && latitude.getSegundos() != 59)
            return false;
        if (longitude.getHoras() == 180 && longitude.getMinutos() != 0 && longitude.getSegundos() != 0)
            return false;
        if (latitude.getDirecao() != 'N') {
            if (latitude.getDirecao() != 'S')
                return false;
        }
        if (longitude.getDirecao() != 'W') {
            return longitude.getDirecao() == 'E';
        }
        return true;
    }

    @Override
    public String toString() {
        return latitude + "/" + longitude;
    }
}



