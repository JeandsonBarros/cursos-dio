package org.example.singleton;

/*
* Singleton preguiçoso
* */
public class SingletonLazy {

    private static SingletonLazy instancia;

    /*Construtor privado impede que essa classe seja instanciada em outro lugar*/
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }

        return instancia;
    }

}
