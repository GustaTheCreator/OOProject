public class Pastelaria extends Restauracao {
    private float numMedBolos;

    public Pastelaria(String nome, Localizacao local, String distrito, int numEmpMesa, float salarioMedAnual, float numMedClientesDiario, float numMedBolos) {
        super(nome, local, distrito, numEmpMesa, salarioMedAnual, numMedClientesDiario);
        this.numMedBolos = numMedBolos;
    }

}
