package com.yuzhou.service;

import com.yuzhou.model.User;

public interface UserService {
	
	User createUser(String firstName,String lastName,int age);
	
	User queryUser();
}
