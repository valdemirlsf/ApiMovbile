package com.ifpe.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifpe.mobile.models.Municipio;
import com.ifpe.mobile.repository.MunicipioRepository;

@RestController
@RequestMapping("/Municipio")
public class MunicipioController {
	
	@Autowired
	MunicipioRepository municipiodao;
	
	@GetMapping("/municipios")
	public List<Municipio> getAll(){
		
		return municipiodao.findAll();
		
	}
}
