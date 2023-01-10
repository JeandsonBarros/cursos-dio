package org.example.facade;

import org.example.subsistema1.CrmService;
import org.example.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstance().recuperarCidade("56180000");
        String estado = CepApi.getInstance().recuperarEstado("56180000");

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
