/**
 * Classe Frutaria
 */

public class Frutaria extends Mercearia {
    private int numProdutos;

    /**
     * Construtor da classe Frutaria
     * @param nome Nome da Frutaria
     * @param local Localização da Frutaria
     * @param distrito Distrito da Frutaria
     * @param faturacaoMedia Faturação média anual por produto da Frutaria
     * @param custoLimpezaAnual Custo de limpeza anual da Frutaria
     * @param numProdutos Número de produtos da Frutaria
     */
    public Frutaria(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, int numProdutos) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual);
        this.tipo = "Frutaria";
        this.numProdutos = numProdutos;
    }
/**
     * Método que retorna o número de produtos da Frutaria
     * @return Número de produtos da Frutaria
     */
    public int getNumProdutos() {
        return numProdutos;
    }
/**
     * Método que define o número de produtos da Frutaria
     * @param numProdutos Número de produtos da Frutaria
     */
    public void setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
    }
/**
     * Método que retorna a receita anual da Frutaria
     * @return Receita anual da Frutaria
     */
    @Override
    public double receitaAnual() {
        return numProdutos*getFaturacaoMedia();} //faturacaoMedia é a Faturação média anual por produto
/**
     * Método toString da classe Frutaria
     * @return String com a informação da Frutaria
     */
    @Override
    public String toString() {
        return super.toString()+
                "Faturação média: "+ faturacaoMedia+"\n\n"+
                "Número de produtos: "+this.numProdutos +"\n\n"+
                "Custo de limpeza anual: "+this.custoLimpezaAnual+"\n\n";
    }
}
