/**
 * Classe abstrata Restaurante
 */
public abstract class Restaurante extends Restauracao {
    /**
     * Número de dias de funcionamento anual
     */
    protected int numDiasFuncAnual;
    /**
     * Número de mesas interiores
     */
    protected int numMesasInteriores;

    /**
     * Construtor da classe Restaurante
     * @param nome Nome do Restaurante
     * @param local Localização do Restaurante
     * @param distrito Distrito do Restaurante
     * @param faturacaoMedia Faturação média anual
     * @param numEmpMesa Número de empregados de mesa
     * @param salarioMedAnual Salário médio anual dos empregados
     * @param numMedClientesDiario Número médio de clientes por dia
     * @param numDiasFuncAnual Número de dias de funcionamento anual
     * @param numMesasInteriores Número de mesas interiores
     */
    public Restaurante(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.tipo = "Restaurante";
        this.subCategoria = "Restaurante";
        this.numDiasFuncAnual = numDiasFuncAnual;
        this.numMesasInteriores = numMesasInteriores;
    }

    /**
     * Método que retorna o número de dias de funcionamento anual
     * @return Número de dias de funcionamento anual
     */
    public int getNumDiasFuncAnual() {
        return numDiasFuncAnual;
    }

    /**
     * Método que define o número de dias de funcionamento anual
     * @param numDiasFuncAnual Número de dias de funcionamento anual
     */
    public void setNumDiasFuncAnual(int numDiasFuncAnual) {
        this.numDiasFuncAnual = numDiasFuncAnual;
    }

    /**
     * Método que retorna o número de mesas interiores
     * @return Número de mesas interiores
     */
    public int getNumMesasInteriores() {
        return numMesasInteriores;
    }

    /**
     * Método que define o número de mesas interiores
     * @param numMesasInteriores Número de mesas interiores
     */
    public void setNumMesasInteriores(int numMesasInteriores) {
        this.numMesasInteriores = numMesasInteriores;
    }
}

