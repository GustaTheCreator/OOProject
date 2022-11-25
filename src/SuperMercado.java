package src;

public class SuperMercado extends Mercado{
    public SuperMercado(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, double areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual, areaCorredores);
        this.tipo = "Super Mercado";
    }
}