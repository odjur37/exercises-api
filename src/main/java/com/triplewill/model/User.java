package com.triplewill.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3956062026320724250L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	
	private Integer exercises;
	
	private String username;

	public User id(Long id) {
		this.userId = id;
		return this;
	}

	public User id(Long id, Integer exercises, String name) {
		this.userId = id;
		this.exercises = exercises;
		this.username = name;
		return this;
	}

	public Long getId() {
		return userId;
	}

	public void setId(Long id) {
		this.userId = id;
	}

	public User exercises(Integer exercises) {
		this.exercises = exercises;
		return this;
	}

	public Integer getExercises() {
		return exercises;
	}

	public void setExercises(Integer exercises) {
		this.exercises = exercises;
	}

	public User name(String name) {
		this.username = name;
		return this;
	}

	public String getName() {
		return username;
	}

	public void setName(String name) {
		this.username = name;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(this.userId, user.userId) && Objects.equals(this.exercises, user.exercises)
				&& Objects.equals(this.username, user.username);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, exercises, username);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Participant {\n");

		sb.append("    id: ").append(toIndentedString(userId)).append("\n");
		sb.append("    exercises: ").append(toIndentedString(exercises)).append("\n");
		sb.append("    name: ").append(toIndentedString(username)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
