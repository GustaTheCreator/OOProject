package src;

/**
 * Classe Pastelaria
 */

public class Pastelaria extends Restauracao {
    /**
     * Número médios de bolos
     */
    private double numMedBolos;

    /**
     * Construtor da classe Pastelaria
     * @param nome Nome da Pastelaria
     * @param local Localização da Pastelaria
     * @param distrito Distrito da Pastelaria
     * @param faturacaoMedia Facturação média anual por bolo vendido da Pastelaria
     * @param numEmpMesa Numero de empregados de mesa da Pastelaria
     * @param salarioMedAnual Salário médio anual dos empregados de mesa da Pastelaria
     * @param numMedClientesDiario Número médio de clientes por dia da Pastelaria
     * @param numMedBolos Número médio de bolos vendidos por dia da Pastelaria
     */

    public Pastelaria(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa,
                      double salarioMedAnual, double numMedClientesDiario, double numMedBolos) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedBolos = numMedBolos;
        this.tipo = "Pastelaria";
    }

    /**
     * Método que retorna o número médio de bolos vendidos por dia
     * @return Número médio de bolos vendidos por dia
     */
    public double getNumMedBolos() {
        return numMedBolos;
    }

    /**
     * Método que define o número médio de bolos vendidos por dia
     * @param numMedBolos Número médio de bolos vendidos por dia
     */
    public void setNumMedBolos(double numMedBolos) {
        this.numMedBolos = numMedBolos;
    }

    /**
     * Método que retorna a faturacao media anual por bolo por dia da Pastelaria
     * @return Fatuação media anual por bolo por dia da Pastelaria
     */
    public double faturaAnualPBoloPDia() {
        return getFaturacaoMedia()/365;
    }

    /**
     * Método que retorna a receita anual da Pastelaria
     * @return Receita anual da Pastelaria
     */
    @Override
    public double receitaAnual() {
        return numMedBolos*365*getFaturacaoMedia();////FaturacaoMedia é a faturacao media anual por bolo
    }

    /**
     * Método toString da classe Pastelaria
     * @return String com a informação da Pastelaria
     */
    @Override
    public String toString() {
        return super.toString()+
                "Faturação média: "+ faturacaoMedia+"\n\n"+
                "Faturação média anual por bolo por dia: "+faturaAnualPBoloPDia()+"\n\n"+
                "Número médio de empregados de mesa: "+this.numEmpMesa +"\n\n"+
                "Salário médio anual: "+this.salarioMedAnual+"\n\n"+
                "Número médio de clientes diário: "+this.numMedClientesDiario+"\n\n"+
                "Número médio de bolos vendidos diariamente: "+this.numMedBolos+"\n\n";
    }
}
