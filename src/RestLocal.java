package src;

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
                "faturacao media por cada mesa por dia: "+ faturacaoMedia+"\n"+
                "numero de empregados de mesa: "+this.numEmpMesa +"\n"+
                "salario medio anual: "+this.salarioMedAnual+"\n"+
                "numero medio de clientes diario: "+this.numMedClientesDiario+"\n"+
                "numero de dias de funcionamento anual: "+this.numDiasFuncAnual+"\n"+
                "numero de mesas interiores: "+this.numMesasInteriores+"\n"+
                "numero de mesas de esplanada: "+this.numMesasEsplanada+"\n"+
                "custo de licenca anual por cada mesa de esplanada: "+this.custoLiceAnualMesaEsp+"\n";

    }
    public boolean verifica(){
        return verificaEmpresa() && numMesasEsplanada>0 && custoLiceAnualMesaEsp>0 && getNumEmpMesa()>0
                && getSalarioMedAnual()>0 && getNumMedClientesDiario()>0 && getNumDiasFuncAnual()>0 && getNumMesasInteriores()>0 && getFaturacaoMedia()>0;
    }
}
