/**
 * Classe Hipermercado
 */

public class Hipermercado extends Mercado{
    /**
     * Construtor da classe Hipermercado
     * @param nome Nome do Hipermercado
     * @param local Localização do Hipermercado
     * @param distrito Distrito do Hipermercado
     * @param faturacaoMedia Faturação média anual por m^2
     * @param custoLimpezaAnual Custo de limpeza anual
     * @param areaCorredores Área dos corredores
     */
    public Hipermercado(String nome, Localizacao local, String distrito, double faturacaoMedia,
                        double custoLimpezaAnual, double areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual, areaCorredores);
        this.tipo = "Hipermercado";
    }
}