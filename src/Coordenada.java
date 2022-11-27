package src;

import java.io.Serializable;

public class Coordenada implements Serializable {
    private int horas;
    private int minutos;
    private int segundos;
    private char direcao;

    public Coordenada(int horas, int minutos, int segundos, char direcao) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.direcao = direcao;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public String toString() {
        return horas + "°" + minutos + "'" + segundos + "\"" + direcao;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
}
