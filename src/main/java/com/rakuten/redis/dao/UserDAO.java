package com.rakuten.redis.dao;

import java.util.List;

import com.rakuten.redis.user.User;

public interface UserDAO {
	
	void saveUser(User user);
	void deleteUser(int id);
	User findUser(int id);
	List<User> findAllUsers();
}
