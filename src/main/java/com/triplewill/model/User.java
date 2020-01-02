package com.triplewill.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "users")
public class User {
	@JsonProperty("userId")
	@Id
	private String id;
	
	@JsonProperty("exercises")
	private Integer exercises;
	
	@JsonProperty("username")
	private String name;

	public User id(String id) {
		this.id = id;
		return this;
	}

	public User id(String id, Integer exercises, String name) {
		this.id = id;
		this.exercises = exercises;
		this.name = name;
		return this;
	}

	@Valid
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return Objects.equals(this.id, user.id) && Objects.equals(this.exercises, user.exercises)
				&& Objects.equals(this.name, user.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, exercises, name);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Participant {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    exercises: ").append(toIndentedString(exercises)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
