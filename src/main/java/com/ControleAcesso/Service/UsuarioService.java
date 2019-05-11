package com.ControleAcesso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleAcesso.Model.Usuario;
import com.ControleAcesso.Repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public boolean save(Usuario usuario) {
		try {
			usuarioRepository.save(usuario);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(Usuario usuario) {
		try {
			usuarioRepository.save(usuario);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean delete(Usuario usuario) {
		try {
			usuarioRepository.deleteById(usuario.getId());
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public Usuario findById(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	

}
