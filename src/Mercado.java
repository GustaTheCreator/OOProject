package src;

abstract class Mercado extends Mercearia {
    protected double areaCorredores;

    public Mercado(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual, double areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual);
        this.areaCorredores = areaCorredores;
        this.tipo = "Mercado";
        this.subCategoria = "Mercado";
    }

    public double getAreaCorredores() {
        return areaCorredores;
    }

    public void setAreaCorredores(double areaCorredores) {
        this.areaCorredores = areaCorredores;
    }

    @Override
    public double receitaAnual() {
        return areaCorredores*getFaturacaoMedia();}//faturacaoMedia é a faturacao media anual por m^2
    @Override
    public String toString() {
        return super.toString()+
                "faturacao media"+ faturacaoMedia+"\n"+
                "faturacao medial anual por m^2: "+receitaAnual()+"\n"+
                "area dos corredores: "+this.areaCorredores +"\n"+
                "custo de limpeza anual: "+this.custoLimpezaAnual+"\n";
    }
    public boolean verifica(){
        return verificaEmpresa() && areaCorredores>0 && getFaturacaoMedia()>0 && getCustoLimpezaAnual()>0;
    }
}
