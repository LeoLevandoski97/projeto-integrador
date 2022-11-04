package com.example.projetointegrador.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CarteiraDTO {
    private Long id;
    private String nome;
    private String porcentagens;
    private LocalDate dataInicioInvestimento;
    private  LocalDate dataTerminoInvestimento;
}
