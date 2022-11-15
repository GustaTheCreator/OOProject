public class Cafe extends Restaurcao{
    private float numMedCafes;

    public Cafe(String nome, Localizacao local, String distrito, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedCafes) {
        super(nome, local, distrito, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedCafes = numMedCafes;
    }
}
