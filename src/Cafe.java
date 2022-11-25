package src;

public class Cafe extends Restauracao {
    private double numMedCafes;

    public Cafe(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario, double numMedCafes) {
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

    @Override
    public String toString() {
        return getNome()+"/"+getLocal()+"/"+getDistrito()+"/"+getFaturacaoMedia()+"/"+getNumEmpMesa()+"/"+getSalarioMedAnual()+"/"+getNumMedClientesDiario()+"/"+getNumMedCafes();
    }
}
