/**
 * Classe Restaurante Fast Food
 */

public class RestFastFood extends Restaurante {
    /**
     * Número médio de clientes Drive-Thru diário
     */
    private double numMedClientesDrive;
    /**
     * Faturação média por cliente Drive-Thru diário
     */
    private double FaturacaoMediaPClienteDrive;

    /**
     * Construtror da classe Restaurante Fast Food
     * @param nome Nome do restaurante Fast Food
     * @param local Localização do restaurante Fast Food
     * @param distrito Distrito do restaurante Fast Food
     * @param faturacaoMedia Faturação média de cada mesa por dia do restaurante Fast Food
     * @param numEmpMesa Número de empregados de mesa do restaurante Fast Food
     * @param salarioMedAnual Salário médio anual dos empregados do restaurante Fast Food
     * @param numMedClientesDiario Número médio de clientes por dia do restaurante Fast Food
     * @param numDiasFuncAnual Número de dias de funcionamento anual do restaurante Fast Food
     * @param numMesasInteriores Número de mesas interiores do restaurante Fast Food
     * @param numMedClientesDrive Número médio de clientes Drive-Thru diário do restaurante Fast Food
     * @param faturacaoMediaPClienteDrive Faturação média por cliente Drive-Thru diário do restaurante Fast Food
     */

    public RestFastFood(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, double numMedClientesDrive, double faturacaoMediaPClienteDrive) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMedClientesDrive = numMedClientesDrive;
        this.FaturacaoMediaPClienteDrive = faturacaoMediaPClienteDrive;
        this.tipo = "Restaurante Fast-Food";
    }

    /**
     * Método que retorna o faturação média por cliente Drive-Thru diário
     * @return Faturação média por cliente Drive-Thru diário do restaurante Fast Food
     */

    public double getFaturacaoMediaPClienteDrive() {
        return FaturacaoMediaPClienteDrive;
    }

    /**
     * Método que define o faturação média por cliente Drive-Thru diário
     * @param faturacaoMediaPClienteDrive Faturação média por cliente Drive-Thru diário do restaurante Fast Food
     */

    public void setFaturacaoMediaPClienteDrive(double faturacaoMediaPClienteDrive) {
        this.FaturacaoMediaPClienteDrive = faturacaoMediaPClienteDrive;
    }
    /**
     * Método que retorna o número médio de clientes Drive-Thru diário
     * @return Número médio de clientes Drive-Thru diário do restaurante Fast Food
     */
    public double getNumMedClientesDrive() {
        return numMedClientesDrive;
    }

    /**
     * Método que define o número médio de clientes Drive-Thru diário
     * @param numMedClientesDrive Número médio de clientes Drive-Thru diário do restaurante Fast Food
     */
    public void setNumMedClientesDrive(double numMedClientesDrive) {
        this.numMedClientesDrive = numMedClientesDrive;
    }

    /**
     * Método que retorna a receita anual do restaurante Fast Food
     * @return Receita anual do restaurante Fast Food
     */
    @Override
    public double receitaAnual() {
        return (getNumMesasInteriores() * getFaturacaoMedia() + numMedClientesDrive * FaturacaoMediaPClienteDrive) * getNumDiasFuncAnual();
    }//FaturacaoMedia por cada mesa por dia

    /**
     * Método que retorna a despesa anual do restaurante Fast Food
     * @return Despesa anual do restaurante Fast Food
     */

    @Override
    public double despesaAnual() {
        return getNumEmpMesa() * getSalarioMedAnual();
    }

    /**
     * Método toString da classe Restaurante Fast Food
     * @return String com a informação do restaurante Fast Food
     */
    @Override
    public String toString() {
        return super.toString()+
                "Faturação média por cada mesa por dia: "+ faturacaoMedia+"\n\n"+
                "Número de empregados de mesa: "+this.numEmpMesa +"\n\n"+
                "Salário médio anual: "+this.salarioMedAnual+"\n\n"+
                "Número médio de clientes diário: "+this.numMedClientesDiario+"\n\n"+
                "Número médio de clientes drive: "+this.numMedClientesDrive+"\n\n"+
                "Faturação média por cliente drive: "+this.FaturacaoMediaPClienteDrive+"\n\n"+
                "Número de dias de funcionamento anual: "+this.numDiasFuncAnual+"\n\n"+
                "Número de mesas interiores: "+this.numMesasInteriores+"\n\n";
    }
}

