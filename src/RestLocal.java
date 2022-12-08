package src;
/**
 * Classe Restaurante Local
 */
public class RestLocal extends Restaurante {
    /**
     * Número de mesas de esplanada
     */
    private int numMesasEsplanada;
    /**
     * Custo licença anual por mesa de esplanada
     */
    private double custoLiceAnualMesaEsp;

    /**
     * Construtor da classe Restaurante Local
     * @param nome Nome do Restaurante Local
     * @param local Localização do Restaurante Local
     * @param distrito Distrito do Restaurante Local
     * @param faturacaoMedia Faturação média por mesa por dia
     * @param numEmpMesa Número de empregados de mesa
     * @param salarioMedAnual Salário médio anual dos empregados
     * @param numMedClientesDiario Número médio de clientes por dia
     * @param numDiasFuncAnual Número de dias de funcionamento anual
     * @param numMesasInteriores Número de mesas interiores
     * @param numMesasEsplanada Número de mesas de esplanada
     * @param custoLiceAnualMesaEsp Custo licença anual por mesa de esplanada
     */

    public RestLocal(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, int numMesasEsplanada, double custoLiceAnualMesaEsp) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMesasEsplanada = numMesasEsplanada;
        this.custoLiceAnualMesaEsp = custoLiceAnualMesaEsp;
        this.tipo = "Restaurante Local";
    }

    /**
     * Métoodo que retorna o número de mesas de esplanada
     * @return Número de mesas de esplanada
     */
    public int getNumMesasEsplanadas() {
        return numMesasEsplanada;
    }
    /**
     * Método que define o número de mesas de esplanada
     * @param numMesasEsplanadas Número de mesas de esplanada
     */
    public void setNumMesasEsplanadas(int numMesasEsplanadas) {
        this.numMesasEsplanada = numMesasEsplanadas;
    }
    /**
     * Método que retorna o custo licença anual por mesa de esplanada
     * @return Custo licença anual por mesa de esplanada
     */
    public double getCustoLiceAnualMesaEsp() {
        return custoLiceAnualMesaEsp;
    }

    /**
     * Método que define o custo licença anual por mesa de esplanada
     * @param custoLiceAnualMesaEsp Custo licença anual por mesa de esplanada
     */
    public void setcustoLiceAnualMesaEsp(double custoLiceAnualMesaEsp) {
        this.custoLiceAnualMesaEsp = custoLiceAnualMesaEsp;
    }

    /**
     * Método que calcula a receita anual do Restaurante Local
     * @return Receita anual do Restaurante Local
     */
    @Override
    public double receitaAnual() {
        return (numMesasEsplanada + getNumMesasInteriores())*getFaturacaoMedia()*getNumDiasFuncAnual();//FaturacaoMedia por cada mesa por dia
    }

    /**
     * Método que calcula a despesa anual do Restaurante Local
     * @return Despesa anual do Restaurante Local
     */
    @Override
    public double despesaAnual() {
        return getNumEmpMesa()*getSalarioMedAnual()+numMesasEsplanada*custoLiceAnualMesaEsp;
    }

    /**
     * Método toString da classe Restaurante Local
     * @return String com os dados do Restaurante Local
     */
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
