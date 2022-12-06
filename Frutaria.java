/**
 * @author: Diogo Simões e Gustavo Alves
 *
 */

/**
 * Classe Frutaria
 */

public class Frutaria extends Mercearia {
    private int numProdutos;

    /**
     * Construtor da classe Frutaria
     * @param nome
     * @param local
     * @param distrito
     * @param faturacaoMedia
     * @param custoLimpezaAnual
     * @param numProdutos
     */
    public Frutaria(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, int numProdutos) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual);
        this.tipo = "Frutaria";
        this.numProdutos = numProdutos;
    }

    public int getNumProdutos() {
        return numProdutos;
    }

    public void setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
    }

    @Override
    public double receitaAnual() {
        return numProdutos*getFaturacaoMedia();} //faturacaoMedia é a Faturação média anual por produto

    @Override
    public String toString() {
        return super.toString()+
                "Faturação média: "+ faturacaoMedia+"\n\n"+
                "Número de produtos: "+this.numProdutos +"\n\n"+
                "Custo de limpeza anual: "+this.custoLimpezaAnual+"\n\n";
    }
}
