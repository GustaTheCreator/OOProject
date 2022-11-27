package src;

public class Cafe extends Restauracao {
    protected double numMedCafes;

    public Cafe(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa,
                double salarioMedAnual, double numMedClientesDiario, double numMedCafes) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.tipo = "Cafe";
        this.numMedCafes = numMedCafes;
    }

    public double getNumMedCafes() {
        return numMedCafes;
    }

    public void setNumMedCafes(double numMedCafes) {
        this.numMedCafes = numMedCafes;
    }

    public double faturaAnualPCafePDia() {
        return getFaturacaoMedia()/365;
    }

    @Override
    public double receitaAnual() {
        return numMedCafes*getFaturacaoMedia();}//FaturacaoMedia anual por café

    public boolean verifica(){
        return verificaEmpresa() && numMedCafes>0 && faturaAnualPCafePDia()>0 && getNumEmpMesa()>0
                && getSalarioMedAnual()>0 && getNumMedClientesDiario()>0;
    }
    @Override
    public String toString() {
        return super.toString()+
                "Faturação média: "+faturacaoMedia+"\n\n"+
                "Faturação média anual por café por dia: "+(Math.round(faturaAnualPCafePDia()*100.0)/100.0)+"\n\n"+
                "Número médio de empregados de mesa: "+this.numEmpMesa +"\n\n"+
                "Salário medio anual: "+this.salarioMedAnual+"\n\n"+
                "Número médio de clientes diário: "+this.numMedClientesDiario+"\n\n"+
                "Número médio de cafes vendidos diariamente: "+this.numMedCafes+"\n\n";
    }
}
