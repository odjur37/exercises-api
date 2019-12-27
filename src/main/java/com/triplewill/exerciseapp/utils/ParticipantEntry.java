package com.triplewill.exerciseapp.utils;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("participant_by_id")
public class ParticipantEntry {
	
	@PrimaryKey
	private UUID id;
	@Column
	private int exercises;
	@Column
	private String name;
	
	public ParticipantEntry(UUID id, int exercises, String name) {
		super();
		this.id = id;
		this.exercises = exercises;
		this.name = name;
	}
	
}
