package src;

public abstract class Empresa {
    private String nome;
    private Localizacao local;
    private String distrito;
    private float faturacaoMedia;

    public Empresa(String nome, Localizacao local, String distrito, float faturacaoMedia) {
        this.nome = nome;
        this.local = local;
        this.distrito = distrito;
        this.faturacaoMedia = faturacaoMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Localizacao getLocal() {
        return local;
    }

    public void setLocal(Localizacao local) {
        this.local = local;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public float getFaturacaoMedia() {
        return faturacaoMedia;
    }

    public void setFaturacaoMedia(float faturacaoMedia) {
        this.faturacaoMedia = faturacaoMedia;
    }
    abstract public float despesaAnual();
    abstract public float receitaAnual();
}