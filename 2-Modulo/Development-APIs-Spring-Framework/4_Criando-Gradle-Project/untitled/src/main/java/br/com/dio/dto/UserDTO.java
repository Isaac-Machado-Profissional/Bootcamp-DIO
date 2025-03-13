package br.com.dio.dto;

import lombok.*;

import java.time.LocalDate;

@Data
public class UserDTO {

    private int id;

    private String name;

    private LocalDate birthday;
}
