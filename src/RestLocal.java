package src;

public class RestLocal extends Restaurante{
    private int numMesasEsplanada;
    private double custoLiceAnualMesaEsp;

    public RestLocal(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, int numMesasEsplanada, double custoLiceAnualMesaEsp) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMesasEsplanada = numMesasEsplanada;
        this.custoLiceAnualMesaEsp = custoLiceAnualMesaEsp;
        this.tipo = "Restaurante Local";
    }

    public int getNumMesasEsplanadas() {
        return numMesasEsplanada;
    }

    public void setNumMesasEsplanadas(int numMesasEsplanadas) {
        this.numMesasEsplanada = numMesasEsplanadas;
    }

    public double getcustoLiceAnualMesaEsp() {
        return custoLiceAnualMesaEsp;
    }

    public void setcustoLiceAnualMesaEsp(double custoLiceAnualMesaEsp) {
        this.custoLiceAnualMesaEsp = custoLiceAnualMesaEsp;
    }
    @Override
    public double receitaAnual() {
        return (numMesasEsplanada + getNumMesasInteriores())*getFaturacaoMedia()*getNumDiasFuncAnual();//FaturacaoMedia por cada mesa por dia
    }
    @Override
    public double despesaAnual(){
        return getNumEmpMesa()*getSalarioMedAnual()+numMesasEsplanada*custoLiceAnualMesaEsp;
    }
}
