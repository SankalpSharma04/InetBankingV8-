package com.example.InetBankingV8.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

	 @RequestMapping("/helloWorld")
	    public String helloWorld(Model model) {
	        model.addAttribute("message", "Hello World!");
	        return "helloWorld";
	    }
	
}
