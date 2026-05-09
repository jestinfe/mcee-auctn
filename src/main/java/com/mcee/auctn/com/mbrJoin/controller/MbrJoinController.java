package com.mcee.auctn.com.mbrJoin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MbrJoinController {
	
	@GetMapping("/com/lgn/mbrJoin.do")
	public String mbrJoin() {
		return "com/lgn/mbrJoin";
	}	
}
