package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("\n ---- Ordem de inserção -----");
        System.out.println(gatos);

        System.out.println("\n ---- Ordem aleatória ----");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("\n ---- Ordem natural (Nome) ----");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("\n ---- Ordem idade ----");
        /* Usando classe ComparatorIdade */ //Collections.sort(gatos, new ComparatorIdade());
        /* Usando interface funcional */ Collections.sort(gatos, new Comparator<Gato>() {
            @Override
            public int compare(Gato gato1, Gato gato2) {
                return Integer.compare(gato1.getIdade(), gato2.getIdade());
            }
        });
        System.out.println(gatos);

        System.out.println("\n ---- Ordem cor ----");
        /* Com interface Comparator:*/  //gatos.sort(new ComparatorCor());
        /*Função lambda:*/ //gatos.sort(Comparator.comparing(gato->gato.getCor()));
        /*Reference method:*/ gatos.sort(Comparator.comparing(Gato::getCor));
        System.out.println(gatos);

        System.out.println("\n ---- Ordem nome/idade/cor ----");
        gatos.sort(new ComparatorNomeIdadeCor());
        System.out.println(gatos);

    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeIdadeCor implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {

        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(nome != 0) return nome;

        int idade = Integer.compare(gato1.getIdade(), gato2.getIdade());
        if(idade != 0) return idade;

        return gato1.getCor().compareToIgnoreCase(gato2.getCor());

    }

}