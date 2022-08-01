package com.ifpe.mobile.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifpe.mobile.repository.OcorrenciaRepository;
import com.ifpe.mobile.repository.UserRepository;
import com.ifpe.mobile.models.Ocorrencia;
import com.ifpe.mobile.models.User;

@RestController
@RequestMapping("/User")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/")
	public User saveUser(User user, Model model) {
		return userRepository.save(user);
	}
}
