package com.triplewill.exerciseapp.repositories;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.triplewill.exerciseapp.mapper.UserRowMapper;
import com.triplewill.model.User;

public class UserRepositoryImpl implements UserRepository{

	private NamedParameterJdbcTemplate template;
	
	public UserRepositoryImpl(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<User> findById(String id) {
		return template.query("SELECT * FROM users WHERE userId="+id, new UserRowMapper());
	}
	
	@Override
	public List<User> findAll() {
		return template.query("SELECT * FROM users", new UserRowMapper());
	}

	@Override
	public void updateUser(User user) {
	 
		final String sql = "update users set exercises=:exercises where userId=:userId";
	        KeyHolder holder = new GeneratedKeyHolder();
	        SqlParameterSource param = new MapSqlParameterSource()
	        		.addValue("userId", user.getId())
	        		.addValue("exercises", user.getExercises());
	        template.update(sql,param, holder);
	}

}
