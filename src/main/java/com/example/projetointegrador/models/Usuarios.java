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

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinTable(name="documento_usuarios",
    joinColumns = @JoinColumn(name="id_documento"),
    inverseJoinColumns = @JoinColumn(name = "id_usuarios"))
    private Documento documento;

    @ManyToOne(cascade ={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinTable(name="usuarios_endereco",
    joinColumns=@JoinColumn(name="id_endereco"),
    inverseJoinColumns=@JoinColumn(name = "id_usuarios"))
    private Endereço endereco;

    @Column(name = "cpf")
    private String cpf;



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

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH,CascadeType.PERSIST},fetch = FetchType.LAZY)
    @JoinTable(name = "usuarios_carteira",
    joinColumns = @JoinColumn(name = "id_carteira"),
    inverseJoinColumns = @JoinColumn(name = "id_usuarios"))
    private Carteira carteira;

}
