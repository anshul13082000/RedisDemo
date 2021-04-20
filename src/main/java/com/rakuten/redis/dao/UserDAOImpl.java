package com.rakuten.redis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.rakuten.redis.user.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private RedisTemplate template;
	
	private static final Object HASH_KEY = "User";

	@Override
	public void saveUser(User user) {
		template.opsForHash().put(HASH_KEY, user.getUser_id(), user);
	}

	@Override
	public void deleteUser(int id) {
		template.opsForHash().delete(HASH_KEY, id);
		
	}

	@Override
	public User findUser(int id) {
		return (User) template.opsForHash().get(HASH_KEY, id);
	}

	@Override
	public List<User> findAllUsers() {
		return template.opsForHash().values(HASH_KEY);
	}

}
