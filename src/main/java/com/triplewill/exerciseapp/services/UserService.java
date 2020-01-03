package com.triplewill.exerciseapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triplewill.exerciseapp.repositories.UserRepositoryImpl;
import com.triplewill.model.User;

@Service
public class UserService {

	@Autowired
	UserRepositoryImpl repo;
	
	public List<User> getAllUsers(){
		List<User> result = new ArrayList<User>();
		Iterable<User> iter = this.repo.findAll();
		iter.forEach(result::add);
		return result;
	}

	public void updateUser(String body) {
		List<User> queryResult = this.repo.findById(body);
		if (!queryResult.isEmpty()) {
			User p = queryResult.get(0);
			p.setExercises(p.getExercises()+1);
			this.repo.updateUser(p);
		}
	}
}
