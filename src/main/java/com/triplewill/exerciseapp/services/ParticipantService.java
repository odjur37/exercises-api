package com.triplewill.exerciseapp.services;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.openapitools.model.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triplewill.exerciseapp.repositories.CassandraRepo;

@Service
public class ParticipantService {

	@Autowired
	CassandraRepo repo;
	
	public Participant addParticipant(Participant user) {
		if (user.getId() == null) {
			user.setId(UUID.randomUUID());
		}
		return this.repo.save(user);
	}
	
	public List<Participant> getAllParticipants(){
//		return this.repo.findAll();
		return null;
	}

	public void updateEntry(@Valid UUID body) {
//		Optional<Participant> queryResult = this.repo.findById(body);
//		if (queryResult.isPresent()) {
//			Participant p = queryResult.get();
//			p.setExercises(p.getExercises()+1);
//			this.repo.save(p);
//		}
	}
}
