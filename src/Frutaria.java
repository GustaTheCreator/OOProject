package src;

public class Frutaria extends Mercearia {
    private int numProdutos;

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
                "Faturação média anual por produto: "+receitaAnual()+"\n\n"+
                "Número de produtos: "+this.numProdutos +"\n\n"+
                "Custo de limpeza anual: "+this.custoLimpezaAnual+"\n\n";
    }
    public boolean verifica(){
        return super.verifica() && numProdutos>0 && getFaturacaoMedia()>0 && getCustoLimpezaAnual()>0;
    }
}
