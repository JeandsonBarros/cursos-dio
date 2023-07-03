package org.example.singleton;

/**
* Singleton preguiçoso proprietário
*
* @author jeandson
*/
public class SingletonLazyHolder {

    private static class HolderInstance{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    /*Construtor privado impede que essa classe seja instanciada em outro lugar*/
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return HolderInstance.instancia;
    }

}
