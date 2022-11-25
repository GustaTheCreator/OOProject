package src;

import java.util.*;
import java.io.*;

public class GestorEmpresas {
    private ArrayList<Empresa> empresas;

    public GestorEmpresas() {
        this.empresas = new ArrayList<Empresa>();
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void addCafe(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Cafe empresa = new Cafe(nome, local, distrito, segundosLong, direcaoLong, mediaAnual, custoEmpregados, numProdutos);
        this.empresas.add(empresa);
    }

    public void addPastelaria(String nome, int horasLat, int minutosLat, int segundosLat, char direcaoLat, int horasLong, int minutosLong, int segundosLong, char direcaoLong, String distrito, double mediaAnual, double custoEmpregados, int numProdutos) {
        Coordenada lat = new Coordenada(horasLat, minutosLat, segundosLat, direcaoLat);
        Coordenada longi = new Coordenada(horasLong, minutosLong, segundosLong, direcaoLong);
        Localizacao local = new Localizacao(lat, longi);
        Pastelaria empresa = new Pastelaria(nome, local, distrito, segundosLong, direcaoLong, mediaAnual, custoEmpregados, numProdutos);
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
                empresas.sort((atual, proximo) -> atual.getTipo().compareToIgnoreCase(proximo.getTipo()));
            }
            case 3 -> {
                empresas.sort((atual, proximo) -> atual.getTipo().compareToIgnoreCase(proximo.getTipo()));
                Collections.reverse(empresas);
            }
            case 4 -> {
                empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));
            }
            case 5 -> {
                empresas.sort((atual, proximo) -> atual.getDistrito().compareToIgnoreCase(proximo.getDistrito()));
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
                empresas.sort((atual, proximo) -> Double.compare(atual.despesaAnual(), proximo.despesaAnual()));
            }
            case 9 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.despesaAnual(), proximo.despesaAnual()));
                Collections.reverse(empresas);
            }
            case 10 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.lucro(), proximo.lucro()));
            }
            case 11 -> {
                empresas.sort((atual, proximo) -> Double.compare(atual.lucro(), proximo.lucro()));
                Collections.reverse(empresas);
            }
        }
    }

    public void carregarDados() {
        try {
            File file = new File("src/data/StarThrive.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] dados = linha.split("/");
                switch (dados[0]) {
                    case "Cafe" -> {
                        addCafe(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }
                    case "Pastelaria" -> {
                        addPastelaria(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }
                    case "RestauranteFastFood" -> {
                        addRestFastFood(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }
                    case "RestauranteLocal" -> {
                        addRestLocal(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }
                    case "Frutaria" -> {
                        addFrutaria(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }
                    case "Mini Mercado" -> {
                        addMiniMercado(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }
                    case "Super Mercado" -> {
                        addSuperMercado(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }
                    case "Hiper Mercado" -> {
                        addHiperMercado(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), dados[5].charAt(0), Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]), dados[9].charAt(0), dados[10], Double.parseDouble(dados[11]), Double.parseDouble(dados[12]), Integer.parseInt(dados[13]));
                    }

                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro a carregar.");
            e.printStackTrace();
        }
    }

    //  create txt file and save empresas
    public void guardarDados() {
        ordenarLista(0); // ordenar pela opção defalt para que a lista seja carrega por essa ordem na proxima sessão
        try {
            File file = new File("src/data/StarThrive.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter("src/data/StarThrive.txt");
            for (Empresa empresa : empresas) {
                writer.write(empresa.getTipo() + "/" + empresa.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro a guardar.");
            e.printStackTrace();
        }
    }
    public void remove(int indexLinha) {empresas.remove(indexLinha);}
}