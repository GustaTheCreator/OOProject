package src;

public class Pastelaria extends Restauracao {
    private float numMedBolos;

    public Pastelaria(String nome, String tipo, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedBolos) {
        super(nome, tipo, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedBolos = numMedBolos;
    }

    public float getNumMedBolos() {
        return numMedBolos;
    }

    public void setNumMedBolos(float numMedBolos) {
        this.numMedBolos = numMedBolos;
    }
    public float receitaAnual(){
        return numMedBolos*getFaturacaoMedia();
    }
}
