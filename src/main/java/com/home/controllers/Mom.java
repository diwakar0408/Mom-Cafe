package com.home.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mom")
public class Mom {
	
	@RequestMapping("/cafe")
	public String sugerMethod() {
		return "order";
	}
	
	@RequestMapping("/placeprocess")
	public String success(HttpServletRequest req,Model model){
		String iteam=req.getParameter("iteam");
		model.addAttribute("iteamname", iteam);
		return "sucess";
	}

}
