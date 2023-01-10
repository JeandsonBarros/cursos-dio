package org.example;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;

    public Carro() {
    }

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    /* *
    * Retorna uma string contendo o modelo do carro
    */
    public String getModelo() {
        return modelo;
    }

    /* *
     * Recebe uma string contendo o modelo do carro
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /* *
     * Retorna uma string contendo a marca do carro
     */
    public String getMarca() {
        return marca;
    }

    /* *
     * Recebe uma string contendo a marca do carro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }
}
