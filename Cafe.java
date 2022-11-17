public class Cafe extends Restauracao{
    private float numMedCafes;

    public Cafe(String nome, Localizacao local, String distrito, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedCafes) {
        super(nome, local, distrito, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedCafes = numMedCafes;
    }

    public float getNumMedCafes() {
        return numMedCafes;
    }

    public void setNumMedCafes(float numMedCafes) {
        this.numMedCafes = numMedCafes;
    }
}
