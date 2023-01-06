package org.example;
import one.digitalinnovation.OlaMundo;

public class Main {
    public static void main(String[] args) {

        // Usando uma dependcia que foi publicada localmente como um componente(projeto)
        OlaMundo olaMundo = new OlaMundo();
        System.out.println(olaMundo.getMENSAGEM());
        System.out.println("Hello world!");
    }
}