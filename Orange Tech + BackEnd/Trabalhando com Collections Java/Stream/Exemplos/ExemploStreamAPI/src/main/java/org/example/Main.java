package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> numeros1 = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^ Imprimir todos os elementos da lista de String ^-^");
        /*numeros1.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        numeros1.forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^ Colocar os 5 primeiros números em um Set ^-^");
        //numeros1.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        //Set não aceita valores repetidos
        Set<String> cincoPrimeirosNumeros = numeros1.stream().limit(5).collect(Collectors.toSet());
        cincoPrimeirosNumeros.forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^ Transformar a lista de String em uma lista de Inteiros ^-^");
        //numeros1.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
        List<Integer> numerosInteger = numeros1.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosInteger.forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^ Pegue os números pares e maiores que 2 e coloque em uma lista ^-^");
        //numeros1.stream().map(Integer::parseInt).filter(numero -> numero % 2 == 0 && numero > 2 ).collect(Collectors.toList()).forEach(System.out::println);
        List<Integer> paresEMaioresQue2 = numeros1.stream().map(Integer::parseInt).filter(numero -> numero % 2 == 0 && numero > 2 ).collect(Collectors.toList());
        paresEMaioresQue2.forEach(System.out::println);

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^ Soma dos números ^-^");
        var soma =numeros1.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("Soma: "+soma);

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^ Média dos números ^-^");
        numeros1.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^ Ignorar os 3 primeiros números ^-^");
        System.out.println(numeros1);
        var numeros2 = numeros1.stream().skip(3).collect(Collectors.toList());
        System.out.println(numeros2);

        System.out.println("----------------------------------------------------------");

        System.out.println("^-^  Remover números impares ^-^");
        var numerosInteger2 = numeros1.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosInteger2.removeIf(numero -> numero % 2 != 0);
        numerosInteger2.forEach(System.out::println);





    }
}