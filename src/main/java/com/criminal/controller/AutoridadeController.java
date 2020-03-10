package com.criminal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.criminal.model.Autoridade;
import com.criminal.repository.AutoridadeRepository;


@Controller
@RequestMapping("/autoridade")
public class AutoridadeController {
	
	@Autowired
	private AutoridadeRepository autoridadeRepository;

	
	@GetMapping("/autoridade/listar")
	public String listar() {
		return "/autoridade/index";
		}
	
	@PostMapping("/autoridade/listar")
	public String salvar(Autoridade autoridade) {
		autoridadeRepository.save(autoridade);
		return "/autoridade/index";
		}


}
