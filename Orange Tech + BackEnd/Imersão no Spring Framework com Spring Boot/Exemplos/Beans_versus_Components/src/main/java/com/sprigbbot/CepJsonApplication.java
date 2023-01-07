package com.sprigbbot;

import com.google.gson.Gson;
import com.sprigbbot.app.ConversorJson;
import com.sprigbbot.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CepJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CepJsonApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ConversorJson conversorJson) throws Exception{
		return args -> {
			String json = "{\"cep\":\"56180-000\", \"logradouro\": \"Rua Flora de Novaes\", \"localidade\":\"Centro\"}";
			ViaCepResponse viaCepResponse = conversorJson.converter(json);
			System.out.println("Dados do cep: "+viaCepResponse);
		};
	}

	/*@Bean
	public Gson gson(){
		return new Gson();
	}*/

}
