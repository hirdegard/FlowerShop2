package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/flower")
public class FlowerController {

	@GetMapping
	public String list() {
		return "flowers/list";
		
	}
	
	@GetMapping("/add")
	public String addGet() {
		return "flowers/add";
	}
	
	@PostMapping("/add")
	public String addPost() {
		return "redirect:/flower/addDone";
	}
	
	@GetMapping("/addDone")
	public String addDone () {
		return "flowers/addDone";
	}
}
