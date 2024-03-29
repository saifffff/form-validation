package com.spring.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.app.entities.User;

import jakarta.validation.Valid;



@Controller
public class MainController {

	
	@RequestMapping("/home")
	public String goHome(Model model) {
		System.out.println("sending to homepage");
		
		List<String> friends = List.of("Akib","Monu","Zickran","Sharique","Kaale","Hamdan");
		model.addAttribute("myfriends", friends);
		model.addAttribute("name", "saif");
		model.addAttribute("male", true);
		return "home";
	}
	
	@RequestMapping("/signup")
	public String goLogin(Model model) {
		System.out.println("login pagee....");
		model.addAttribute("userData", new User());
		return "signup";
	}
	
	@PostMapping("/loginSubmit")
	public String handleLogin(
			@Valid @ModelAttribute("userData") User userData,
			BindingResult result,
			Model model
			) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "signup";
		}
		System.out.println(userData);
		model.addAttribute("userProfile", userData);
		return "profile";
	}
	
}
