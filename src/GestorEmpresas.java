package src;

import java.util.ArrayList;

public class GestorEmpresas {
    private ArrayList<Empresa> empresas;

    public GestorEmpresas() {
        this.empresas = new ArrayList<Empresa>();
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void addEmpresa(String nome, int horasLat,int minutosLat, int segundosLat, char direcaoLat, int horasLong,int minutosLong, int segundosLong, char direcaoLong, String distrito, float mediaAnual, float custoEmpregados, int numProdutos)
    {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Frutaria empresa = new Frutaria(nome, local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

}
