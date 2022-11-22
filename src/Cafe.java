package src;

public class Cafe extends Restauracao{
    private float numMedCafes;

    public Cafe(String nome, String tipo, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedCafes) {
        super(nome, tipo, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedCafes = numMedCafes;
    }

    public float getNumMedCafes() {
        return numMedCafes;
    }

    public void setNumMedCafes(float numMedCafes) {
        this.numMedCafes = numMedCafes;
    }
    @Override
    public float receitaAnual() {
        return numMedCafes*getFaturacaoMedia();}//FaturacaoMedia anual por cafe
}
