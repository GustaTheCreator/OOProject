package src;

public abstract class Restauracao extends Empresa {
    protected  int numEmpMesa;
    protected  double salarioMedAnual;
    protected  double numMedClientesDiario;

    public Restauracao(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario) {
        super(nome, local, distrito, faturacaoMedia);
        this.tipo = "Restauração";
        this.categoria = "Restauração";
        this.numEmpMesa = numEmpMesa;
        this.salarioMedAnual = salarioMedAnual;
        this.numMedClientesDiario = numMedClientesDiario;
    }

    public int getNumEmpMesa() {
        return numEmpMesa;
    }
    public double getSalarioMedAnual() {
        return salarioMedAnual;
    }
    public void setNumEmpMesa(int numEmpMesa) {
        this.numEmpMesa = numEmpMesa;
    }
    public void setSalarioMedAnual(double salarioMedAnual) {
        this.salarioMedAnual = salarioMedAnual;
    }
    public void setNumMedClientesDiario(double numMedClientesDiario) {this.numMedClientesDiario = numMedClientesDiario;}
    public double getNumMedClientesDiario() {
        return numMedClientesDiario;
    }
    public double despesaAnual() {
        return numEmpMesa*salarioMedAnual;
    }

}
