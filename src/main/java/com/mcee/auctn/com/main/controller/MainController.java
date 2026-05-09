package com.mcee.auctn.com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/com/main/main.do")
	public String main() {
		return "com/main/main";
	}
}
