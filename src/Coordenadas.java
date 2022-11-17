package src;

public class Coordenadas {
    private int horas;
    private int minutos;
    private int segundos;
    private char direcao;

    public Coordenadas(int horas, int minutos, int segundos, char direcao) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.direcao = direcao;
    }

    public int getHoras() {
        return horas;
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
