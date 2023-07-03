package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
            Crie um conjunto contendo as cores do arco-íris e:
                .Exiba todas as cores uma abaixo da outra
                .A quantidade de cores que o arco-íris tem
                .Exiba as cores em ordem alfabética
                .Exiba as cores na ordem inversa da que foi informada
                .Exiba todas as cores que começam com a letra ”v”
                .Remova todas as cores que não começam com a letra “v”
                .Limpe o conjunto
                .Confira se o conjunto está vazio
        */

        /*
        * Quais são as cores do arco-íris?
            vermelho.
            laranja.
            amarelo.
            verde.
            azul.
            anil.
            violeta.
        * */

        System.out.println("---------------------------------------------------------");

        Set<String> coresDoArcoIres1 = new HashSet<>(Arrays.asList("vermelho", "azul", "verde", "laranja", "amarelo", "anil", "violeta"));
        System.out.println("Exiba todas as cores uma abaixo da outra:");
        coresDoArcoIres1.forEach(cor -> System.out.println("- " + cor));

        System.out.println("---------------------------------------------------------");

        System.out.println("A quantidade de cores que o arco-íris tem: " + coresDoArcoIres1.size());

        System.out.println("---------------------------------------------------------");

        System.out.println("Exiba as cores em ordem alfabética:");
        Set<String> coresDoArcoIres2 = new TreeSet<>(coresDoArcoIres1);
        coresDoArcoIres2.forEach(cor -> System.out.println("- " + cor));

        System.out.println("---------------------------------------------------------");

        System.out.println("Exiba as cores na ordem inversa da que foi informada:");
        List<String> coresDoArcoIres3 = new ArrayList<>(coresDoArcoIres1);
        System.out.println("Antes da ordem inversa: " + coresDoArcoIres3);
        Collections.reverse(coresDoArcoIres3);
        System.out.println("Depois da ordem inversa: " + coresDoArcoIres3);

        System.out.println("---------------------------------------------------------");

        System.out.println("Exiba todas as cores que começam com a letra ”v”");
        coresDoArcoIres3.forEach(cor->{
            if(cor.startsWith("v"))
                System.out.println(cor);
        });

        System.out.println("---------------------------------------------------------");

        System.out.println("Remova todas as cores que não começam com a letra “v”");
        System.out.println("Antes remover: " + coresDoArcoIres3);
        Iterator<String> coresDoArcoIresIterator = coresDoArcoIres3.iterator();
        while(coresDoArcoIresIterator.hasNext()) {
            String cor = coresDoArcoIresIterator.next();
            if (!cor.startsWith("v"))
                coresDoArcoIresIterator.remove();
        };
        System.out.println("Depois remover: " + coresDoArcoIres3);

        System.out.println("---------------------------------------------------------");

        coresDoArcoIres1.clear();
        System.out.println("Confira se o conjunto está vazio: " + coresDoArcoIres1.isEmpty());
    }
}