package com.triplewill.exerciseapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.triplewill.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getString("userId"));
		user.setExercises(Integer.parseInt(rs.getString("exercises")));
		user.setName(rs.getString("username"));
		return user;
	}

}
