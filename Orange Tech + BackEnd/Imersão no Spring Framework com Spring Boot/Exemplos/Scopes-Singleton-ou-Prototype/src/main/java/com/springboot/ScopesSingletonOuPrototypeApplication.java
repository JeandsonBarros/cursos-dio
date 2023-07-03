package com.springboot;

import com.springboot.app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopesSingletonOuPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopesSingletonOuPrototypeApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(SistemaMensagem sistemaMensagem){
		return args -> {
			sistemaMensagem.enviarConfirmacaoCadastro();
			sistemaMensagem.enviarMensagemBoasVindas();
			sistemaMensagem.enviarConfirmacaoCadastro();
		};
	}
}
