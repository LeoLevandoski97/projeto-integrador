package com.example.projetointegrador.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.swing.text.Document;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private  String nome;
    private Endereço endereco;
    private String cpf;
    private Documento documento;
    private String genero;
    private Integer idade;
    private Boolean rendimentoMensal;
    private String estadoCivil;
    private String dependentes;

}
