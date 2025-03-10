package br.com.dio.dto;

import lombok.Data;

import java.time.LocalDate;

// Lombok DATA, puxando em main uma nova var e definindo uma ID e verificando em target
// Podemos entrar em classes e ver exatamente oque foi criado
@Data

public class UserDTO {

    private int id;

    private String name;

    private LocalDate birthday;

}
