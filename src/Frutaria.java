package src;

public class Frutaria extends Mercearia{
    private int numProdutos;

    public Frutaria(String nome, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual, int numProdutos) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual);
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
        return numProdutos*getFaturacaoMedia();
    }
    public float despesaAnual(){
        return getCustoLimpezaAnual();
    }
}
