package org.example;

import org.example.facade.Facade;

/* *
 Um Facade é um objeto que provê uma interface simplificada para um corpo de código maior,
 como por exemplo, uma biblioteca de classes.
 Podi-se dizer que Facede é uma classe que faz uso de outros sistemas e simplifica em um único lugar.
 Por exemplo, usar um sistema que salva um usuário com nome, CEP, estado e cidade,
 e usar outro sistema que busca cidade e estado por meio do CEP.
 A interface(class) Facede uni todos esses sistemas em um único lugar ou método
 simplificado e fácil de usar.
* */

public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.migrarCliente("Jeu", "56180000");

    }
}