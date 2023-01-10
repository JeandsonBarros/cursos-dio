package org.example.subsistema2;

public class CepApi {
    private static final CepApi cepApi = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return cepApi;
    }

    public String recuperarCidade(String cep){
        return "Cabrobó";
    }

    public String recuperarEstado(String cep){
        return "Pernambuco";
    }

}
