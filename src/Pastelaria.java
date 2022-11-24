package src;

public class Pastelaria extends Restauracao {
    private float numMedBolos;

    public Pastelaria(String nome, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedBolos) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedBolos = numMedBolos;
        this.tipo = "Pastelaria";
    }

    public float getNumMedBolos() {
        return numMedBolos;
    }

    public void setNumMedBolos(float numMedBolos) {
        this.numMedBolos = numMedBolos;
    }
    public float faturaAnualPBoloPDia(){
        return getFaturacaoMedia()/365;
    }
    @Override
    public float receitaAnual(){
        return numMedBolos*getFaturacaoMedia();
    }//FaturacaoMedia anual por bolo
}
