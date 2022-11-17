package src;

public class Pastelaria extends Restauracao {
    private float numMedBolos;

    public Pastelaria(String nome, Localizacao local, String distrito, float faturacaoMediaAnual, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedBolos) {
        super(nome, local, distrito, faturacaoMediaAnual, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedBolos = numMedBolos;
    }

    public float getNumMedBolos() {
        return numMedBolos;
    }

    public void setNumMedBolos(float numMedBolos) {
        this.numMedBolos = numMedBolos;
    }
}
