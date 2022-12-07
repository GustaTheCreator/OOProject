/**
 * Classe abstrata Mercearia
 */
public abstract class Mercearia extends Empresa {
    /**
     * Custo de limpeza anual
     */
    protected double custoLimpezaAnual;

    /**
     * Construtor da classe Mercearia
     * @param nome Nome da Mercearia
     * @param local Localização da Mercearia
     * @param distrito Distrito da Mercearia
     * @param faturacaoMedia Faturação média anual
     * @param custoLimpezaAnual Custo de limpeza anual
     */
    public Mercearia(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual) {
        super(nome, local, distrito, faturacaoMedia);
        this.tipo = "Mercearia";
        this.categoria = "Mercearia";
        this.custoLimpezaAnual = custoLimpezaAnual;
    }
    /**
     * Método que retorna o custo de limpeza anual
     * @return Custo de limpeza anual
     */

    public double getCustoLimpezaAnual() {
        return custoLimpezaAnual;
    }

    /**
     * Método que define o custo de limpeza anual
     * @param custoLimpezaAnual Custo de limpeza anual
     */

    public void setCustoLimpezaAnual(double custoLimpezaAnual) {
        this.custoLimpezaAnual = custoLimpezaAnual;
    }

    /**
     * Método que retorna a despesa anual da mercearia
     * @return despesaAnual
     */
    @Override
    public double despesaAnual() {
        return getCustoLimpezaAnual();
    }
}
