package com.dio.propertiesvalue.app;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    // Conceito de Expression
    // Quando eu tiver outras propriedades semelhantes tipo name ou outros parecidos,
    // eu com dois pontos : Aqui-Nome-Pra-Nao-Ficar-Vazio


    @Value("${name:Nothing-NAME}")
    private String nome;

    @Value("${email}")
    private String email;

    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[] {11955559999L}));

    //Declaração métdo run
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nEmail:" + email
                + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi realizado.");
    }

}


