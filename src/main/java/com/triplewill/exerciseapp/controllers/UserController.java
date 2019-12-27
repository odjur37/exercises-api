package com.triplewill.exerciseapp.controllers;


import java.util.List;
import java.util.UUID;

import org.openapitools.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.triplewill.exerciseapp.services.UserService;
import com.triplewill.model.SqlUser;

//@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
public class UserController implements UserApi{
	
	@Autowired
	UserService service;

	@Override
	public ResponseEntity<SqlUser> addUser(SqlUser user) {
		SqlUser p = service.addUser(user);
		return new ResponseEntity<SqlUser>(p, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<SqlUser>> getUsers() {
		List<SqlUser> myList = this.service.getAllUsers();
		
		return new ResponseEntity<List<SqlUser>>(myList, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> updateUser(UUID body) {
		this.service.updateUser(body);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
