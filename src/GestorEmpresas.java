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

    public void addEmpresa(String nome,String tipo, int horasLat,int minutosLat, int segundosLat, char direcaoLat, int horasLong,int minutosLong, int segundosLong, char direcaoLong, String distrito, float mediaAnual, float custoEmpregados, int numProdutos)
    {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Frutaria empresa = new Frutaria(nome,tipo,local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

    public void ordenarLista(int opcao){
        //opcao 1 - ordenar por nome
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
            empresas.sort((atual, proximo) -> Float.compare(atual.getFaturacaoMedia(), proximo.getFaturacaoMedia()));
        }
        if(opcao==7){
            empresas.sort((atual, proximo) -> Float.compare(atual.getFaturacaoMedia(), proximo.getFaturacaoMedia()));
            Collections.reverse(empresas);
        }
        if(opcao==8){
            empresas.sort((atual, proximo) -> atual.getNome().compareTo(proximo.getNome()));
        }
        if(opcao==9){
            empresas.sort((atual, proximo) -> atual.getNome().compareTo(proximo.getNome()));
            Collections.reverse(empresas);
        }
    }

}
