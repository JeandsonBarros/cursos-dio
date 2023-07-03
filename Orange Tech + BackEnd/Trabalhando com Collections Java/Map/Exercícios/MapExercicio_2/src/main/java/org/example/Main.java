package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        TODO:
        Faça um programa que simule um lançamento de dados.
        Lance o dado 100 vezes e armazene.
        Depois, mostre quantas vezes cada valor foi inserido.
         */

        Map<Integer, Integer> lancamentos = new HashMap<>() {{
            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        Random random = new Random(5871293);

        for (int c = 0; c < 100; c++) {
            int valor = random.nextInt(6)+1;
            lancamentos.put(valor, lancamentos.get(valor)+1);
        }

        System.out.println("++++ Vezes que cada valor foi inserido para cada lado ++++");
        for(Map.Entry<Integer, Integer> lacamaneto : lancamentos.entrySet()) {
            System.out.println("Lado "+lacamaneto.getKey() + " - " + lacamaneto.getValue() + " valores");
        }
    }
}