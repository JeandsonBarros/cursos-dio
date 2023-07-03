package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Carros e seus consumos na estrada(quilômetros por litro).
        Map<String, Double> carros1 = new HashMap<>() {{
            put("gol", 1.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carros1);

        System.out.println("\nSubstituir consumo do gol por 15,2: ");
        carros1.put("gol", 16.1);
        System.out.println(carros1);

        System.out.println("\nModelo tucson está no dicionário: " + carros1.containsKey("tucson"));

        System.out.println("\nExibir consumo do uno: " + carros1.get("uno"));

        System.out.println("\nExibir os modelos: ");
        Set<String> modelos = carros1.keySet();
        System.out.println(modelos);

        System.out.println("\nExibir os consumos dos carros: ");
        Collection<Double> consumos = carros1.values();
        System.out.println(consumos);

        System.out.println("\nModelos mais econômicos e seu consumos: ");
        Double consumoMaisEficiente = Collections.max(carros1.values());

        //O tipo Map.Entry guadar um objeto contento a key(getKey()) e o value(getValue())
        Set<Map.Entry<String, Double>> entries = carros1.entrySet();

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMaisEficiente)){
                System.out.println(entry.getKey()+" - "+entry.getValue()+"km/l");
            }
        }

        System.out.println("\nModelos menos econômicos e seu consumos: ");
        Double consumoMenosEficiente = Collections.min(carros1.values());

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(consumoMenosEficiente)){
                System.out.println(entry.getKey()+" - "+entry.getValue()+"km/l");
            }
        }

        Iterator<Double> iteratorCosumos1 = carros1.values().iterator();
        Double soma = 0.0;
        while (iteratorCosumos1.hasNext()){
            soma+=iteratorCosumos1.next();
        }
        System.out.println("\nSoma dos consumos: "+soma);

        System.out.println("\nMédia dos consumos: " + (soma/carros1.size()));

        System.out.println("\nRemover os modelos com consumo igual a 15.6: ");
        System.out.println("Antes: "+carros1);
        Iterator<Double> iteratorCosumos2 = carros1.values().iterator();
        while (iteratorCosumos2.hasNext()){
            if(iteratorCosumos2.next().equals(15.6)) iteratorCosumos2.remove();
        }
        System.out.println("Depois: "+carros1);

        System.out.println("\nExibir na ordem em que foram informados:");
        /*Carros e seus consumos na estrada(quilômetros por litro)
        com LinkedHashMap para ficar na ordem que foram informados.*/
        Map<String, Double> carros2 = new LinkedHashMap<>() {{
            put("gol", 1.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros2);

        System.out.println("\nExibir dicionario ordenado pelo modelo");
        /*Carros e seus consumos na estrada(quilômetros por litro)
        com TreeMap para ficar ordenado pelo modelo.*/
        Map<String, Double> carros3 = new TreeMap<>() {{
            put("gol", 1.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros3);

        System.out.println("\nApagar o dicionário de carros: ");
        carros1.clear();
        System.out.println(carros1);

        System.out.println("\nDicionário está vazio: "+ carros1.isEmpty());

    }
}