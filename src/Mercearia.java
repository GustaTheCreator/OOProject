package src;

public abstract class Mercearia extends Empresa{
    private float custoLimpezaAnual;

    public Mercearia(String nome, String tipo, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual) {
        super(nome, tipo, local, distrito, faturacaoMedia);
        this.custoLimpezaAnual = custoLimpezaAnual;
    }

    public float getCustoLimpezaAnual() {
        return custoLimpezaAnual;
    }

    public void setCustoLimpezaAnual(float custoLimpezaAnual) {
        this.custoLimpezaAnual = custoLimpezaAnual;
    }
    @Override
    public float despesaAnual(){
        return getCustoLimpezaAnual();
    }
}
