package com.example.projetointegrador.models;

import lombok.*;

import javax.naming.Name;
import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "carteira")
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "saldo")
    private Double saldo;
    @Column(name = "dataInicioInvestimento")
    private Date dataInicioInvestimento;
    @Column(name = "dataTerminoInvestimento")
    private Date dataTerminoInvestimento;


}
