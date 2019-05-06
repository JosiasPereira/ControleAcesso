package com.ControleAcesso.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Acesso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acesso_id_acesso_seq")
	@SequenceGenerator(name = "acesso_id_acesso_seq", sequenceName = "acesso_id_acesso_seq", allocationSize = 1)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idusuario", nullable=false)
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="idobjeto", nullable=false)
	private Objeto objeto;
	
	@Column(name = "ler")
	private Boolean ler;
	
	@Column(name = "escrever")
	private Boolean escrever;
	
	@Column(name = "executar")
	private Boolean executar;
}
