package com.triplewill.exerciseapp.repositories;

import java.util.UUID;

import org.openapitools.model.SqlUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlRepo extends CrudRepository<SqlUser, UUID>{
	
}
