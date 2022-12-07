/**
 * Classe abstrata Mercado
 */

abstract class Mercado extends Mercearia {
    /**
     * Area dos corredores por m^2
     */
    protected double areaCorredores;

    /**
     * Construtor da classe Mercado
     * @param nome Nome do Mercado
     * @param local Localização do Mercado
     * @param distrito Distrito do Mercado
     * @param faturacaoMedia Faturação média anual por m^2
     * @param custoLimpezaAnual Custo de limpeza anual
     * @param areaCorredores Area dos corredores por m^2
     */
    public Mercado(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, double areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual);
        this.areaCorredores = areaCorredores;
        this.tipo = "Mercado";
        this.subCategoria = "Mercado";
    }
    /**
     * Método que retorna a área dos corredores
     * @return Area dos corredores por m^2
     */
    public double getAreaCorredores() {
        return areaCorredores;
    }

    /**
     * Método que define a área dos corredores
     * @param areaCorredores Area dos corredores por m^2
     */
    public void setAreaCorredores(double areaCorredores) {
        this.areaCorredores = areaCorredores;
    }

    /**
     * Método que retorna a receita anual do mercado
     * @return areaCorredores*getFaturacaoMedia()
     */

    @Override
    public double receitaAnual() {
        return areaCorredores*getFaturacaoMedia();}//faturacaoMedia é a Faturação média anual por m^2
    /**
     * Método toString da classe Mercado
     * @return String com a informação do Mercado
     */
    @Override
    public String toString() {
        return super.toString()+
                "Faturação média: "+ faturacaoMedia+"\n\n"+
                "Área dos corredores: "+this.areaCorredores +"\n\n"+
                "Custo de limpeza anual: "+this.custoLimpezaAnual+"\n\n";
    }
}
