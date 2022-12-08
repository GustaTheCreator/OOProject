package src;

/**
 * Classe abstrata de uma Empresa de Restauracao
 */
public abstract class Restauracao extends Empresa {
    /**
     * Número de empregados de mesa
     */
    protected  int numEmpMesa;
    /**
     * Salário médio anual dos empregados
     */
    protected  double salarioMedAnual;
    /**
     * Número médio de clientes por dia
     */
    protected  double numMedClientesDiario;

    /**
     * Construtor da classe Restauracao
     * @param nome Nome da Empresa de Restauracao
     * @param local Localização da Empresa de Restauracao
     * @param distrito Distrito da Empresa de Restauracao
     * @param faturacaoMedia Faturação média anual
     * @param numEmpMesa Número de empregados de mesa
     * @param salarioMedAnual Salário médio anual dos empregados
     * @param numMedClientesDiario Número médio de clientes por dia
     */

    public Restauracao(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario) {
        super(nome, local, distrito, faturacaoMedia);
        this.tipo = "Restauração";
        this.categoria = "Restauração";
        this.numEmpMesa = numEmpMesa;
        this.salarioMedAnual = salarioMedAnual;
        this.numMedClientesDiario = numMedClientesDiario;
    }

    /**
     * Método que retorna o número de empregados de mesa
     * @return Número de empregados de mesa
     */
    public int getNumEmpMesa() {
        return numEmpMesa;
    }

    /**
     * Método que retorna o salário médio anual dos empregados
     * @return Salário médio anual dos empregados
     */
    public double getSalarioMedAnual() {
        return salarioMedAnual;
    }

    /**
     * Método que define o número de empregados de mesa
     * @param numEmpMesa Número de empregados de mesa
     */
    public void setNumEmpMesa(int numEmpMesa) {
        this.numEmpMesa = numEmpMesa;
    }

    /**
     * Método que define o salário médio anual dos empregados
     * @param salarioMedAnual Salário médio anual dos empregados
     */
    public void setSalarioMedAnual(double salarioMedAnual) {
        this.salarioMedAnual = salarioMedAnual;
    }

    /**
     * Método que define o número médio de clientes por dia
     * @param numMedClientesDiario Número médio de clientes por dia
     */
    public void setNumMedClientesDiario(double numMedClientesDiario) {
        this.numMedClientesDiario = numMedClientesDiario;
    }

    /**
     * Método que retorna o número médio de clientes diário
     * @return Número médio de clientes diário
     */
    public double getNumMedClientesDiario() {
        return numMedClientesDiario;
    }

    /**
     * Método que retorna a despesa anual da empresa de restauração
     * @return Despesa anual
     */
    public double despesaAnual() {
        return numEmpMesa*salarioMedAnual;
    }

}
