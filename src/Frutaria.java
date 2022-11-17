package src;
public class Frutaria extends Mercearia{
    private int numProdutos;

    public Frutaria(String nome, Localizacao local, String distrito, float faturacaoMediaAnual, float custoLimpezaAnual, int numProdutos) {
        super(nome, local, distrito, faturacaoMediaAnual, custoLimpezaAnual);
        this.numProdutos = numProdutos;
    }

    public int getNumProdutos() {
        return numProdutos;
    }

    public void setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
    }
}
