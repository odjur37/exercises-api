package com.triplewill.exerciseapp.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.openapitools.model.Participant;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraRepo extends CassandraRepository<Participant, UUID>{

	@Override
	<S extends Participant> S save(S entity);
	
	@Override
	Optional<Participant> findById(UUID id);
	
	@Override
	List<Participant> findAll();
	
}
