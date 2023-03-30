package com.sesi.animanga.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sesi.animanga.data.dao.UserDao;
import com.sesi.animanga.data.entity.User;
import com.sesi.animanga.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return (List<User>) userDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	
	public User findById(Long id) {	
		return userDao.findById(id).orElse(null);
	}

}
