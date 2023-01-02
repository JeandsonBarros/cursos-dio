package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args){
        /*
        Crie uma classe LinguagemFavorita que possua os atributos
        nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
        3 linguagens e faça um programa que ordene esse conjunto por:
           A. Ordem de Inserção
           B. Ordem Natural (nome)
           C. IDE
           D. Ano de criação e nome
           E. Nome, ano de criacao e IDE
        Ao final, exiba as linguagens no console, um abaixo da outra.
        */

        System.out.println("---------------------------------------------------------");

        System.out.println("++++ Ordem aleatória ++++");
        Set<LinguagemFavorita> linguagens1 = new HashSet<>(){{
            add(new LinguagemFavorita("Java",1995,"IntelliJ"));
            add(new LinguagemFavorita("JavaScript",1995,"VScode"));
            add(new LinguagemFavorita("Python", 1991,"PyCharm"));
        }};

        linguagens1.forEach(linguagen-> System.out.printf("%s - %d - %s \n", linguagen.getNome(), linguagen.getAnoDeCriacao(), linguagen.getIde()));

        System.out.println("---------------------------------------------------------");

        System.out.println("++++ Ordem de Inserção ++++");
        Set<LinguagemFavorita> linguagens2 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1995,"IntelliJ"));
            add(new LinguagemFavorita("JavaScript",1995,"VScode"));
            add(new LinguagemFavorita("Python", 1991,"PyCharm"));
        }};
        linguagens2.forEach(linguagen-> System.out.printf("%s - %d - %s \n", linguagen.getNome(), linguagen.getAnoDeCriacao(), linguagen.getIde()));

        System.out.println("---------------------------------------------------------");

        System.out.println("++++ Ordem Natural (nome) ++++");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens2);
        linguagens3.forEach(linguagen-> System.out.printf("%s - %d - %s \n", linguagen.getNome(), linguagen.getAnoDeCriacao(), linguagen.getIde()));

        System.out.println("---------------------------------------------------------");

        System.out.println("++++ Nome, ano de criacao e IDE ++++");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoEIDE());
        linguagens4.addAll(linguagens3);
        linguagens4.forEach(linguagen-> System.out.printf("%s - %d - %s \n", linguagen.getNome(), linguagen.getAnoDeCriacao(), linguagen.getIde()));

    }
}

class ComparatorNomeAnoDeCriacaoEIDE implements Comparator<LinguagemFavorita> {
    @Override
    public int compare(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {

        int nome = linguagemFavorita1.getNome().compareToIgnoreCase(linguagemFavorita2.getNome());
        if(nome != 0) return nome;

        int anoDeCriacao = Integer.compare(linguagemFavorita1.getAnoDeCriacao(), linguagemFavorita2.getAnoDeCriacao());
        if(anoDeCriacao != 0) return anoDeCriacao;

        return linguagemFavorita1.getIde().compareToIgnoreCase(linguagemFavorita2.getIde());

    }
}
