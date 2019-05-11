package com.ControleAcesso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ControleAcesso.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
