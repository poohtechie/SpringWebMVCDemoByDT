package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	/* Way 1 : Using Redirect Prefix */
	@RequestMapping("/first")
	public String first() {
		/* Redirect automatically from first to third */
		return "redirect:/third"; // Redirect Prefix
	}

	/* Way 2 : Using RedirectView */
	@RequestMapping("/second")
	public RedirectView second() {
		/* Redirect automatically from second to third */
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("third");
//		redirectView.setUrl("https://www.google.com");
		
		return redirectView; // RedirectView
	}

	@RequestMapping("/third")
	public String third() {
		
		return "register";
	}
}
