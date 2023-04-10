package com.sesi.animanga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.animanga.data.entity.User;
import com.sesi.animanga.service.UserService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class UserController {
	
	@Autowired
	private CircuitBreakerFactory cbFactory;
	
	@Autowired
	private UserService service;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.findAll();
	}
	
	@CircuitBreaker(name = "user", fallbackMethod = "alternative")
	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable Long id) {
		return cbFactory.create("user").run(() -> service.findById(id), e -> alternative(id));
	}
	
	
	public User alternative(Long id) {
		User user = new User();
		user.setName("Usuario Alternativo");
		return user;
	}
	
}
