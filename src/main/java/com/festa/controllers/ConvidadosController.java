package com.festa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.festa.model.Convidado;
import com.festa.repository.Convidados;

@Controller
//@RequestMapping("/convidados")
public class ConvidadosController {

	@Autowired
	Convidados convidados;
	
	@PostMapping("/convidados")
//	@PostMapping
	public String salvar(Convidado convidado){
		this.convidados.save(convidado);
		return "redirect:/convidados";
	}
	
	@GetMapping("/convidados")
//	@GetMapping
	public ModelAndView listar() {
		
		ModelAndView modelAndView = new ModelAndView("ListaConvidados");
		
		modelAndView.addObject("convidados", convidados.findAll());
		Convidado convidado = new Convidado();
		modelAndView.addObject(convidado);
		
		return modelAndView;
	}
		
}
