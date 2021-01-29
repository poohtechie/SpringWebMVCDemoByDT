package com.spring.mvc.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mainhome")
public class HomeController {

	@RequestMapping("/home")
	public String homePage(Model model) {
		/* Way 1: Send data from controller to view(index.jsp) using Model */
		model.addAttribute("nameKey", "Riddhi");
		model.addAttribute("idKey", 10001);

		List<String> friendList = new ArrayList<String>();
		friendList.add("Vaishu");
		friendList.add("Niyati");
		friendList.add("Aruna");
		model.addAttribute("listKey", friendList);

		return "index";
	}

	@RequestMapping("/about")
	public ModelAndView aboutPage() {
		/* Way 2: Send data from controller to view(index.jsp) using ModelAndView */

		// Creating object of ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// Setting the data
		modelAndView.addObject("nameKey", "Vaishali");
		modelAndView.addObject("rollNoKey", 12345);
		LocalDateTime dateTime = LocalDateTime.now();
		modelAndView.addObject("dateKey", dateTime);

		List<Integer> marksList = new ArrayList<Integer>();
		marksList.add(50);
		marksList.add(60);
		marksList.add(80);
		marksList.add(90);
		modelAndView.addObject("listKey", marksList);

		// Setting the view name(about.jsp)
		modelAndView.setViewName("about");

		return modelAndView;
	}

}
