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
    public boolean verificaEmpresa(){
        boolean bool = false;
        String[] distritos ={"viana do castelo","braga","vila real","bragança","porto","aveiro","viseu","guarda",
                "coimbra","castelo branco","leiria","santarém","santarem","portalegre","lisboa","évora","evora",
                "setubal","beja","faro"};
        for (String distrito : distritos) {
            this.distrito = distrito.toLowerCase();
            if (this.distrito.equals(distrito)) {bool = true;}}
        if (!bool) return false;
        String [] splited = this.distrito.split(" ");
        if (this.distrito.equals(distritos[0]))
            this.distrito = "Viana do Castelo";
        else if (splited.length==2)
            this.distrito = splited[0].substring(0,1).toUpperCase()+splited[0].substring(1).toLowerCase()+
                    " "+splited[1].substring(0,1).toUpperCase()+splited[1].substring(1).toLowerCase();
        else
            this.distrito = splited[0].substring(0,1).toUpperCase()+splited[0].substring(1).toLowerCase();
        return !(this.faturacaoMedia < 0) && this.local.verificaCoordenadas();
    }
    abstract public boolean verifica();
    public String lucroSimNao()
    {
        double lucro = receitaAnual() - despesaAnual();
        if(lucro > 0)
            return "Sim / " + lucro;
        else
            return "Não / " + lucro;
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