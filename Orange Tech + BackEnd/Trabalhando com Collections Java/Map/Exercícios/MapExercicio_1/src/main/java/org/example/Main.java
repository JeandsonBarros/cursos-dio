package org.example;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {

    public static void exibirEstados(Set<Map.Entry<String, Long>> estados) {
        for (Map.Entry<String, Long> estado : estados) {
            System.out.println(estado.getKey() + "-" + estado.getValue());
        }
    }

    public static void main(String[] args) {
        /*

        Dada a população estimada de alguns estados do NE brasileiro, faça:
            Estado = PE - População = 9.616.621
            Estado = AL - População = 3.351.543
            Estado = CE - População = 9.187.103
            Estado = RN - População = 3.534.265

        Crie um dicionário e relacione os estados e suas populações;
        Substitua a população do estado do RN por 3.534.165;
        Confira se o estado PB está no dicionário, caso não adicione: PB -
        4.039.277;
        Exiba a população PE;
        Exiba todos os estados e suas populações na ordem que foi
        informado;
        Exiba os estados e suas populações em ordem alfabética;
        Exiba o estado com o menor população e sua quantidade;
        Exiba o estado com a maior população e sua quantidade;
        Exiba a soma da população desses estados;
        Exiba a média da população deste dicionário de estados;
        Remova os estados com a população menor que 4.000.000;
        Apague o dicionário de estados;
        Confira se o dicionário está vazio.

         */

        Map<String, Long> estadosEPopulacao1 = new HashMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};

        System.out.println("-----------------------------------------------");

        exibirEstados(estadosEPopulacao1.entrySet());

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Substitua a população do estado do RN por 3.534.165 ++++");
        System.out.println("RN Antes: " + estadosEPopulacao1.get("RN"));
        estadosEPopulacao1.put("RN", 3534165L);
        System.out.println("RN Depois: " + estadosEPopulacao1.get("RN"));

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277 ++++");
        if (estadosEPopulacao1.containsKey("PB")) {
            System.out.println("PB está no dicionário");
        } else {
            estadosEPopulacao1.put("PB", 4039277L);
            System.out.println("O estado PB foi adicionado ao dicionário");
        }
        exibirEstados(estadosEPopulacao1.entrySet());

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Exiba a população PE ++++");
        System.out.println("PE - " + estadosEPopulacao1.get("PE"));

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Exiba todos os estados e suas populações na ordem que foi informado ++++");
        Map<String, Long> estadosEPopulacao2 = new LinkedHashMap<>() {{
            put("PE", 9616621L);
            put("AL", 3351543L);
            put("CE", 9187103L);
            put("RN", 3534265L);
        }};
        exibirEstados(estadosEPopulacao2.entrySet());

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Exiba os estados e suas populações em ordem alfabética ++++");
        Map<String, Long> estadosEPopulacao3 = new TreeMap<>(estadosEPopulacao2);
        exibirEstados(estadosEPopulacao3.entrySet());

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Exiba o estado com o menor população e sua quantidade ++++");
        Long menorPupulacao = Collections.min(estadosEPopulacao3.values());
        for (Map.Entry<String, Long> estado : estadosEPopulacao3.entrySet()) {
            if (estado.getValue().equals(menorPupulacao)) {
                System.out.println(estado.getKey() + "-" + estado.getValue());
            }
        }

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Exiba o estado com a maior população e sua quantidade ++++");
        Long maiorPupulacao = Collections.max(estadosEPopulacao3.values());
        for (Map.Entry<String, Long> estado : estadosEPopulacao3.entrySet()) {
            if (estado.getValue().equals(maiorPupulacao)) {
                System.out.println(estado.getKey() + "-" + estado.getValue());
            }
        }

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Exiba a soma da população desses estados ++++");
        Long soma = 0L;
        for (Map.Entry<String, Long> estado : estadosEPopulacao3.entrySet()) {
            soma += estado.getValue();
        }
        System.out.println("Soma da população: " + soma);

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Exiba a média da população deste dicionário de estados ++++");
        System.out.println("Média da população: " + ((double)soma / estadosEPopulacao3.size()));

        System.out.println("-----------------------------------------------");

        System.out.println("++++ Remova os estados com a população menor que 4.000.000 ++++");
        Iterator<Long> estadosIterator = estadosEPopulacao3.values().iterator();
        while (estadosIterator.hasNext()){
            if(estadosIterator.next() < 4000000L)
                estadosIterator.remove();
        }
        exibirEstados(estadosEPopulacao3.entrySet());

        System.out.println("-----------------------------------------------");

        System.out.println("Apague o dicionário de estados: ");
        estadosEPopulacao3.clear();
        System.out.println(estadosEPopulacao3);

        System.out.println("-----------------------------------------------");

        System.out.println("Confira se o dicionário está vazio: "+ estadosEPopulacao3.isEmpty());

    }
}