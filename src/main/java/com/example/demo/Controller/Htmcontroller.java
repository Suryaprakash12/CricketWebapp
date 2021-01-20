package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repo.Cricrepo;

@Controller
//@RequestMapping("/user")

public class Htmcontroller {
	
	
	@Autowired
	private Cricrepo cric;
		@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@RequestMapping("/index")
	
	public String home(Model model)
	{
		//model.addAttribute("scores", cric.findAll());
		return "index";
	}
	@RequestMapping("/calendar")
	
	public String calendar(Model model)
	{
		model.addAttribute("scores", cric.findAll());
		return "calendar";
	}
	@RequestMapping("/livescores")
	public String livescores()
	
	{
		//model.addAttribute("scores", cric.findAll());
		return "livescores";
	}
	@RequestMapping("/news")
	public String news()
	
	{
		//model.addAttribute("scores", cric.findAll());
		return "news";
	}


	
}
