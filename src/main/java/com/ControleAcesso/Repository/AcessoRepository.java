package com.ControleAcesso.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ControleAcesso.Model.Acesso;

public interface AcessoRepository extends JpaRepository<Acesso, Integer> {

}
