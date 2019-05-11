package com.ControleAcesso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleAcesso.Model.Acesso;
import com.ControleAcesso.Model.Usuario;
import com.ControleAcesso.Repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	AcessoRepository acessoRepository;
	
	public boolean save(Acesso acesso) {
		try {
			acessoRepository.save(acesso);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(Acesso acesso) {
		try {
			acessoRepository.save(acesso);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean delete(Acesso acesso) {
		try {
			acessoRepository.deleteById(acesso.getId());
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public Acesso findById(Integer id) {
		return acessoRepository.findById(id).orElse(null);
	}
	
	public List<Acesso> findAll() {
		return acessoRepository.findAll();
	}
	
	

}
