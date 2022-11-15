abstract class Restaurcao extends Empresa{
    private int numEmpMesa;
    private float salarioMedAnual;
    private float numMedClientesDiario;

    public Restaurcao(String nome, Localizacao local, String distrito, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario) {
        super(nome, local, distrito);
        this.numEmpMesa = numEmpMesa;
        this.salarioMedAnual = salarioMedAnual;
        this.numMedClientesDiario = numMedClientesDiario;
    }
}
