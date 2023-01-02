package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Livro> livros1 = new HashMap<>(){{
            put("Hawking' Stephen", new Livro("Uma breve história do tempo.", 256));
            put("Duhigg' Charles", new Livro("O poder do hábito", 408));
            put("Harari' Yuval Naah", new Livro("Lições para o século XXI", 432));
        }};

        System.out.println("-----------------------------------------------------");

        System.out.println("++++ Autor dos livros e títulos ++++");
        for(Map.Entry<String, Livro> livro : livros1.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getTitulo());
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("++++ Livros na ordem de inserção +++++");
        Map<String, Livro> livros2 = new LinkedHashMap<>(){{
            put("Hawking' Stephen", new Livro("Uma breve história do tempo.", 256));
            put("Duhigg' Charles", new Livro("O poder do hábito", 408));
            put("Harari' Yuval Naah", new Livro("Lições para o século XXI", 432));
        }};
        for(Map.Entry<String, Livro> livro : livros2.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getTitulo());
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("++++ Ordem alfabética autor ++++");
        Map<String, Livro> livros3 = new TreeMap<>(livros2);
        for(Map.Entry<String, Livro> livro : livros3.entrySet()){
            System.out.println(livro.getKey()+" - "+livro.getValue().getTitulo());
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("++++ Ordem alfabética dos títulos dos livros ++++");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorLivroNome());
        livros4.addAll(livros1.entrySet());
        for(Map.Entry<String, Livro> livro : livros4){
            System.out.println(livro.getKey()+" - "+livro.getValue().getTitulo());
        }

    }
}

class ComparatorLivroNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getTitulo().compareToIgnoreCase(livro2.getValue().getTitulo());
    }
}