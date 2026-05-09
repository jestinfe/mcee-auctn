package com.mcee.auctn.com.lgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LgnController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/com/lgn/lgn.do";
	}
	
	@GetMapping("/com/lgn/lgn.do")
	public String lgn() {
		return "com/lgn/lgn";
	}
}
