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
                "Faturação média: "+ faturacaoMedia+"\n\n"+
                "Faturação média anual por bolo por dia: "+faturaAnualPBoloPDia()+"\n\n"+
                "Número médio de empregados de mesa: "+this.numEmpMesa +"\n\n"+
                "Salário médio anual: "+this.salarioMedAnual+"\n\n"+
                "Número médio de clientes diário: "+this.numMedClientesDiario+"\n\n"+
                "Número médio de bolos vendidos diariamente: "+this.numMedBolos+"\n\n";
    }
    public boolean verifica(){
        return verificaEmpresa() && numMedBolos>0 && faturaAnualPBoloPDia()>0 && getNumEmpMesa()>0
                && getSalarioMedAnual()>0 && getNumMedClientesDiario()>0;
    }
}
