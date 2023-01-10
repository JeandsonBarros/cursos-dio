package org.example.singleton;

/* Singleton apressado */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    /*Construtor privado impede que essa classe seja instanciada em outro lugar*/
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
