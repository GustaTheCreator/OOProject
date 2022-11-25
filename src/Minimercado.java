package  src;

public class Minimercado extends Mercado{

    public Minimercado(String nome, Localizacao local, String distrito, float faturacaoMedia, float custoLimpezaAnual, float areaCorredores){
        super(nome,local,distrito,faturacaoMedia,custoLimpezaAnual,areaCorredores);
        this.tipo = "Minimercado";
    }

    @Override
    public String toString() {
        return getNome()+"/"+getLocal()+"/"+getDistrito()+"/"+getFaturacaoMedia()+"/"+getCustoLimpezaAnual()+"/"+getAreaCorredores();
    }

}