package src;

public class RestFastFood extends Restaurante{
    private float numMedClientesDrive;
    private float FaturacaoMediaPClienteDrive;

    public RestFastFood(String nome, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, float numMedClientesDrive, float faturacaoMediaPClienteDrive) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMedClientesDrive = numMedClientesDrive;
        this.FaturacaoMediaPClienteDrive = faturacaoMediaPClienteDrive;
        this.tipo = "Restaurante Fast-Food";
    }
    public float getFaturacaoMediaPClienteDrive() {
        return FaturacaoMediaPClienteDrive;
    }
    public void setFaturacaoMediaPClienteDrive(float faturacaoMediaPClienteDrive) {
        this.FaturacaoMediaPClienteDrive = faturacaoMediaPClienteDrive;
    }
    public float getNumMedClientesDrive() {
        return numMedClientesDrive;
    }
    public void setNumMedClientesDrive(float numMedClientesDrive) {
        this.numMedClientesDrive = numMedClientesDrive;
    }
    @Override
    public float receitaAnual(){
        return (getNumMesasInteriores()*getFaturacaoMedia()+numMedClientesDrive*FaturacaoMediaPClienteDrive)*getNumDiasFuncAnual();
    }//FaturacaoMedia por cada mesa por dia
    @Override
    public float despesaAnual(){return getNumEmpMesa()*getSalarioMedAnual();}

}
