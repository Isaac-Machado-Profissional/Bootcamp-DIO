package com.dio.configurationproperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


// Continuando o arquivo da aula 2_4, porém dessa vez implementando novidades em SistemaMensagem


@SpringBootApplication
@EnableConfigurationProperties
public class ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationPropertiesApplication.class, args);
	}
}
