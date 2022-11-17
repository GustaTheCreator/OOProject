abstract class Restauracao extends Empresa{
    private int numEmpMesa;
    private float salarioMedAnual;
    private float numMedClientesDiario;

    public Restauracao(int numEmpMesa, float salarioMedAnual, float numMedClientesDiario) {
        this.numEmpMesa = numEmpMesa;
        this.salarioMedAnual = salarioMedAnual;
        this.numMedClientesDiario = numMedClientesDiario;
    }
}
