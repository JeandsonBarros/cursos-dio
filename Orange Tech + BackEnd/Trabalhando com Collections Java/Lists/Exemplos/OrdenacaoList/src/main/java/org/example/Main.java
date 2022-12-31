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
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("\n ---- Ordem cor ----");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("\n ---- Ordem nome/idade/cor ----");
        gatos.sort(new ComparatorNomeIdadeCor());
        System.out.println(gatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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