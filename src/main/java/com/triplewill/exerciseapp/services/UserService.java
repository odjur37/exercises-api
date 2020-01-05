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
	UserRepositoryImpl userRepo;
	
	public User createUser(User user) {
		return this.userRepo.save(user);
	}
	
	public List<User> getAllUsers(){
		return this.userRepo.findAll();
	}
	
	public void updateUserDates(Long id, String[] dates) {
		User user = queryUser(id);
		if (user != null) {
			user.setDates(dates);
			this.userRepo.save(user);
		}
	}
	
	private User queryUser(Long id){
		Optional<User> queryResult=this.userRepo.findById(id);
		if (queryResult.isPresent()) {
			return queryResult.get();
		}
		return null;
	}
	
}
