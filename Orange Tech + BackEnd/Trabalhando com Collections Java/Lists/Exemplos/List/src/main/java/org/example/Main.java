package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String linha = "------------------------------------------";

        List<Double> notas = new ArrayList<>();
        notas.add(5.0);
        notas.add(1.5);
        notas.add(3.5);
        notas.add(9.5);
        System.out.println(notas.toString());

        System.out.println("Posição da nota 1.5: " + notas.indexOf(1.5));

        System.out.println(linha);

        System.out.println("Substituir nota 3.5 por 4.5");
        notas.set(notas.indexOf(3.5), 4.5);
        System.out.println(notas);

        System.out.println(linha);

        System.out.println("Verificar se nota 5.0 está na lista");
        System.out.println(notas.contains(5.0) ? "5.0 Está na lista" : "5.0 não está na lista");

        System.out.println(linha);

        System.out.println("Exibir notas na ordem informadas");
        notas.forEach(notaDouble -> System.out.println("Nota: " + notaDouble));

        System.out.println(linha);

        System.out.println("Exibir a terceira nota adicionada");
        System.out.println(notas.get(2));

        System.out.println(linha);

        System.out.println("Exibir a menor nota e a maior nota");
        System.out.println("Menor nota é " + Collections.min(notas));
        System.out.println("Maior nota é " + Collections.max(notas));

        System.out.println(linha);

        System.out.println("Exibir a soma de todas as notas");
        Double soma = 0.0;
        Iterator<Double> notasIterator1 = notas.iterator();
        while (notasIterator1.hasNext()) {
            Double next = notasIterator1.next();
            soma += next;
        }
        System.out.println("A soma das notas é " + soma);

        System.out.println(linha);

        System.out.println("A média das notas é: " + soma / notas.size());

        System.out.println(linha);

        System.out.println("Remover a nota 9.5");
        notas.remove(9.5);
        System.out.println(notas);

        System.out.println(linha);

        System.out.println("Remover a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println(linha);

        System.out.println("Remover notas menor que 7");

        notas.add(5.0);
        notas.add(9.5);

        Iterator<Double> notasIterator2 = notas.iterator();

        while (notasIterator2.hasNext()) {
            Double next = notasIterator2.next();
            if (next < 7) notasIterator2.remove();
        }
        System.out.println(notas);

        System.out.println(linha);

        System.out.println("Apagar toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println(linha);

        System.out.println("A lista está vazia: " + (notas.isEmpty() ? "Sim" : "Não"));

        System.out.println(linha);
        System.out.println("+++++ Usando LinkedList +++++");

        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(5.0);
        notas2.add(1.5);
        notas2.add(3.5);
        notas2.add(9.5);

        System.out.println("Primeira nota: "+ notas2.getFirst());

        System.out.println(linha);

        System.out.println("Remover a primeira nota");
        notas2.removeFirst();
        System.out.println(notas2);

        System.out.println(linha);

        System.out.println("Ultima nota: "+ notas2.getLast());

        System.out.println(linha);

        System.out.println("Remover a última nota");
        notas2.removeLast();
        System.out.println(notas2);

    }
}