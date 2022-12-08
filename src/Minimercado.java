package src;
/**
 * Classe Minimercado
 */

public class Minimercado extends Mercado {
    /**
     * Construtor da classe Minimercado
     * @param nome Nome do Minimercado
     * @param local Localização do Minimercado
     * @param distrito Distrito do Minimercado
     * @param faturacaoMedia Faturação média anual por m^2
     * @param custoLimpezaAnual Custo de limpeza anual
     * @param areaCorredores Área dos corredores
     */

    public Minimercado(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, double areaCorredores) {
        super(nome,local,distrito,faturacaoMedia,custoLimpezaAnual,areaCorredores);
        this.tipo = "Minimercado";
    }



}