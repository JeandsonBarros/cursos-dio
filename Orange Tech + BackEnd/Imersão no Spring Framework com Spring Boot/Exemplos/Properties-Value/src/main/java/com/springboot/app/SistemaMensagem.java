package com.springboot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {

    //@Value com valor padrão, caso não encontre o "name"
    @Value("${name:Jeandson Barros}")
    private String nome;
    @Value("${email}")
    private String email;

    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\nMensagem envida por: "+nome);
        System.out.println("E-mail: "+email);
        System.out.println("Com telefones para contato: "+telefones);
        System.out.println("Seu cadastro foi aprovado");
    }
}
