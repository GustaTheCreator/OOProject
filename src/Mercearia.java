package src;

public abstract class Mercearia extends Empresa{
    private float custoLimpezaAnual;

    public Mercearia(String nome, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual) {
        super(nome, local, distrito, faturacaoMedia);
        this.tipo = "Mercearia";
        this.categoria = "Mercearia";
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
