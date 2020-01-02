package com.triplewill.exerciseapp.repositories;

import java.util.List;

import com.triplewill.model.User;

public interface UserRepository {

	List<User> findAll();
	
	List<User> findById(String id);

	void updateUser(User user);
	
}
