package com.triplewill.exerciseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triplewill.model.User;

@Repository
public interface UserRepositoryImpl extends JpaRepository<User, Long>{

}
