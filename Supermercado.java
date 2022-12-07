/**
 * Classe Supermercado
 */

public class Supermercado extends Mercado{
    /**
     * Construtor da classe Supermercado
     * @param nome Nome do Supermercado
     * @param local Localização do Supermercado
     * @param distrito Distrito do Supermercado
     * @param faturacaoMedia Faturação média anual por m^2
     * @param custoLimpezaAnual Custo de limpeza anual
     * @param areaCorredores Area dos corredores por m^2
     */
    public Supermercado(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, double areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual, areaCorredores);
        this.tipo = "Super Mercado";
    }
}