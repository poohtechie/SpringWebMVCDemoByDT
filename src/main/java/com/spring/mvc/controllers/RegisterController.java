package com.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.bean.UserBean;
import com.spring.mvc.service.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@ModelAttribute // CommonData used in every page. This is called before below handler method
	public void commonDataModel(Model model) {
		model.addAttribute("Header", "Simple Demo");
		model.addAttribute("Desc", "Demo for programmer");
	}

	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}

	@RequestMapping(path = "/processregister", method = RequestMethod.POST)
//	public String processRegister(HttpServletRequest request) { // Way 1
//	public String processRegister(@RequestParam("name") String getName, @RequestParam("email") String getEmail, @RequestParam("password") String getPassword, Model model) { // Way 2
	public String processRegister(@ModelAttribute UserBean userBean, Model model) { // Way 3
		/* Way 1 : Getting data from view using HttpServletRequest */
//		String getName = request.getParameter("name");
//		System.out.println(getName);

		/* Way 2 : Getting data from view using @RequestParam */
//		System.out.println(getName + " : " + getEmail + " : " + getPassword);

//		// Get data & set data in bean
//		UserBean userBean = new UserBean();
//		userBean.setName(getName);
//		userBean.setEmail(getEmail);
//		userBean.setPassword(getPassword);

//		// Send data from controller to view
//		model.addAttribute("userBean", userBean);

		/*
		 * Way 3 : Nothing to write for ModelAttribute. Getting data from view
		 * using @ModelAttribute and Create object of UserBean and Model. Also set data
		 * in bean and send data to view.
		 */

		System.out.println("======getName=======" + userBean.getName());
		System.out.println("======getEmail=======" + userBean.getEmail());
		System.out.println("======getPassword=======" + userBean.getPassword());
		
		/* Validation */
		if (userBean.getName().trim().equals("") || userBean.getEmail().trim().equals("")
				|| userBean.getPassword().trim().equals("")) {
			System.out.println("======isEmpty=======");
			return "redirect:/register";
		} else {
			/* Add user in database */
			int createdUserId = this.userService.createUser(userBean);
			model.addAttribute("CreatedUserID", "User created with id " + createdUserId);

			return "register_success";
		}
	}

}
