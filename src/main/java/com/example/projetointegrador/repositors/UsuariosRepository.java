package com.example.projetointegrador.repositors;

import com.example.projetointegrador.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
}
