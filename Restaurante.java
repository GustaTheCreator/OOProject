abstract class Restaurante extends Restauracao{
    private int numDiasFuncAnual;

    public Restaurante(String nome, Localizacao local, String distrito, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, int numDiasFuncAnual) {
        super(nome, local, distrito, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numDiasFuncAnual = numDiasFuncAnual;
    }
}
