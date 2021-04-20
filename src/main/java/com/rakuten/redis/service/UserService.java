package com.rakuten.redis.service;

import java.util.List;

import com.rakuten.redis.user.User;

public interface UserService {
	
	void createUser(User user);
	void deleteUser(int id);
	List<User> findAll();
	User findById(int id);
}
