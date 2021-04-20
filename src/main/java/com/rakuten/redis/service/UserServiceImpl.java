package com.rakuten.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.redis.dao.UserDAO;
import com.rakuten.redis.user.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDao;

	@Override
	public void createUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAllUsers();
	}

	@Override
	public User findById(int id) {
		return userDao.findUser(id);
	}

}
