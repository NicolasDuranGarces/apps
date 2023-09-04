package com.nicolas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nicolas.service.IPersonaService;


@SpringBootApplication
public class MyFirstDbWebApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(MyFirstDbWebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyFirstDbWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
