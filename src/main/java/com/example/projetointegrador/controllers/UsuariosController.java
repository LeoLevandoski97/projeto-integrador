package com.example.projetointegrador.controllers;

import com.example.projetointegrador.models.Usuarios;
import com.example.projetointegrador.services.UsuariosServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class UsuariosController {
    final UsuariosServiceImpl usuariosServiceImpl;

    public UsuariosController(UsuariosServiceImpl usuariosService) {
        this.usuariosServiceImpl= usuariosService;
    }
    @PostMapping(value = "/salvarUsuario")
    public ResponseEntity<Object> salvarUsuario(@RequestBody Usuarios usuarios) {
        Usuarios response= usuariosServiceImpl.salvar(usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping(value = "/buscarUsuario")
    public ResponseEntity<Object> buscarUsuario() {
        List<Usuarios> response=usuariosServiceImpl.listar();
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
    @PutMapping(value = "/alterarUsuario")
    public ResponseEntity<Object> alteraUsuario(@RequestBody Usuarios usuarios){
        Usuarios response= usuariosServiceImpl.editar(usuarios);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
