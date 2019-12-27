package com.triplewill.exerciseapp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.openapitools.model.SqlUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triplewill.exerciseapp.repositories.SqlRepo;

@Service
public class UserService {

	@Autowired
	SqlRepo repo;
	
	public SqlUser addUser(SqlUser user) {
		if (user.getId() == null) {
			user.setId(UUID.randomUUID());
		}
		return this.repo.save(user);
	}
	
	public List<SqlUser> getAllUsers(){
		List<SqlUser> result = new ArrayList<SqlUser>();
		Iterable<SqlUser> iter = this.repo.findAll();
		iter.forEach(result::add);
		return result;
	}

	public void updateUser(@Valid UUID body) {
		Optional<SqlUser> queryResult = this.repo.findById(body);
		if (queryResult.isPresent()) {
			SqlUser p = queryResult.get();
			p.setExercises(p.getExercises()+1);
			this.repo.save(p);
		}
	}
}
