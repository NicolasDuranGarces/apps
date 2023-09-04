package com.nicolas.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nicolas.MyFirstDbWebApplication;




@Repository
public class PersonaRepo implements IPersonaRepo {
	private static Logger LOG = LoggerFactory.getLogger(MyFirstDbWebApplication.class);

	@Override
	public void registrarPersona(String nombre) {
		// TODO Auto-generated method stub
		LOG.warn("SE REGISTRO EL NOMBRE "+nombre);
		//Debe de ir la conexion con la Base de datos.
	}


}
