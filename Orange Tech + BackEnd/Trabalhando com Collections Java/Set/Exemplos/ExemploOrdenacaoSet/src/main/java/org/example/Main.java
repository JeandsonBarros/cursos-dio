package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Serie> series1 = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70 show", "comédia", 25));
        }};

        System.out.println("\n----- Exibir series -----");
        series1.forEach(serie-> System.out.printf("%s - %s - %d \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio()));

        System.out.println("\n----- Exibir na rodem de inserção -----");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70 show", "comédia", 25));
        }};
        series2.forEach(serie-> System.out.printf("%s - %s - %d \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio()));

        System.out.println("\n---- Exibir na ordem natural (Tempo de episódio) ----");
        Set<Serie> series3 = new TreeSet<>(series1);
        series3.forEach(serie-> System.out.printf("%s - %s - %d \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio()));

        System.out.println("\n---- Exibir na ordem natural (Nome, Gênero,Tempo de episódio) ----");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series4.addAll(series1);
        series4.forEach(serie-> System.out.printf("%s - %s - %d \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio()));

        System.out.println("\n---- Exibir na ordem gênero ----");
        Set<Serie> series5 = new TreeSet<>(new ComparatorGenero());
        series5.addAll(series1);
        series5.forEach(serie-> System.out.printf("%s - %s - %d \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio()));

        System.out.println("\n---- Exibir na ordem tempo de episódio ----");
        Set<Serie> series6 = new TreeSet<>(new ComparatorGenero());
        series6.addAll(series1);
        series6.forEach(serie-> System.out.printf("%s - %s - %d \n", serie.getNome(), serie.getGenero(), serie.getTempoEpisodio()));


    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
       int nome = serie1.getNome().compareTo(serie2.getNome());
       if(nome!=0) return nome;

       int genero = serie1.getGenero().compareTo(serie2.getGenero());
       if (genero != 0) return genero;

       return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }
}

class ComparatorTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {

        return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
    }
}

class ComparatorGenero implements Comparator<Serie>{
    @Override
    public int compare(Serie serie1, Serie serie2) {

        return serie1.getGenero().compareTo(serie2.getGenero());
    }
}