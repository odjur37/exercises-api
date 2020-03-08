package com.triplewill.exerciseapp.repositories;

import com.triplewill.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryImpl extends JpaRepository<User, Long>{

}
