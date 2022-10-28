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
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuarios")
    private Long Id;
    @Column(name = "nome")
    private  String nome;
    @Column(name = "endereco")
    private Endereço endereco;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "documento")
    private Documento documento;
    @Column(name = "genero")
    private String genero;
    @Column(name = "idade")
    private Integer idade;
    @Column(name = "rendimentos")
    private Boolean rendimentoMensal;
    @Column(name = "estadocivil")
    private String estadoCivil;
    @Column(name = "dependentes")
    private String dependentes;

}
