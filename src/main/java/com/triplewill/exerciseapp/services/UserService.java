package com.triplewill.exerciseapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

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

	public void updateUser(Long userId) {
		Optional<User> queryResult=this.repo.findById(userId);
		if (queryResult.isPresent()) {
			User p = queryResult.get();
			p.setExercises(p.getExercises()+1);
			this.repo.save(p);
		} else {
			throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
		}
	}
}
