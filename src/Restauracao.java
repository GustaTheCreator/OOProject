package src;
public abstract class Restauracao extends Empresa{
    private int numEmpMesa;
    private float salarioMedAnual;
    private float numMedClientesDiario;

    public Restauracao(String nome, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario) {
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
    public float getSalarioMedAnual() {
        return salarioMedAnual;
    }
    public void setNumEmpMesa(int numEmpMesa) {
        this.numEmpMesa = numEmpMesa;
    }
    public void setSalarioMedAnual(float salarioMedAnual) {
        this.salarioMedAnual = salarioMedAnual;
    }
    public void setNumMedClientesDiario(float numMedClientesDiario) {this.numMedClientesDiario = numMedClientesDiario;}
    public float getNumMedClientesDiario() {
        return numMedClientesDiario;
    }
    public float despesaAnual(){
        return numEmpMesa*salarioMedAnual;
    }

}
