package com.example.ejercicioevaluable3.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Usuario implements Serializable {
    private Integer id;
    private String correo;
    private String plataforma;
    private Boolean administrador;
    private Integer version;
    private String hora;
}
