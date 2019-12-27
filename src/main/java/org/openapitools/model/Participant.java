package org.openapitools.model;

import java.util.Objects;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Participant
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-23T15:52:17.070+01:00[Europe/Stockholm]")
@Table("participants_by_id")
public class Participant {
	@JsonProperty("id")
	@PrimaryKey
	private UUID id;
	@Column
	@JsonProperty("exercises")
	private Integer exercises;
	@Column
	@JsonProperty("name")
	private String name;

	public Participant id(UUID id) {
		this.id = id;
		return this;
	}

	public Participant id(UUID id, Integer exercises, String name) {
		this.id = id;
		this.exercises = exercises;
		this.name = name;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 */
	@ApiModelProperty(value = "")

	@Valid

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Participant exercises(Integer exercises) {
		this.exercises = exercises;
		return this;
	}

	/**
	 * Get exercises
	 * 
	 * @return exercises
	 */
	@ApiModelProperty(value = "")

	public Integer getExercises() {
		return exercises;
	}

	public void setExercises(Integer exercises) {
		this.exercises = exercises;
	}

	public Participant name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 */
	@ApiModelProperty(value = "")

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
		Participant participant = (Participant) o;
		return Objects.equals(this.id, participant.id) && Objects.equals(this.exercises, participant.exercises)
				&& Objects.equals(this.name, participant.name);
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
