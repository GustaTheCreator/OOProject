/**
 * Empresa
 */
abstract class Empresa
{
    private String nome;
    private Localizacao local;
    private String distrito;
    private float faturacaoMediaAnual;

    public Empresa(String nome, Localizacao local, String distrito, float faturacaoMediaAnual) {
        this.nome = nome;
        this.local = local;
        this.distrito = distrito;
        this.faturacaoMediaAnual = faturacaoMediaAnual;
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

    public float getFaturacaoMediaAnual() {
        return faturacaoMediaAnual;
    }

    public void setFaturacaoMediaAnual(float faturacaoMediaAnual) {
        this.faturacaoMediaAnual = faturacaoMediaAnual;
    }
}