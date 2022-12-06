

import java.util.*;
import java.io.*;

public class GestorEmpresas implements Serializable {
    private ArrayList<Empresa> empresas;

    public GestorEmpresas() {
        this.empresas = new ArrayList<>();
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void addCafe(String nome, Localizacao local, String distrito, double fatMediaAnual,
                        double salarioMedAnual, double numMedCafes,double numMedClientesDia, int numEmpMesa) {
        Cafe empresa = new Cafe(nome, local, distrito,fatMediaAnual,numEmpMesa,salarioMedAnual,numMedClientesDia,numMedCafes);
        this.empresas.add(empresa);
    }

    public void addPastelaria(String nome, Localizacao local, String distrito, double fatMediaAnual,
                              double salarioMedAnual, double numMedBolos,double numMedClientesDia, int numEmpMesa) {
        Pastelaria empresa = new Pastelaria(nome, local, distrito, fatMediaAnual, numEmpMesa, salarioMedAnual, numMedClientesDia, numMedBolos);
        this.empresas.add(empresa);
    }

    public void addRestFastFood(String nome, Localizacao local, String distrito, double fatMediaAnual,int numEmpMesa, double salarioMedAnual,
                                double numMedClientesDia,int numDiasFunc, int numMesasInteriores, double numMedClietesDrive,double faturacaoMediaDrive ) {
        RestFastFood empresa = new RestFastFood(nome, local, distrito, fatMediaAnual,numEmpMesa,salarioMedAnual, numMedClientesDia, numDiasFunc,
                                numMesasInteriores,numMedClietesDrive,faturacaoMediaDrive);
        this.empresas.add(empresa);
    }

    public void addRestLocal(String nome, Localizacao local, String distrito, double fatMediaAnual,int numEmpMesa, double salarioMedAnual,
                             double numMedClientesDia,int numDiasFunc, int numMesasInteriores, int numMesasEsplanada,double custoLicencaAnoPMesasEsp ){
        RestLocal empresa = new RestLocal(nome, local, distrito, fatMediaAnual,numEmpMesa,salarioMedAnual, numMedClientesDia, numDiasFunc,
                                numMesasInteriores,numMesasEsplanada,custoLicencaAnoPMesasEsp);
        this.empresas.add(empresa);
    }

    public void addMiniMercado(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, double areaCorredores) {
        Minimercado empresa = new Minimercado(nome, local, distrito, fatMediaAnual, custoLimpezaAno, areaCorredores);
        this.empresas.add(empresa);
    }

    public void addSuperMercado(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, double areaCorredores) {
        Supermercado empresa = new Supermercado(nome, local, distrito, fatMediaAnual, custoLimpezaAno, areaCorredores);
        this.empresas.add(empresa);
    }

    public void addHiperMercado(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, double areaCorredores) {
        Hipermercado empresa = new Hipermercado(nome, local, distrito, fatMediaAnual, custoLimpezaAno, areaCorredores);
        this.empresas.add(empresa);
    }

    public void addFrutaria(String nome, Localizacao local, String distrito, double fatMediaAnual, double custoLimpezaAno, int numProdutos) {
        Frutaria empresa = new Frutaria(nome, local, distrito, fatMediaAnual, custoLimpezaAno, numProdutos);
        this.empresas.add(empresa);
    }

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

    @SuppressWarnings("unchecked")
    public String carregarDadosObjeto() {
        File ficheiro = new File("StarThrive.dat"); // se o ficheiro de objetos não estiver criado ou ocorrer um erro
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

    public String carregarDadosTexto() {
        File ficheiro = new File("StarThrive.txt");
        if(ficheiro.exists() && ficheiro.isFile()) {
            try {
                FileReader fr = new FileReader(ficheiro);
                BufferedReader br = new BufferedReader(fr);
                String linha;
                while((linha = br.readLine()) != null) {
                    String[] dados = linha.split("/");
                    Coordenada latitude = new Coordenada(Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]),dados[5].charAt(0));
                    Coordenada longitude = new Coordenada(Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]),dados[9].charAt(0));
                    Localizacao local = new Localizacao(latitude, longitude);
                    switch (dados[0]) {
                        case "Cafe" -> addCafe(dados[1], local, dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]),
                                Integer.parseInt(dados[13]), Double.parseDouble(dados[14]), Integer.parseInt(dados[15]));

                        case "Pastelaria" -> addPastelaria(dados[1], local, dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]),
                                Double.parseDouble(dados[14]), Integer.parseInt(dados[15]));

                        case "Restaurante Fast-Food" -> addRestFastFood(dados[1], local, dados[10], Double.parseDouble(dados[11]), Integer.parseInt(dados[12]), Integer.parseInt(dados[13]),
                                Double.parseDouble(dados[14]), Integer.parseInt(dados[15]), Integer.parseInt(dados[16]), Integer.parseInt(dados[17]),
                                Double.parseDouble(dados[18]));

                        case "Restaurante Local" -> addRestLocal(dados[1], local, dados[10],Double.parseDouble(dados[11]), Integer.parseInt(dados[12]), Integer.parseInt(dados[13]), Double.parseDouble(dados[14]),
                                Integer.parseInt(dados[15]), Integer.parseInt(dados[16]), Integer.parseInt(dados[17]), Double.parseDouble(dados[18]));

                        case "Frutaria" -> addFrutaria(dados[1], local, dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));

                        case "Minimercado" -> addMiniMercado(dados[1], local, dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Double.parseDouble(dados[13]));

                        case "Supermercado" -> addSuperMercado(dados[1], local, dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Double.parseDouble(dados[13]));

                        case "Hipermercado" -> addHiperMercado(dados[1], local, dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Double.parseDouble(dados[13]));
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
                return "\nO programa procurou e encontrou um ficheiro de texto mas também ocorreu um erro ao tentar converter a sua informação!";
            }
        }
        else
            return "\nO programa procurou um ficheiro de texto mas também este também não foi encontrado!\nSe for a primeira vez que utiliza o programa, um ficheiro de objetos será criado na primeira vez que guardar!";
    }

    // create txt file and save empresas
    public String guardarDados() {
        ordenarLista(0); // ordenar pela opção default para que a lista seja carregada por essa ordem na proxima sessão
        File ficheiro = new File("StarThrive.dat");
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

    public void remove(int indexLinha) {
        empresas.remove(indexLinha);
    }
}