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
        return numMedCafes*getFaturacaoMedia();}//FaturacaoMedia anual por cafe

    public boolean verifica(){
        return verificaEmpresa() && numMedCafes>0 && faturaAnualPCafePDia()>0 && getNumEmpMesa()>0
                && getSalarioMedAnual()>0 && getNumMedClientesDiario()>0;
    }
    @Override
    public String toString() {
        return super.toString()+
                "faturacao media:"+ faturacaoMedia+"\n"+
                "faturacao medial anual por cafe por dia: "+faturaAnualPCafePDia()+"\n"+
                "numero medio de empregados de mesa: "+this.numEmpMesa +"\n"+
                "salario medio anual: "+this.salarioMedAnual+"\n"+
                "numero medio de clientes diario: "+this.numMedClientesDiario+"\n"+
                "numero medio de cafes vendidos diariamente: "+this.numMedCafes+"\n";
    }
}
