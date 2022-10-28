package com.example.projetointegrador.dto;

import com.example.projetointegrador.models.Carteira;
import com.example.projetointegrador.models.Documento;
import com.example.projetointegrador.models.Endereço;
import lombok.Data;

@Data
public class UsuarioDTO {
    private Long id;
    private String nome;
    private Documento documento;
    private Endereço endereco;
    private Integer idade;
    private String genero;
    private String estadoCivil;
    private String dependentes;
    private Double rendimentos;
    private Carteira carteira;

}
