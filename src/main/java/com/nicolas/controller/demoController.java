package com.nicolas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nicolas.models.User;
import com.nicolas.repository.IUserRepository;
import com.nicolas.service.IPersonaService;

@Controller
@RequestMapping("/user")
public class demoController {

    @Autowired
    private IUserRepository usuarioRepository;
    
    @Autowired
	private IPersonaService service;

    @GetMapping("/users")
    public String listUsers(Model model) {
        // Obtener todos los usuarios de la base de datos
        List<User> usuarios = usuarioRepository.findAll();

        model.addAttribute("usuarios", usuarios);
        return "user-list"; // Retorna el nombre del archivo HTML en src/main/resources/templates
    }
    
    @GetMapping("/register-user")
    public String registerUser(Model model) {
    	List<User> usuarios = usuarioRepository.findAll();
    	service.registrar("NICOLAS");
    	return "user-list";
    }
}
