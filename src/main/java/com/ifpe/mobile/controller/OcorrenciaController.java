package com.ifpe.mobile.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifpe.mobile.models.Ocorrencia;
import com.ifpe.mobile.repository.OcorrenciaRepository;

@RestController
@RequestMapping("/")
public class OcorrenciaController {
	@Autowired
	OcorrenciaRepository ocorrenciaRepository;
	
	
	@GetMapping("/")
	public List<Ocorrencia> getAll() {
		return ocorrenciaRepository.findAll();
	}
	
	@GetMapping("/municipio/{cidade}")
	public List<Ocorrencia> getByCity(@PathVariable String cidade) {
		List <Ocorrencia> filtrada = new ArrayList<>();
		for (Ocorrencia oc: ocorrenciaRepository.findAll()) {
			if(oc.getMUNICIPIO().equalsIgnoreCase(cidade)) {
				filtrada.add(oc);
			}
		}
		return filtrada;
	}
	
	@GetMapping("/municipiot/{cidade}/{natureza}/{ano}")
	public int totalByCity(@PathVariable String cidade, @PathVariable String natureza, @PathVariable int ano) {
		List <Ocorrencia> filtrada = new ArrayList<>();
		for (Ocorrencia oc: ocorrenciaRepository.findAll()) {
			if(
				(oc.getMUNICIPIO().equalsIgnoreCase(cidade)||oc.getMUNICIPIO().contains(cidade.toUpperCase())) && 
				(oc.getNATUREZA().equalsIgnoreCase(natureza) || oc.getNATUREZA().contains(natureza.toUpperCase())) && 
				(oc.getANO() == ano)	
			
					) {
				filtrada.add(oc);
			}
		}
		return filtrada.size();
	}
}
