package src;

public class Pastelaria extends Restauracao {
    private double numMedBolos;

    public Pastelaria(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa,
                      double salarioMedAnual, double numMedClientesDiario, double numMedBolos) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedBolos = numMedBolos;
        this.tipo = "Pastelaria";
    }

    public double getNumMedBolos() {
        return numMedBolos;
    }

    public void setNumMedBolos(double numMedBolos) {
        this.numMedBolos = numMedBolos;
    }
    public double faturaAnualPBoloPDia() {
        return getFaturacaoMedia()/365;
    }
    @Override
    public double receitaAnual() {
        return numMedBolos*getFaturacaoMedia();
    }//FaturacaoMedia anual por bolo
    @Override
    public String toString() {
        return super.toString()+
                "faturacao media:"+ faturacaoMedia+"\n"+
                "faturacao medial anual por bolo por dia: "+faturaAnualPBoloPDia()+"\n"+
                "numero medio de empregados de mesa: "+this.numEmpMesa +"\n"+
                "salario medio anual: "+this.salarioMedAnual+"\n"+
                "numero medio de clientes diario: "+this.numMedClientesDiario+"\n"+
                "numero medio de bolos vendidos diariamente: "+this.numMedBolos+"\n";
    }
    public boolean verifica(){
        return verificaEmpresa() && numMedBolos>0 && faturaAnualPBoloPDia()>0 && getNumEmpMesa()>0
                && getSalarioMedAnual()>0 && getNumMedClientesDiario()>0;
    }
}
