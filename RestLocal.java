

public class RestLocal extends Restaurante {
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

    public double getCustoLiceAnualMesaEsp() {
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
    public double despesaAnual() {
        return getNumEmpMesa()*getSalarioMedAnual()+numMesasEsplanada*custoLiceAnualMesaEsp;
    }
    @Override
    public String toString() {
        return super.toString()+
                "Faturação média por cada mesa por dia: "+ faturacaoMedia+"\n\n"+
                "Número de empregados de mesa: "+this.numEmpMesa +"\n\n"+
                "Salário médio anual: "+this.salarioMedAnual+"\n\n"+
                "Número médio de clientes diário: "+this.numMedClientesDiario+"\n\n"+
                "Número de dias de funcionamento anual: "+this.numDiasFuncAnual+"\n\n"+
                "Número de mesas interiores: "+this.numMesasInteriores+"\n\n"+
                "Número de mesas de esplanada: "+this.numMesasEsplanada+"\n\n"+
                "custo de licenca anual por cada mesa de esplanada: "+this.custoLiceAnualMesaEsp+"\n\n";

    }
}
