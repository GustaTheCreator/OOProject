package src;

import java.util.ArrayList;
import java.util.Collections;

public class GestorEmpresas {
    private ArrayList<Empresa> empresas;

    public GestorEmpresas() {
        this.empresas = new ArrayList<Empresa>();
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void addFrutaria(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong,int minutosLong, int segundosLong, char direcaoLong, String distrito, float mediaAnual, float custoEmpregados, int numProdutos)
    {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Frutaria empresa = new Frutaria(nome, local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }
    public void addCafe(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong,int minutosLong, int segundosLong, char direcaoLong, String distrito, float mediaAnual, float custoEmpregados, int numProdutos)
    {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Cafe empresa = new Cafe(nome, local, distrito, segundosLong, direcaoLong, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }
    public void addRestaurante(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong,int minutosLong, int segundosLong, char direcaoLong, String distrito, float mediaAnual, float custoEmpregados, int numProdutos)
    {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        RestFastFood empresa = new RestFastFood(nome, local, distrito, direcaoLat, horasLong, minutosLong, mediaAnual, segundosLong, direcaoLong, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }
    public void addMinimercado(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong,int minutosLong, int segundosLong, char direcaoLong, String distrito, float mediaAnual, float custoEmpregados, int numProdutos){
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Minimercado empresa = new Minimercado(nome, local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }


    public void ordenarLista(int opcao){
        switch(opcao) {
            case 0 -> {
                empresas.sort((atual, proximo) -> atual.getNome().compareToIgnoreCase(proximo.getNome()));
            }
            case 1 -> {
                empresas.sort((atual, proximo) -> atual.getNome().compareToIgnoreCase(proximo.getNome()));
                Collections.reverse(empresas);
            }
            case 2 -> {
                empresas.sort((atual, proximo) -> atual.getTipo().compareToIgnoreCase(proximo.getTipo()));
            }
            case 3 -> {
                empresas.sort((atual, proximo) -> atual.getTipo().compareToIgnoreCase(proximo.getTipo()));
                Collections.reverse(empresas);
            }
            case 4 -> {
                empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));
            }
            case 5 -> {
                empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));
                Collections.reverse(empresas);
            }
            case 6 -> {
                empresas.sort((atual, proximo) -> Float.compare(atual.receitaAnual(), proximo.receitaAnual()));
            }
            case 7 -> {
                empresas.sort((atual, proximo) -> Float.compare(atual.receitaAnual(), proximo.receitaAnual()));
                Collections.reverse(empresas);
            }
            case 8 -> {
                empresas.sort((atual, proximo) -> Float.compare(atual.despesaAnual(), proximo.despesaAnual()));
            }
            case 9 -> {
                empresas.sort((atual, proximo) -> Float.compare(atual.despesaAnual(), proximo.despesaAnual()));
                Collections.reverse(empresas);
            }
            case 10 -> {
                empresas.sort((atual, proximo) -> Float.compare(atual.lucro(), proximo.lucro()));
            }
            case 11 -> {
                empresas.sort((atual, proximo) -> Float.compare(atual.lucro(), proximo.lucro()));
                Collections.reverse(empresas);
            }
        }
    }
}

