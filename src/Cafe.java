package src;

public class Cafe extends Restauracao{
    private float numMedCafes;

    public Cafe(String nome, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedCafes) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.tipo = "Café";
        this.numMedCafes = numMedCafes;
    }

    public float getNumMedCafes() {
        return numMedCafes;
    }

    public void setNumMedCafes(float numMedCafes) {
        this.numMedCafes = numMedCafes;
    }

    public float faturaAnualPCafePDia(){
        return getFaturacaoMedia()/365;
    }

    @Override
    public float receitaAnual() {
        return numMedCafes*getFaturacaoMedia();}//FaturacaoMedia anual por cafe
}
