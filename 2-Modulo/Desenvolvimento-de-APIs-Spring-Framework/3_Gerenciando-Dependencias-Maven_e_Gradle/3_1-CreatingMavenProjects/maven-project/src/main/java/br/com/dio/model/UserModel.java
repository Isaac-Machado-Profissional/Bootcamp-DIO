package br.com.dio.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
// todo: DATA é um resumao de todas essas anotações descritas acima

public class UserModel {

    private int code;
    private String userName;
    private LocalDate birthday;
}
