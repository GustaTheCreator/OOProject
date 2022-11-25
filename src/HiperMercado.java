package src;

public class HiperMercado extends Mercado{
    public HiperMercado(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, double areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual, areaCorredores);
        this.tipo = "Hiper Mercado";
    }
}