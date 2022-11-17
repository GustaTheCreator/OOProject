package src;
abstract class Mercearia extends Empresa{
    private float custoLimpezaAnual;

    public Mercearia(String nome, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual) {
        super(nome, local, distrito, faturacaoMedia);
        this.custoLimpezaAnual = custoLimpezaAnual;
    }

    public float getCustoLimpezaAnual() {
        return custoLimpezaAnual;
    }

    public void setCustoLimpezaAnual(float custoLimpezaAnual) {
        this.custoLimpezaAnual = custoLimpezaAnual;
    }
}
