package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
            Faça um programa que receba a temperatura média dos 6
            primeiros meses do ano e armazene-as em uma lista.
            Após isto, calcule a média semestral das temperaturas e
            mostre todas as temperaturas acima desta média, e em que
            mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
            – Fevereiro e etc).
        */

        List<Double> temperaturas = new ArrayList<>() {{
            add(35.1);
            add(36.2);
            add(30.3);
            add(31.4);
            add(14.5);
            add(24.0);
        }};

        List<String> meses = new ArrayList<>() {{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
        }};

        Double soma = 0.0;
        for (Double temperatura : temperaturas) soma += temperatura;
        Double media = soma / temperaturas.size();

        System.out.println("\nMédia semestral: " + String.format("%,.2f", media) + "°C");

        System.out.println("\n--- Temperaturas acima da média ---");
        for (int c = 0; c < temperaturas.size(); c++) {
            if (temperaturas.get(c) > media)
                System.out.println((c + 1) + " - " + meses.get(c) + ": " + temperaturas.get(c) + "°C");
        }

    }
}