package src;

public class RestFastFood extends Restaurante{
    private float numMedClientesDrive;

    public RestFastFood(String nome, Localizacao local, String distrito, float faturacaoMediaAnual, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores, float numMedClientesDrive) {
        super(nome, local, distrito, faturacaoMediaAnual, numEmpMesa, salarioMedAnual, numMedClientesDiario, numDiasFuncAnual, numMesasInteriores);
        this.numMedClientesDrive = numMedClientesDrive;
    }

    public float getNumMedClientesDrive() {
        return numMedClientesDrive;
    }

    public void setNumMedClientesDrive(float numMedClientesDrive) {
        this.numMedClientesDrive = numMedClientesDrive;
    }
}
