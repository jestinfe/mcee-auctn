package com.mcee.auctn.com.mbrJoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mcee.auctn.com.mbrJoin.service.MbrJoinService;
import com.mcee.auctn.com.mbrJoin.vo.MbrJoinReqVO;

import jakarta.validation.Valid;

@Controller
public class MbrJoinController {
	
	private MbrJoinService mbrJoinService;
	
	@Autowired
	public MbrJoinController(MbrJoinService mbrJoinService) {
		this.mbrJoinService = mbrJoinService;
	}
	
	@GetMapping("/com/mbrJoin/mbrJoin.do")
	public String mbrJoin() {
		return "com/mbrJoin/mbrJoin";
	}
	
	@PostMapping("/com/mbrJoin/mbrJoin.do")
	public String join(@Valid MbrJoinReqVO mbrJoinReqVO,
		BindingResult bindingResult,
		RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			redirectAttributes.addFlashAttribute("msg",
					bindingResult.getAllErrors().get(0).getDefaultMessage());
			
			return "redirect:/com/mbrJoin/mbrJoin.do";
		}
		
		try {
			mbrJoinService.join(mbrJoinReqVO);
			redirectAttributes.addFlashAttribute("msg", "회원가입이 완료되었습니다. 로그인하세요.");
			
			return "redirect:/com/lgn/lgn.do";
		} catch (IllegalArgumentException e) {
			redirectAttributes.addFlashAttribute("msg", e.getMessage());
			
			return "redirect:/com/mbrJoin/mbrJoin.do";
		}
	}
}
