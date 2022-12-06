

public class RestFastFood extends Restaurante {
    private double numMedClientesDrive;
    private double FaturacaoMediaPClienteDrive;

    public RestFastFood(String nome, Localizacao local, String distrito, double faturacaoMedia, int numEmpMesa, double salarioMedAnual, double numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, double numMedClientesDrive, double faturacaoMediaPClienteDrive) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMedClientesDrive = numMedClientesDrive;
        this.FaturacaoMediaPClienteDrive = faturacaoMediaPClienteDrive;
        this.tipo = "Restaurante Fast-Food";
    }

    public double getFaturacaoMediaPClienteDrive() {
        return FaturacaoMediaPClienteDrive;
    }

    public void setFaturacaoMediaPClienteDrive(double faturacaoMediaPClienteDrive) {
        this.FaturacaoMediaPClienteDrive = faturacaoMediaPClienteDrive;
    }

    public double getNumMedClientesDrive() {
        return numMedClientesDrive;
    }

    public void setNumMedClientesDrive(double numMedClientesDrive) {
        this.numMedClientesDrive = numMedClientesDrive;
    }

    @Override
    public double receitaAnual() {
        return (getNumMesasInteriores() * getFaturacaoMedia() + numMedClientesDrive * FaturacaoMediaPClienteDrive) * getNumDiasFuncAnual();
    }//FaturacaoMedia por cada mesa por dia

    @Override
    public double despesaAnual() {
        return getNumEmpMesa() * getSalarioMedAnual();
    }
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

