package org.openapitools.model;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class SqlUser {
	@JsonProperty("id")
	@Id
	private UUID id;
	
	@JsonProperty("exercises")
	private Integer exercises;
	
	@JsonProperty("name")
	private String name;

	public SqlUser id(UUID id) {
		this.id = id;
		return this;
	}

	public SqlUser id(UUID id, Integer exercises, String name) {
		this.id = id;
		this.exercises = exercises;
		this.name = name;
		return this;
	}

	@Valid
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public SqlUser exercises(Integer exercises) {
		this.exercises = exercises;
		return this;
	}

	public Integer getExercises() {
		return exercises;
	}

	public void setExercises(Integer exercises) {
		this.exercises = exercises;
	}

	public SqlUser name(String name) {
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
		SqlUser user = (SqlUser) o;
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
