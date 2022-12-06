

public abstract class Mercearia extends Empresa {
    protected double custoLimpezaAnual;

    public Mercearia(String nome, Localizacao local, String distrito, double faturacaoMedia, double custoLimpezaAnual) {
        super(nome, local, distrito, faturacaoMedia);
        this.tipo = "Mercearia";
        this.categoria = "Mercearia";
        this.custoLimpezaAnual = custoLimpezaAnual;
    }

    public double getCustoLimpezaAnual() {
        return custoLimpezaAnual;
    }

    public void setCustoLimpezaAnual(double custoLimpezaAnual) {
        this.custoLimpezaAnual = custoLimpezaAnual;
    }
    @Override
    public double despesaAnual() {
        return getCustoLimpezaAnual();
    }
}
