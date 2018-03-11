package com.wyq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wyq.entity.User;
import com.wyq.mapper.UserMapper;
import com.wyq.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(String uname, String pwd) {
		
		User result = null;
		User user = userMapper.findByUname(uname);
		if(user != null && user.getPwd().equals(pwd)) {
			result = user;
		}
		return result;
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

	public void save(User user) {
		userMapper.insert(user);
	}
}
