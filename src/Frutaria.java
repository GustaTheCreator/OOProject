package src;

public class Frutaria extends Mercearia{
    private int numProdutos;

    public Frutaria(String nome, String tipo, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual, int numProdutos) {
        super(nome, tipo, local, distrito, faturacaoMedia, custoLimpezaAnual);
        this.numProdutos = numProdutos;
    }

    public int getNumProdutos() {
        return numProdutos;
    }

    public void setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
    }

    @Override
    public float receitaAnual() {
        return numProdutos*getFaturacaoMedia();} //faturacaoMedia é a faturacao media anual por produto

}
