package src;

import java.io.Serializable;

public abstract class Empresa implements Serializable {
    protected String nome;
    protected String tipo;
    protected String subCategoria;
    protected String categoria;
    protected Localizacao local;
    protected String distrito;
    protected double faturacaoMedia;

    public Empresa(String nome,Localizacao local, String distrito, double faturacaoMedia) {
        this.nome = nome;
        this.tipo = "Empresa";
        this.subCategoria = "Nenhuma";
        this.categoria = "Nenhuma";
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

    public String getCategoria() {
        return categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
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

    public double getFaturacaoMedia() {
        return faturacaoMedia;
    }

    public void setFaturacaoMedia(double faturacaoMedia) {
        this.faturacaoMedia = faturacaoMedia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoDeMercado) {
        this.tipo = tipoDeMercado;
    }

    abstract public double despesaAnual();
    abstract public double receitaAnual();

    public double lucro() {
        return receitaAnual() - despesaAnual();
    }

    public boolean verifica(){
        return !(this.faturacaoMedia < 0) && this.local.verificaCoordenadas();
    }

    public double getNumMedClientesDiario() { // permite a ordenação das empresas por número médio de clientes diário através de polimorfismo
        return -1;                            // uma vez que apenas as empresas de restauração vão devolver um valor superior a 0 aqui
    }
    public String toString(){
        return "Nome: " + nome + "\n\n" +
                "Tipo: " + tipo + "\n\n" +
                "Subcategoria: " + subCategoria + "\n\n" +
                "Categoria: " + categoria + "\n\n" +
                "Localização: " + local + "\n\n" +
                "Distrito: " + distrito + "\n\n";
    }
}