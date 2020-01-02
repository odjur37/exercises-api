package com.triplewill.exerciseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triplewill.model.SqlUser;

@Repository
public interface SqlRepo extends JpaRepository<SqlUser, String>{
	
}
