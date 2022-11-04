package com.example.projetointegrador.services;

import com.example.projetointegrador.models.Usuarios;
import com.example.projetointegrador.repositors.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService {
    final UsuariosRepository usuariosRepository;

    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository=usuariosRepository;
    }
    @Override
    public List<Usuarios> listar(){
        return usuariosRepository.findAll();
    }
    @Override
    public Usuarios editar(Usuarios usuarios){
        return usuariosRepository.save(usuarios);
    }
    @Override
    public Usuarios salvar(Usuarios usuarios){
        return usuariosRepository.save(usuarios);

    }
}
