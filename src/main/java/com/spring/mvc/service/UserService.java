package com.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.bean.UserBean;
import com.spring.mvc.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	/*Create User*/
	public int createUser(UserBean userBean) {
		return this.userDao.saveUser(userBean);
	}
}
