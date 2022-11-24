package src;

abstract class Mercado extends Mercearia{
    private float areaCorredores;

    public Mercado(String nome, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual, float areaCorredores) {
        super(nome, local, distrito, faturacaoMedia, custoLimpezaAnual);
        this.areaCorredores = areaCorredores;
        this.tipo = "Mercado";
        this.subCategoria = "Mercado";
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
        return areaCorredores*getFaturacaoMedia();}//faturacaoMedia é a faturacao media anual por m^2

}
