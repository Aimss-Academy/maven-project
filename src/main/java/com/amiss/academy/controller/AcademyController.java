package com.amiss.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AcademyController {
	
	@RequestMapping(value = "/index")
	   public String index() {
	      return "index";
	   }

}
