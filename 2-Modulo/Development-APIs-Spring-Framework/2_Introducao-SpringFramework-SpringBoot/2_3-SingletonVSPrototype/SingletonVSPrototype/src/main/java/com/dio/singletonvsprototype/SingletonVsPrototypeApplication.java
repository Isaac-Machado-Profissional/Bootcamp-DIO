package com.dio.singletonvsprototype;

import app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ComponentScan("app")
public class SingletonVsPrototypeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonVsPrototypeApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
        return args -> {
            sistema.enviarConfirmacaoCadastro();
            sistema.enviarMensagemBoasVindas();
            sistema.enviarConfirmacaoCadastro();
        };
    }

}
