package src;

public class Localizacao {
    private Coordenadas latitude;
    private Coordenadas longitude;

    public Localizacao(Coordenadas latitude, Coordenadas longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordenadas getLatitude() {
        return latitude;
    }

    public void setLatitude(Coordenadas latitude) {
        this.latitude = latitude;
    }

    public Coordenadas getLongitude() {
        return longitude;
    }

    public void setLongitude(Coordenadas longitude) {
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
        if (longitude.getDirecao() != 'W'){
            if(longitude.getDirecao() != 'E')
                return false;
        }
        return true;
    }
}



