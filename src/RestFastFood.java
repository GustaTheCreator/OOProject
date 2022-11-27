package src;

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
                "faturacao media por cada mesa por dia: "+ faturacaoMedia+"\n"+
                "numero de empregados de mesa: "+this.numEmpMesa +"\n"+
                "salario medio anual: "+this.salarioMedAnual+"\n"+
                "numero medio de clientes diario: "+this.numMedClientesDiario+"\n"+
                "numero medio de clientes drive: "+this.numMedClientesDrive+"\n"+
                "faturacao media por cliente drive: "+this.FaturacaoMediaPClienteDrive+"\n"+
                "numero de dias de funcionamento anual: "+this.numDiasFuncAnual+"\n"+
                "numero de mesas interiores: "+this.numMesasInteriores+"\n";
    }
    public boolean verifica(){
        return verificaEmpresa() && numMedClientesDrive>0 && FaturacaoMediaPClienteDrive>0 && getNumEmpMesa()>0
                && getSalarioMedAnual()>0 && getNumMedClientesDiario()>0 && getNumDiasFuncAnual()>0 && getNumMesasInteriores()>0 && getFaturacaoMedia()>0;
    }
}

