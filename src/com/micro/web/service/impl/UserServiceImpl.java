package com.micro.web.service.impl;

import java.util.Date;

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
		user.setInsertTime(new Date());
		user.setUsertype(1);//默认为1，一般用户
		userDAO.insert(user);
	}

	@Override
	public User findUser(User user) {
		user = userDAO.selectByUserName(user.getUsername(),user.getPassword());
		return user;
	}
	
}
