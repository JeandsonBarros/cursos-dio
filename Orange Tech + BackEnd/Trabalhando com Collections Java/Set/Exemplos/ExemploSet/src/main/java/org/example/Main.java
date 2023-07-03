package org.example;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String linha = "----------------------------------";

        System.out.println(linha);
        System.out.println("==== HashSet ====");
        System.out.println(linha);

        Set<Double> notas1 = new HashSet<>(Arrays.asList(1.5, 5.1, 3.2, 9.6));
        System.out.println("Lista de notas1: "+notas1);

        System.out.println(linha);

        System.out.println("A nota 5.0 está no conjunto: "+ notas1.contains(5.0));

        System.out.println(linha);

        System.out.println("Menor nota: "+ Collections.min(notas1));
        System.out.println("Maior nota: "+ Collections.max(notas1));

        System.out.println(linha);

        Iterator<Double> notasIterator1 = notas1.iterator();
        Double soma = 0.0;
        while (notasIterator1.hasNext()){
          Double next = notasIterator1.next();
          soma += next;
        }
        System.out.println("Soma das notas: "+soma);

        System.out.println(linha);

        System.out.println("Média das notas: "+(soma/notas1.size()));

        System.out.println(linha);

        System.out.println("Remover a nota 5.1:");
        notas1.remove(5.1);
        System.out.println(notas1);

        System.out.println(linha);

        System.out.println("Remover notas menor que 7.0");
        Iterator<Double> notasIterator2 = notas1.iterator();
        while (notasIterator2.hasNext()){
           Double next = notasIterator2.next();
            if(next<7) notasIterator2.remove();
        }
        System.out.println(notas1);

        System.out.println(linha);

        System.out.println("==== LinkedHashSet ====");
        System.out.println("Exibir as notas na ordem em que foram informadas:");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(1.5);
        notas2.add(5.1);
        notas2.add(3.2);
        notas2.add(9.6);

        System.out.println(notas2);

        System.out.println(linha);

        System.out.println("===== TreeSet =====");
        System.out.println("Notas na ordem crecente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println(linha);

        System.out.println("Apagar o conjunto de notas1: ");
        notas1.clear();
        System.out.println(notas1);

        System.out.println(linha);

        System.out.println("Listas de notas1 está vazia: " + notas1.isEmpty());
        System.out.println("Listas de notas1 está vazia: " + notas2.isEmpty());
        System.out.println("Listas de notas1 está vazia: " + notas3.isEmpty());

    }
}