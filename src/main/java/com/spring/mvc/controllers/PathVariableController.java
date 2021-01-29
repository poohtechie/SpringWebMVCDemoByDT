package com.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {

	@RequestMapping("/user/{userId}/{username}")
	public String getUserDeatil(@PathVariable("userId") int userId, @PathVariable("username") String username) {
		System.out.println(userId + " : " + username);
		
		return "register";
	}
}
