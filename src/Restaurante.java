package src;

abstract class Restaurante extends Restauracao{
    private int numDiasFuncAnual;
    private int numMesasInteriores;

    public Restaurante(String nome, Localizacao local, String distrito, float faturacaoMedia, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, int numDiasFuncAnual, int numMesasInteriores) {
        super(nome, local, distrito, faturacaoMedia, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numDiasFuncAnual = numDiasFuncAnual;
        this.numMesasInteriores = numMesasInteriores;
    }

    public int getNumDiasFuncAnual() {
        return numDiasFuncAnual;
    }

    public void setNumDiasFuncAnual(int numDiasFuncAnual) {
        this.numDiasFuncAnual = numDiasFuncAnual;
    }

    public int getNumMesasInteriores() {
        return numMesasInteriores;
    }

    public void setNumMesasInteriores(int numMesasInteriores) {
        this.numMesasInteriores = numMesasInteriores;
    }
}

