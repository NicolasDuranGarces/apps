package com.nicolas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.repository.IPersonaRepo;



@Service
public class PersonaService implements IPersonaService {
	
	@Autowired
	private IPersonaRepo repository;

	@Override
	public void registrar(String nombre) {
		repository.registrarPersona(nombre);
	}

}
