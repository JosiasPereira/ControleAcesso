package com.ControleAcesso.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ControleAcesso.Service.AcessoService;

@Controller
@RequestMapping(
		value="/login",
		consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
		produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AcessoController {
	
    @Autowired
	AcessoService acessoService;
	

}
