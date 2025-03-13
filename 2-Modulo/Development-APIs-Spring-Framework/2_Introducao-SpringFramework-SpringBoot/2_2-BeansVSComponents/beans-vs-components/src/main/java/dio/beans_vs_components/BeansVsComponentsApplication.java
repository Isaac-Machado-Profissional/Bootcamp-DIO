package dio.beans_vs_components;

import com.google.gson.Gson;
import dio.beans_vs_components.app.ConversorJson;
import dio.beans_vs_components.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BeansVsComponentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeansVsComponentsApplication.class, args);
	}

	@Bean //
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}"; //Simulando REQ. HTTP
			ViaCepResponse response = conversor.converter(json); //
			System.out.println("Dados do CEP: " + response);
		};
	}

	/*
	Maneira rústica de tratar o Gson da Google como um Bean:

	@Bean
	public Gson gson() {
		return new Gson(); //Eliminaria o new podendo injetar em qualquer parte da aplicação e daria certo.
	}

	Porém em algum momento onde eu precisaria criar vários Beans(Pelo uso de Recursos externos, isso não seria muito interessante de poluir a Classe principal.

	*R: Então vamos criar uma classe Bean só pra isso em app.


	*/
}
