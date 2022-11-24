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

    public void ordenarLista(int opcao){
        if(opcao==0){
            empresas.sort((atual, proximo) -> atual.getNome().compareTo(proximo.getNome()));
        }
        if(opcao==1){
            empresas.sort((atual, proximo) -> atual.getNome().compareTo(proximo.getNome()));
            Collections.reverse(empresas);
        }
        if(opcao==2){
            empresas.sort((atual, proximo) -> atual.getTipo().compareTo(proximo.getTipo()));
        }
        if(opcao==3){
            empresas.sort((atual, proximo) -> atual.getTipo().compareTo(proximo.getTipo()));
            Collections.reverse(empresas);
        }
        if(opcao==4){
            empresas.sort((atual, proximo) -> atual.getDistrito().compareTo(proximo.getDistrito()));
        }
        if(opcao==5){
            empresas.sort((atual, proximo) -> atual.getDistrito().compareTo(proximo.getDistrito()));
            Collections.reverse(empresas);
        }
        if(opcao==6){
            empresas.sort((atual, proximo) -> Float.compare(atual.receitaAnual(), proximo.receitaAnual()));
        }
        if(opcao==7){
            empresas.sort((atual, proximo) -> Float.compare(atual.receitaAnual(), proximo.receitaAnual()));
            Collections.reverse(empresas);
        }
        if(opcao==8){
            empresas.sort((atual, proximo) -> Float.compare(atual.despesaAnual(), proximo.despesaAnual()));
        }
        if(opcao==9){
            empresas.sort((atual, proximo) -> Float.compare(atual.despesaAnual(), proximo.despesaAnual()));
            Collections.reverse(empresas);
        }
        if(opcao==10){
            empresas.sort((atual, proximo) -> Float.compare(atual.lucro(), proximo.lucro()));
        }
        if(opcao==11){
            empresas.sort((atual, proximo) -> Float.compare(atual.lucro(), proximo.lucro()));
            Collections.reverse(empresas);
        }
    }

}
