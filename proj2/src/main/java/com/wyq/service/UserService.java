package com.wyq.service;

import java.util.List;

import com.wyq.entity.User;

public interface UserService {

	User login(String uname, String pwd);
	
	List<User> findAll();

	void save(User user);
}
