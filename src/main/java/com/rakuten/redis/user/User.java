package com.rakuten.redis.user;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("users")
public class User implements Serializable{
	
	@Id
	private int user_id;
	
	private String name;
	
	private String mob_number;
	
	private String email;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob_number() {
		return mob_number;
	}

	public void setMob_number(String mob_number) {
		this.mob_number = mob_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(int user_id, String name, String mob_number, String email) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.mob_number = mob_number;
		this.email = email;
	}

	public User() {
		super();
	}

}
