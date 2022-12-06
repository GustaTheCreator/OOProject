

public class Hipermercado extends Mercado{
    public Hipermercado(String nome, Localizacao local, String distrito, double faturacaoMedia,
                        double custoLimpezaAnual, double areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual, areaCorredores);
        this.tipo = "Hipermercado";
    }
}