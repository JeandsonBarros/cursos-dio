package org.example;

import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

        /* *
          É esperado que os endereços de memória sejam os mesmos
        */

        SingletonLazy singletonLazy1 = SingletonLazy.getInstancia();
        System.out.println(singletonLazy1);
        SingletonLazy singletonLazy2 = SingletonLazy.getInstancia();
        System.out.println(singletonLazy2);
        System.out.println("singletonLazy1 e singletonLazy2 são iguais: "+ (singletonLazy1 == singletonLazy2));

        System.out.println("-------------------------------------------");

        SingletonEager singletonEager1  = SingletonEager.getInstancia();
        System.out.println(singletonEager1);
        SingletonEager singletonEager2 = SingletonEager.getInstancia();
        System.out.println(singletonEager2);
        System.out.println("singletonEager1 e singletonEager2 são iguais: "+ (singletonEager1 == singletonEager2));

        System.out.println("-------------------------------------------");

        SingletonLazyHolder singletonLazyHolder1  = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder1);
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder2);
        System.out.println("singletonLazyHolder1 e singletonLazyHolder2 são iguais: "+ (singletonLazyHolder1 == singletonLazyHolder2));

        System.out.println("-------------------------------------------");

    }
}