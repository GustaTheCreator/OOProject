package src;

public class Mercado extends Mercearia{
    private float areaCorredores;
    private String tipo;

    public Mercado(String nome, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual, float areaCorredores, String tipo) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual);
        this.areaCorredores = areaCorredores;
        this.tipo = tipo;
    }

    public float getAreaCorredores() {
        return areaCorredores;
    }

    public void setAreaCorredores(float areaCorredores) {
        this.areaCorredores = areaCorredores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public float receitaAnual() {
        return areaCorredores*getFaturacaoMedia();
    }

    @Override
    public float despesaAnual(){
        return getCustoLimpezaAnual();
    }
}
