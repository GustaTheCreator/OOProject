package  src;

public class Minimercado extends Mercado {

    public Minimercado(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, double areaCorredores) {
        super(nome,local,distrito,faturacaoMedia,custoLimpezaAnual,areaCorredores);
        this.tipo = "Minimercado";
    }



}