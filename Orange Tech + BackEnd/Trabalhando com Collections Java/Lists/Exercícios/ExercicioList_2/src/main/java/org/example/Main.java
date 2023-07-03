package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Utilizando listas, faça um programa que faça 5 perguntas para uma
            pessoa sobre um crime. As perguntas são:

            "Telefonou para a vítima?"

            "Esteve no local do crime?"

            "Mora perto da vítima?"

            "Devia para a vítima?"

            "Já trabalhou com a vítima?"

            Se a pessoa responder positivamente a 2 questões ela deve ser
            classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
            "Assassina". Caso contrário, ela será classificado como "Inocente".
        */

        Scanner leia = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>() {{
            add("Telefonou para a vítima?");
            add("Esteve no local do crime?");
            add("Mora perto da vítima?");
            add("Devia para a vítima?");
            add("Já trabalhou com a vítima?");
        }};

        //List<String> respostas = new ArrayList<>();
        int quantidadePositivas = 0;
        String resposta = "";
        for (String pergunta : perguntas) {

            System.out.println(pergunta);
            System.out.print("(S) Sim, (N) Não:");
            resposta = leia.next().toUpperCase();

            if(resposta.equals("S"))
                quantidadePositivas+=1;

            System.out.println();
        }

        switch (quantidadePositivas) {
            case 2 -> System.out.println("A pessoa é suspeita");
            case 3, 4 -> System.out.println("A pessoa é cúmplice");
            case 5 -> System.out.println("A pessoa é assassina");
            default -> System.out.println("A pessoa é inocente");
        }
    }
}