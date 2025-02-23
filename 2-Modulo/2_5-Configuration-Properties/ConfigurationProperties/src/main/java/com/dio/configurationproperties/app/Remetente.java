package com.dio.configurationproperties.app;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // Configuração entra aqui, associado completamente ao application.properties
@ConfigurationProperties(prefix = "remetente") // Mas exclusivamente à propriedade de prefixo remetente
public class Remetente {
    private String nome;
    private String email;
    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
