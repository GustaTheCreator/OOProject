package src;

public class RestLocal extends Restaurante{

    private int numMesasEsplanadas;
    private float custoLicencaAnual;

    public RestLocal(String nome, Localizacao local, String distrito, float faturacaoMediaAnual, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, int numMesasEsplanadas, float custoLicencaAnual) {
        super(nome, local, distrito, faturacaoMediaAnual, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMesasEsplanadas = numMesasEsplanadas;
        this.custoLicencaAnual = custoLicencaAnual;
    }

    public int getNumMesasEsplanadas() {
        return numMesasEsplanadas;
    }

    public void setNumMesasEsplanadas(int numMesasEsplanadas) {
        this.numMesasEsplanadas = numMesasEsplanadas;
    }

    public float getCustoLicencaAnual() {
        return custoLicencaAnual;
    }

    public void setCustoLicencaAnual(float custoLicencaAnual) {
        this.custoLicencaAnual = custoLicencaAnual;
    }
}
