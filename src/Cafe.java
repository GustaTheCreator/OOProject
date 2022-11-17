package src;

public class Cafe extends Restauracao{
    private float numMedCafes;

    public Cafe(String nome, Localizacao local, String distrito, float faturacaoMediaAnual, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedCafes) {
        super(nome, local, distrito, faturacaoMediaAnual, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedCafes = numMedCafes;
    }

    public float getNumMedCafes() {
        return numMedCafes;
    }

    public void setNumMedCafes(float numMedCafes) {
        this.numMedCafes = numMedCafes;
    }
}
