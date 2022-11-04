package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Usuarios;

import java.util.List;

public interface UsuariosService {
    List<Usuarios> listar();
    Usuarios editar(Usuarios usuarios);
    Usuarios salvar(Usuarios usuarios);
}
