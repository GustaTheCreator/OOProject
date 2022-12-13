package src;


import java.util.*;
import java.io.*;
/**
 * Classe para gerir as Empresas
 */
public class GestorEmpresas implements Serializable {
    /**
     * Arraylist de empresas
     */
    private ArrayList<Empresa> empresas;

    /**
     * Construtor da classe GestorEmpresas
     */
    public GestorEmpresas() {
        this.empresas = new ArrayList<>();
    }
    /**
     * Método que retorna o arraylist de empresas
     * @return Arraylist de empresas
     */
    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    /**
     * Método que adiciona um Café ao arraylist de empresas
     * @param nome Nome do Café
     * @param local Localização do Café
     * @param distrito Distrito do Café
     * @param fatMediaAnual Fatuação media anual por café por dia do Café
     * @param salarioMedAnual Salário médio anual dos empregados do Café
     * @param numMedCafes Número médio de cafés vendidos por dia
     * @param numMedClientesDia Número médio de clientes por dia
     * @param numEmpMesa Número de empregados por mesa
     */
    public void addCafe(String nome, Localizacao local, String distrito, double fatMediaAnual,
                        double salarioMedAnual, double numMedCafes,double numMedClientesDia, int numEmpMesa) {
        Cafe empresa = new Cafe(nome, local, distrito,fatMediaAnual,numEmpMesa,salarioMedAnual,numMedClientesDia,numMedCafes);
        this.empresas.add(empresa);
    }
    /**
     * Método que adiciona um Pastelaria ao arraylist de empresas
     * @param nome Nome da Pastelaria
     * @param local Localização da Pastelaria
     * @param distrito Distrito da Pastelaria
     * @param fatMediaAnual Fatuação media anual por bolo por dia da Pastelaria
     * @param salarioMedAnual Salário médio anual dos empregados da Pastelaria
     * @param numMedBolos Número médio de bolos vendidos por dia
     * @param numMedClientesDia Número médio de clientes por dia
     * @param numEmpMesa Número de empregados por mesa
     */

    public void addPastelaria(String nome, Localizacao local, String distrito, double fatMediaAnual,
                              double salarioMedAnual, double numMedBolos,double numMedClientesDia, int numEmpMesa) {
        Pastelaria empresa = new Pastelaria(nome, local, distrito, fatMediaAnual, numEmpMesa, salarioMedAnual, numMedClientesDia, numMedBolos);
        this.empresas.add(empresa);
    }

    /**
     * Método que adiciona um Restaurante Fast Food ao arraylist de empresas
     * @param nome Nome do Restaurante Fast Food
     * @param local Localização do Restaurante Fast Food
     * @param distrito Distrito do Restaurante Fast Food
     * @param fatMediaAnual Faturação média de cada mesa por dia do restaurante Fast Food
     * @param numEmpMesa Número de empregados por mesa
     * @param salarioMedAnual Salário médio anual dos empregados do Restaurante Fast Food
     * @param numMedClientesDia Número médio de clientes por dia
     * @param numDiasFunc Número de dias que o Restaurante Fast Food funciona anualmente
     * @param numMesasInteriores Número de mesas interiores do Restaurante Fast Food
     * @param numMedClietesDrive Número médio de clientes Drive Thru por dia
     * @param faturacaoMediaDrive Faturação média por cliente Drive-Thru diário do restaurante Fast Food
     */

    public void addRestFastFood(String nome, Localizacao local, String distrito, double fatMediaAnual,int numEmpMesa, double salarioMedAnual,
                                double numMedClientesDia,int numDiasFunc, int numMesasInteriores, double numMedClietesDrive,double faturacaoMediaDrive ) {
        RestFastFood empresa = new RestFastFood(nome, local, distrito, fatMediaAnual,numEmpMesa,salarioMedAnual, numMedClientesDia, numDiasFunc,
                                numMesasInteriores,numMedClietesDrive,faturacaoMediaDrive);
        this.empresas.add(empresa);
    }

    /**
     * Método que adiciona um Restaurante Local ao arraylist de empresas
     * @param nome Nome do Restaurante Local
     * @param local Localização do Restaurante Local
     * @param distrito Distrito do Restaurante Local
     * @param fatMediaAnual Faturação média por mesa por dia
     * @param numEmpMesa Número de empregados por mesa
     * @param salarioMedAnual Salário médio anual dos empregados do Restaurante Local
     * @param numMedClientesDia Número médio de clientes por dia
     * @param numDiasFunc Número de dias que o Restaurante Local funciona anualmente
     * @param numMesasInteriores Número de mesas interiores do Restaurante Local
     * @param numMesasEsplanada Número de mesas de esplanada do Restaurante Local
     * @param custoLicencaAnoPMesasEsp Custo da licença anual por mesa de esplanada do Restaurante Local
     */

    public void addRestLocal(String nome, Localizacao local, String distrito, double fatMediaAnual,int numEmpMesa, double salarioMedAnual,
                             double numMedClientesDia,int numDiasFunc, int numMesasInteriores, int numMesasEsplanada,double custoLicencaAnoPMesasEsp ){
        RestLocal empresa = new RestLocal(nome, local, distrito, fatMediaAnual,numEmpMesa,salarioMedAnual, numMedClientesDia, numDiasFunc,
                                numMesasInteriores,numMesasEsplanada,custoLicencaAnoPMesasEsp);
        this.empresas.add(empresa);
    }

    /**
     * Método que adiciona um Minimercado ao arraylist de empresas
     * @param nome Nome do Minimercado
     * @param local Localização do Minimercado
     * @param distrito Distrito do Minimercado
     * @param fatMediaAnual Faturação média anual por m^2
     * @param custoLimpezaAno Custo de limpeza anual do Minimercado
     * @param areaCorredores Área dos corredores do Minimercado
     */
    public void addMiniMercado(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, double areaCorredores) {
        Minimercado empresa = new Minimercado(nome, local, distrito, fatMediaAnual, custoLimpezaAno, areaCorredores);
        this.empresas.add(empresa);
    }

    /**
     * Método que adiciona um Supermercado ao arraylist de empresas
     * @param nome Nome do Supermercado
     * @param local Localização do Supermercado
     * @param distrito Distrito do Supermercado
     * @param fatMediaAnual Faturação média anual por m^2
     * @param custoLimpezaAno Custo de limpeza anual do Supermercado
     * @param areaCorredores Área dos corredores do Supermercado
     */
    public void addSuperMercado(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, double areaCorredores) {
        Supermercado empresa = new Supermercado(nome, local, distrito, fatMediaAnual, custoLimpezaAno, areaCorredores);
        this.empresas.add(empresa);
    }

    /**
     * Método que adiciona um Hipermercado ao arraylist de empresas
     * @param nome Nome do Hipermercado
     * @param local Localização do Hipermercado
     * @param distrito Distrito do Hipermercado
     * @param fatMediaAnual Faturação média anual por m^2
     * @param custoLimpezaAno Custo de limpeza anual do Hipermercado
     * @param areaCorredores Área dos corredores do Hipermercado
     */

    public void addHiperMercado(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, double areaCorredores) {
        Hipermercado empresa = new Hipermercado(nome, local, distrito, fatMediaAnual, custoLimpezaAno, areaCorredores);
        this.empresas.add(empresa);
    }

    /**
     * Método que adiciona um Frutaria ao arraylist de empresas
     * @param nome Nome da Frutaria
     * @param local Localização da Frutaria
     * @param distrito Distrito da Frutaria
     * @param fatMediaAnual Faturação média anual por m^2
     * @param custoLimpezaAno Custo de limpeza anual da Frutaria
     * @param numProdutos Número de produtos da Frutaria
     */

    public void addFrutaria(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, int numProdutos) {
        Frutaria empresa = new Frutaria(nome, local, distrito, fatMediaAnual, custoLimpezaAno, numProdutos);
        this.empresas.add(empresa);
    }

    /**
     * Método que ordena o arraylist de empresas
     * @param opcao Opção de ordenação
     *              0 - Ordena por nome A-Z
     *              1 - Ordena por nome Z-A
     *              2 - Ordena por distrito A-Z
     *              3 - Ordena por distrito Z-A
     *              4 - Ordena por despesas anuais crescente
     *              5 - Ordena por despesas anuais decrescente
     *              6 - Ordena por receitas anuais crescente
     *              7 - Ordena por receitas anuais decrescente
     *              8 - Ordena por lucro anual crescente
     *              9 - Ordena por lucro anual decrescente
     *              10 - Ordena por número médio de clientes diário decrescente
     */

    public void ordenarLista(int opcao) {
        switch (opcao) {
            case 0 -> empresas.sort((atual, proximo) -> atual.getNome().compareToIgnoreCase(proximo.getNome()));

            case 1 -> {
                empresas.sort((atual, proximo) -> atual.getNome().compareToIgnoreCase(proximo.getNome()));
                Collections.reverse(empresas);
            }
            case 2 -> empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));

            case 3 -> {
                empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));
                Collections.reverse(empresas);
            }
            case 4 -> empresas.sort(Comparator.comparingDouble(Empresa::despesaAnual));

            case 5 -> {
                empresas.sort(Comparator.comparingDouble(Empresa::despesaAnual));
                Collections.reverse(empresas);
            }
            case 6 -> empresas.sort(Comparator.comparingDouble(Empresa::receitaAnual));

            case 7 -> {
                empresas.sort(Comparator.comparingDouble(Empresa::receitaAnual));
                Collections.reverse(empresas);
            }
            case 8 -> empresas.sort(Comparator.comparingDouble(Empresa::lucro));

            case 9 -> {
                empresas.sort(Comparator.comparingDouble(Empresa::lucro));
                Collections.reverse(empresas);
            }
            case 10 -> {
                empresas.sort(Comparator.comparingDouble(Empresa::getNumMedClientesDiario));
                Collections.reverse(empresas);
            }
            default -> {}
        }
    }
    /**
     * Método para carregar os dados do ficheiro de objetos
     * @return Mensagem de erro ou sucesso
     */

    @SuppressWarnings("unchecked")
    public String carregarDadosObjeto() {
        File ficheiro = new File("src/data/StarThrive.dat"); // se o ficheiro de objetos não estiver criado ou ocorrer um erro
        if(ficheiro.exists() && ficheiro.isFile()) {         // durante o carregamento então recorre ao ficheiro de texto
            try {
                FileInputStream fis = new FileInputStream(ficheiro);
                ObjectInputStream ois = new ObjectInputStream(fis);
                this.empresas = (ArrayList<Empresa>)ois.readObject();
                ois.close();
                return "Os dados foram carregados do ficheiro de objetos com sucesso!";
            } catch (FileNotFoundException ex) {
                return "Foi encontrado um ficheiro de objetos mas ocorreu um erro ao tentar aceder-lhe!" + carregarDadosTexto();
            } catch (ClassNotFoundException ex) {
                return "Foi encontrado um ficheiro de objetos mas ocorreu um erro ao tentar converter a sua informação, é possível que esteja corrompido!" + carregarDadosTexto();
            } catch (IOException ex) {
                empresas.clear();
                return "Foi encontrado um ficheiro de objetos mas ocorreu um erro durante a leitura!" + carregarDadosTexto();
            }
        }
        else
            return "Não foi encontrado um ficheiro de objetos para carregar dados!" + carregarDadosTexto();
    }

    /**
     * Método para carregar os dados do ficheiro de texto
     * @return Mensagem de erro ou sucesso
     */
    public String carregarDadosTexto() {
        File ficheiro = new File("src/data/StarThrive.txt");
        if(ficheiro.exists() && ficheiro.isFile()) {
            try {
                FileReader fr = new FileReader(ficheiro);
                BufferedReader br = new BufferedReader(fr);
                String linha;
                while((linha = br.readLine()) != null) {
                    String[] dados = linha.split("/");
                    String nome = dados[1];
                    Coordenada latitude = new Coordenada(Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]),dados[5].charAt(0));
                    Coordenada longitude = new Coordenada(Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]),dados[9].charAt(0));
                    Localizacao local = new Localizacao(latitude, longitude);
                    String distrito = dados[10];
                    switch (dados[0]) {
                        case "Cafe" -> addCafe(nome, local, distrito, Double.parseDouble(dados[11]), Double.parseDouble(dados[12]),
                                Integer.parseInt(dados[13]), Double.parseDouble(dados[14]), Integer.parseInt(dados[15]));

                        case "Pastelaria" -> addPastelaria(nome, local, distrito, Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]),
                                Double.parseDouble(dados[14]), Integer.parseInt(dados[15]));

                        case "Restaurante Fast-Food" -> addRestFastFood(nome, local, distrito, Double.parseDouble(dados[11]), Integer.parseInt(dados[12]), Integer.parseInt(dados[13]),
                                Double.parseDouble(dados[14]), Integer.parseInt(dados[15]), Integer.parseInt(dados[16]), Integer.parseInt(dados[17]),
                                Double.parseDouble(dados[18]));

                        case "Restaurante Local" -> addRestLocal(nome, local, distrito,Double.parseDouble(dados[11]), Integer.parseInt(dados[12]), Integer.parseInt(dados[13]), Double.parseDouble(dados[14]),
                                Integer.parseInt(dados[15]), Integer.parseInt(dados[16]), Integer.parseInt(dados[17]), Double.parseDouble(dados[18]));

                        case "Frutaria" -> addFrutaria(nome, local, distrito, Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));

                        case "Minimercado" -> addMiniMercado(nome, local, distrito, Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Double.parseDouble(dados[13]));

                        case "Supermercado" -> addSuperMercado(nome, local, distrito, Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Double.parseDouble(dados[13]));

                        case "Hipermercado" -> addHiperMercado(nome, local, distrito, Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Double.parseDouble(dados[13]));
                        default -> {}
                    }
                }
                br.close();
                return "\nO programa procurou e encontrou um ficheiro de texto, foram carregados os seus dados com sucesso!";
            } catch (FileNotFoundException ex) {
                return "\nO programa procurou e encontrou um ficheiro de texto mas também ocorreu um erro ao tentar aceder-lhe!";
            } catch (IOException ex) {
                empresas.clear();
                return "\nO programa procurou e encontrou um ficheiro de texto mas também ocorreu um erro durante a leitura!";
            } catch (NumberFormatException | NullPointerException | IndexOutOfBoundsException ex) {
                empresas.clear();
                ex.printStackTrace();
                return "\nO programa procurou e encontrou um ficheiro de texto mas também ocorreu um erro ao tentar converter a sua informação!";
            }
        }
        else
            return "\nO programa procurou um ficheiro de texto mas também este também não foi encontrado!\nSe for a primeira vez que utiliza o programa, um ficheiro de objetos será criado na primeira vez que guardar!";
    }

    /**
     * Método para guardar os dados no ficheiro de objetos
     * @return Mensagem de erro ou sucesso
     */
    public String guardarDados() {
        ordenarLista(0); // ordenar pela opção default para que a lista seja carregada por essa ordem na proxima sessão
        File ficheiro = new File("src/data/StarThrive.dat");
        try {
            FileOutputStream fos = new FileOutputStream(ficheiro);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(empresas);
            oos.close();
            return "As alterações foram guardadas com sucesso!";
        } catch (FileNotFoundException ex) {
            return "Não foi possível guardar as alterações, ocorreu um erro a criar o ficheiro!";
        } catch (IOException ex) {
            return "Não foi possível guardar as alterações, ocorreu um erro durante a escrita para o ficheiro!";
        }
    }

    /**
     * Método para remover uma empresa do arraylist
     * @param indexLinha indice da linha a ser removida
     */
    public void remove(int indexLinha) {
        empresas.remove(indexLinha);
    }
}