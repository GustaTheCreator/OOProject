package src;

import java.util.*;
import java.io.*;

public class GestorEmpresas implements Serializable {
    private ArrayList<Empresa> empresas;

    public GestorEmpresas() {
        this.empresas = new ArrayList<Empresa>();
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void addCafe(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong,
                        int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual,
                        double salarioMedAnual, double numMedBolos,double numMedClientesDia, int numEmpMesa)
    {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Cafe empresa = new Cafe(nome, local, distrito,mediaAnual,numEmpMesa,salarioMedAnual,numMedClientesDia,numMedBolos);
        this.empresas.add(empresa);
    }

    public void addPastelaria(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double salarioMedAnual, int numProdutos,double numMedClientesDia, int numEmpMesa) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Pastelaria empresa = new Pastelaria(nome, local, distrito, mediaAnual, numEmpMesa, salarioMedAnual, numMedClientesDia, numProdutos);
        this.empresas.add(empresa);
    }

    public void addRestFastFood(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        RestFastFood empresa = new RestFastFood(nome, local, distrito, direcaoLat, horasLong, minutosLong, mediaAnual, segundosLong, direcaoLong, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

    public void addRestLocal(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        RestLocal empresa = new RestLocal(nome, local, distrito, custoEmpregados, horasLong, custoEmpregados, mediaAnual, segundosLong, numProdutos, numProdutos, custoEmpregados);
        this.empresas.add(empresa);
    }

    public void addMiniMercado(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Minimercado empresa = new Minimercado(nome, local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

    public void addSuperMercado(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        SuperMercado empresa = new SuperMercado(nome, local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

    public void addHiperMercado(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        HiperMercado empresa = new HiperMercado(nome, local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

    public void addFrutaria(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Frutaria empresa = new Frutaria(nome, local, distrito, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

    public void ordenarLista(int opcao) {
        switch (opcao) {
            case 0 -> {
                empresas.sort((atual, proximo) -> atual.getNome().compareToIgnoreCase(proximo.getNome()));
            }
            case 1 -> {
                empresas.sort((atual, proximo) -> atual.getNome().compareToIgnoreCase(proximo.getNome()));
                Collections.reverse(empresas);
            }
            case 2 -> {
                empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));
            }
            case 3 -> {
                empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));
                Collections.reverse(empresas);
            }
            case 4 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.despesaAnual(), proximo.despesaAnual()));
            }
            case 5 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.despesaAnual(), proximo.despesaAnual()));
                Collections.reverse(empresas);
            }
            case 6 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.receitaAnual(), proximo.receitaAnual()));
            }
            case 7 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.receitaAnual(), proximo.receitaAnual()));
                Collections.reverse(empresas);
            }
            case 8 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.lucro(), proximo.lucro()));
            }
            case 9 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.lucro(), proximo.lucro()));
                Collections.reverse(empresas);
            }
        }
    }

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

    public String carregarDadosTexto() {
        File ficheiro = new File("src/data/StarThrive.txt");
        if(ficheiro.exists() && ficheiro.isFile()) {
            try {
                FileReader fr = new FileReader(ficheiro);
                BufferedReader br = new BufferedReader(fr);
                String linha;
                while((linha = br.readLine()) != null) {
                    String[] dados = linha.split("/");
                    switch (dados[0]) {
                        case "Cafe" -> {
                            addCafe(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]),
                                    dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]),
                                    dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]),
                                    Integer.parseInt(dados[13]), Double.parseDouble(dados[14]), Integer.parseInt(dados[15]));
                        }
                        case "Pastelaria" -> {
                            addPastelaria(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]), Double.parseDouble(dados[14]), Integer.parseInt(dados[15]));
                        }
                        case "Restaurante Fast-Food" -> {
                            addRestFastFood(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                        }
                        case "Restaurante Local" -> {
                            addRestLocal(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                        }
                        case "Frutaria" -> {
                            addFrutaria(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                        }
                        case "Minimercado" -> {
                            addMiniMercado(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                        }
                        case "Supermercado" -> {
                            addSuperMercado(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                        }
                        case "Hipermercado" -> {
                            addHiperMercado(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                        }
                    }
                }
                br.close();
                return "\nO programa procurou um ficheiro de texto e carregou os dados desse ficheiro com sucesso!";
            } catch (FileNotFoundException ex) {
                return "\nO programa procurou um ficheiro de texto mas ocorreu um erro ao tentar aceder-lhe!";
            } catch (IOException ex) {
                empresas.clear();
                return "\nO programa procurou um ficheiro de texto mas ocorreu um erro durante a leitura!";
            } catch (NumberFormatException | NullPointerException | IndexOutOfBoundsException ex) {
                empresas.clear();
                return "\nO programa procurou um ficheiro de texto mas ocorreu um erro ao tentar converter a sua informação, é possível que haja dados inválidos!";
            }
        }
        else
            return "\nO programa procurou um ficheiro de texto mas este também não foi encontrado!\nSe for a primeira vez que utiliza o programa, um ficheiro de objetos será criado a primeira vez que guardar!";
    }

    // create txt file and save empresas
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

    public void remove(int indexLinha) {
        empresas.remove(indexLinha);
    }
}