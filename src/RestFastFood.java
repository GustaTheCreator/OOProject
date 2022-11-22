package src;

public class RestFastFood extends Restaurante{
    private float numMedClientesDrive;

    public RestFastFood(String nome, String tipo, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, float numMedClientesDrive) {
        super(nome, tipo, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMedClientesDrive = numMedClientesDrive;
    }

    public float getNumMedClientesDrive() {
        return numMedClientesDrive;
    }

    public void setNumMedClientesDrive(float numMedClientesDrive) {
        this.numMedClientesDrive = numMedClientesDrive;
    }

    @Override
    public float receitaAnual() {
        return 0;
    }
    
}
