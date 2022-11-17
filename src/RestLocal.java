package src;

public class RestLocal extends Restaurante{

    private int numMesasEsplanada;
    private float custoLiceAnualMesaEsp;

    public RestLocal(String nome, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, int numMesasEsplanadas, float custoLiceAnualMesaEsp) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMesasEsplanada = numMesasEsplanadas;
        this.custoLiceAnualMesaEsp = custoLiceAnualMesaEsp;
    }

    public int getNumMesasEsplanadas() {
        return numMesasEsplanada;
    }

    public void setNumMesasEsplanadas(int numMesasEsplanadas) {
        this.numMesasEsplanada = numMesasEsplanadas;
    }

    public float getcustoLiceAnualMesaEsp() {
        return custoLiceAnualMesaEsp;
    }

    public void setcustoLiceAnualMesaEsp(float custoLiceAnualMesaEsp) {
        this.custoLiceAnualMesaEsp = custoLiceAnualMesaEsp;
    }

    @Override
    public float receitaAnual() {
        return (numMesasEsplanada + getNumMesasInteriores())*getFaturacaoMedia();
    }
    @Override
    public float despesaAnual(){
        return getNumEmpMesa()*getSalarioMedAnual()+numMesasEsplanada*custoLiceAnualMesaEsp;
    }
}
