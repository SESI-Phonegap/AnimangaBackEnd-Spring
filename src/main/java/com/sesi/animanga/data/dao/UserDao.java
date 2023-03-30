package com.sesi.animanga.data.dao;

import org.springframework.data.repository.CrudRepository;

import com.sesi.animanga.data.entity.User;

public interface UserDao extends CrudRepository<User, Long> {

}
