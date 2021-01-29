package com.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.bean.UserBean;

@Repository
public class UserDao {

	@Autowired // inject by spring
	private HibernateTemplate hibernateTemplate;

	@Transactional // For turn on writing mode
	public int saveUser(UserBean userBean) {
		int id = (int) this.hibernateTemplate.save(userBean);
		
		return id;
	}
}
