package com.example.projetointegrador.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Carteira")
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private Double saldo;
    private Date dataInicioInvestimento;
    private Date dataTerminoInvestimento;


}
