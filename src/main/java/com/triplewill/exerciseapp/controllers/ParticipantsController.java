package com.triplewill.exerciseapp.controllers;


import java.util.List;
import java.util.UUID;

import org.openapitools.api.ParticipantsApi;
import org.openapitools.model.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.triplewill.exerciseapp.services.ParticipantService;

@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
//@RestController
public class ParticipantsController implements ParticipantsApi{
	
	@Autowired
	ParticipantService service;

	@Override
	public ResponseEntity<Participant> addParticipant(Participant participant) {
		Participant p = service.addParticipant(participant);
		return new ResponseEntity<Participant>(p, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<List<Participant>> getParticipants() {
		List<Participant> myList = this.service.getAllParticipants();
		
		return new ResponseEntity<List<Participant>>(myList, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> updateParticipant(UUID body) {
		this.service.updateEntry(body);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
}
