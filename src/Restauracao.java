package src;
abstract class Restauracao extends Empresa{
    private int numEmpMesa;
    private float salarioMedAnual;
    private float numMedClientesDiario;

    public Restauracao(String nome, Localizacao local, String distrito, float faturacaoMediaAnual, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario) {
        super(nome, local, distrito, faturacaoMediaAnual);
        this.numEmpMesa = numEmpMesa;
        this.salarioMedAnual = salarioMedAnual;
        this.numMedClientesDiario = numMedClientesDiario;
    }
}
