package com.sesi.animanga.service;

import java.util.List;

import com.sesi.animanga.data.entity.User;

public interface UserService {
	
	public List<User> findAll();
	public User findById(Long id);

}
