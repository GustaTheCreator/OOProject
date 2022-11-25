package src;

public class Pastelaria extends Restauracao {
    private double numMedBolos;

    public Pastelaria(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario, double numMedBolos) {
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
}
