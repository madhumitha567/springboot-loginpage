package com.example.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.hospital.repository.*;
import com.example.hospital.model.*;
@Controller
public class UserController {
	
	@Autowired
	private UserRepository userrepo;
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String processRegistration(@ModelAttribute User user) {
		// Save user to database (dummy print here)
		userrepo.save(user);
		System.out.println("User Registered: " + user.getUsername());
		return "redirect:/login";
	}


	
	
}
