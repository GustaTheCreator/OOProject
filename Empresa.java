import java.io.Serializable;
/**
 * Classe abstrata Empresa
 */

public abstract class Empresa implements Serializable {
    /**
     * Nome da empresa
     */
    protected String nome;
    /**
     * Tipo da empresa
     */
    protected String tipo;
    /**
     * Subcategoria da empresa
     */
    protected String subCategoria;
    /**
     * Categoria da empresa
     */
    protected String categoria;
    /**
     * Localização da empresa
     */
    protected Localizacao local;
    /**
     * Distrito da empresa
     */
    protected String distrito;
    /**
     * Faturação média da empresa
     */
    protected double faturacaoMedia;

    /**
     * Construtor da classe Empresa
     * @param nome Nome da Empresa
     * @param local Localização da Empresa
     * @param distrito Distrito da Empresa
     * @param faturacaoMedia Facturação média da Empresa
     */
    public Empresa(String nome,Localizacao local, String distrito, double faturacaoMedia) {
        this.nome = nome;
        this.tipo = "Empresa";
        this.subCategoria = "Nenhuma";
        this.categoria = "Nenhuma";
        this.local = local;
        this.distrito = distrito;
        this.faturacaoMedia = faturacaoMedia;
    }
    /**
     * Método que retorna o nome da Empresa
     * @return Nome da Empresa
     */

    public String getNome() {
        return nome;
    }

    /**
     * Método que define o nome da Empresa
     * @param nome Nome da Empresa
     */

    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Método que retorna a categoria da Empresa
     * @return Categoria da Empresa
     */

    public String getCategoria() {
        return categoria;
    }
    /**
     * Método que retorna a subcategoria da Empresa
     * @return subcategoria Categoria da Empresa
     */

    public String getSubCategoria() {
        return subCategoria;
    }
    /**
     * Método que retorna o local da Empresa
     * @return local Localização da Empresa
     */

    public Localizacao getLocal() {
        return local;
    }
    /**
     * Método que define o local da Empresa
     * @param local Localização da Empresa
     */

    public void setLocal(Localizacao local) {
        this.local = local;
    }
    /**
     * Método que retorna o distrito da Empresa
     * @return distrito Distrito da Empresa
     */

    public String getDistrito() {
        return distrito;
    }
    /**
     * Método que define o distrito da Empresa
     * @param distrito Distrito da Empresa
     */

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    /**
     * Método que retorna a faturação média da Empresa
     * @return faturacaoMedia Faturação média da Empresa
     */

    public double getFaturacaoMedia() {
        return faturacaoMedia;
    }
    /**
     * Método que define a faturação média da Empresa
     * @param faturacaoMedia Faturação média da Empresa
     */

    public void setFaturacaoMedia(double faturacaoMedia) {
        this.faturacaoMedia = faturacaoMedia;
    }
    /**
     * Método que retorna o tipo da Empresa
     * @return tipo Tipo da Empresa
     */

    public String getTipo() {
        return tipo;
    }
    /**
     * Método que define o tipo da Empresa
     * @param tipo Tipo da Empresa
     */

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Método abstracto que calcula a despesa anual da Empresa
     */

    abstract public double despesaAnual();
    /**
     * Método abstracto que calcula a receita anual da Empresa
     */
    abstract public double receitaAnual();
    /**
     * Método que retorna o lucro da Empresa
     */
    public double lucro() {
        return receitaAnual() - despesaAnual();
    }

    /**
     * Método que retorna o numero medio de clientes diario da Empresa
     * @return -1
     */

    public double getNumMedClientesDiario() { // permite a ordenação das empresas por número médio de clientes diário através de polimorfismo
        return -1;                            // uma vez que apenas as empresas de restauração vão devolver um valor superior a 0 aqui
    }
    /**
     * Método toString da classe Empresa
     * @return String com a informação da Empresa
     */
    public String toString(){
        return "Nome: " + nome + "\n\n" +
                "Tipo: " + tipo + "\n\n" +
                "Subcategoria: " + subCategoria + "\n\n" +
                "Categoria: " + categoria + "\n\n" +
                "Distrito: " + distrito + "\n\n" +
                "Localização: " + local + "\n\n" +
                "Receita Anual: " + receitaAnual() + "\n\n" +
                "Despesa Anual: " + despesaAnual() + "\n\n" +
                "Lucro: " + lucro() + "\n\n";
    }
}