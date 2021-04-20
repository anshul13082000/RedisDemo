package com.rakuten.redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.redis.service.UserService;
import com.rakuten.redis.user.User;

@RestController
@EnableCaching
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public void addNewUser(@RequestBody User user) {
		userService.createUser(user);
	}
	
	@GetMapping("/users")
	public List<User> findAllCustomers() {
		return userService.findAll();
	}
	
	@DeleteMapping("/users/{idPathVariable}")
	public void deleteUser(@PathVariable("idPathVariable") int id) {
		userService.deleteUser(id);
	}
	
	@GetMapping("/users/{idPathVariable}")
	public User findUserById(@PathVariable("idPathVariable") int id) {
		return userService.findById(id);
	}
}
