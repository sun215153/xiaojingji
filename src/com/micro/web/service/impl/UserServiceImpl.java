package com.micro.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.web.dao.UserDAO;
import com.micro.web.entities.User;
import com.micro.web.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserDAO userDAO;

	@Override
	public void addUser(User user) {
		userDAO.insert(user);
	}
	
}
