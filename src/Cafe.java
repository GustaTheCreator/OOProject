package src;
/**
 * Classe Cafe
 */
public class Cafe extends Restauracao {
    /**
     * Número medio de Cafés vendidos por dia
     */
    protected double numMedCafes;
    /**
     * Construtor da classe Cafe
     * @param nome Nome do Café
     * @param local Localização do Café
     * @param distrito Distrito do Café
     * @param faturacaoMedia Facturação média anual por café vendido do Café
     * @param numEmpMesa Número de empregados por mesa
     * @param salarioMedAnual Salário médio anual dos empregados
     * @param numMedClientesDiario Número médio de clientes por dia
     * @param numMedCafes Número médio de cafés vendidos por dia
     */
    public Cafe(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa,
                double salarioMedAnual, double numMedClientesDiario, double numMedCafes) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.tipo = "Cafe";
        this.numMedCafes = numMedCafes;
    }
    /**
     * Método que retorna o número médio de cafés vendidos por dia
     * @return Número médio de cafés vendidos por dia
     */
    public double getNumMedCafes() {
        return numMedCafes;
    }

    /**
     * Metodo que define o número médio de cafés vendidos por dia
     * @param numMedCafes Número médio de cafés vendidos por dia
     */
    public void setNumMedCafes(double numMedCafes) {
        this.numMedCafes = numMedCafes;
    }
    /**
     * Método que retorna a faturacao media anual por café por dia do Café
     * @return Fatuação media anual por café por dia do Café
     */
    public double faturaAnualPCafePDia() {
        return getFaturacaoMedia()/365;
    }

    /**
     * Método que retorna a receita anual do cafe
     * @return numMedCafes*getFaturacaoMedia()
     */
    @Override
    public double receitaAnual() {
        return numMedCafes*365*getFaturacaoMedia();}//FaturacaoMedia anual por café

    /**
     * Método toString da classe Cafe
     * @return String com a informação do Café
     */

    @Override
    public String toString() {
        return super.toString()+
                "Faturação média: "+faturacaoMedia+"\n\n"+
                "Faturação média anual por café por dia: "+(Math.round(faturaAnualPCafePDia()*100.0)/100.0)+"\n\n"+
                "Número médio de empregados de mesa: "+this.numEmpMesa +"\n\n"+
                "Salário medio anual: "+this.salarioMedAnual+"\n\n"+
                "Número médio de clientes diário: "+this.numMedClientesDiario+"\n\n"+
                "Número médio de cafes vendidos diariamente: "+this.numMedCafes+"\n\n";
    }
}
