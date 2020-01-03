package com.triplewill.exerciseapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triplewill.exerciseapp.repositories.UserRepositoryImpl;
import com.triplewill.model.User;

@Service
public class UserService {

	@Autowired
	UserRepositoryImpl repo;
	
	public User createUser(User user) {
		return this.repo.save(user);
	}
	
	public List<User> getAllUsers(){
		return this.repo.findAll();
	}

	public void updateUser(String body) {
		System.err.println("Before execution: " + body);
		Optional<User> queryResult=this.repo.findById(body);
		if (queryResult.isPresent()) {
			System.err.println("AT LAST INSIDE!!!");
			User p = queryResult.get();
			p.setExercises(p.getExercises()+1);
			this.repo.save(p);
		}
	}
}
