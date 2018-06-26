package com.yuzhou.service.impl;

import com.yuzhou.model.User;
import com.yuzhou.service.UserService;

public class UserServiceImpl implements UserService {

	private static User user = new User();
	
	@Override
	public User createUser(String firstName, String lastName, int age) {
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		return user;
	}

	@Override
	public User queryUser() {
		return user;
	}

}
