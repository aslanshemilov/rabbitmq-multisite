package io.pivotal.rabbitmq.multisite.producer;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
	private final String id;
	private final LocalDateTime timestamp;
	private final String source;
	private final String message;
	private final long eventNumber;

	@JsonCreator
	public Event(@JsonProperty("id") String id, @JsonProperty("timestamp") LocalDateTime timestamp,
			@JsonProperty("source") String source, @JsonProperty("message") String message,
			@JsonProperty("eventNumber") long eventNumber) {
		this.id = id;
		this.timestamp = timestamp;
		this.source = source;
		this.message = message;
		this.eventNumber = eventNumber;
	}

	public String getId() {
		return id;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getSource() {
		return source;
	}

	public String getMessage() {
		return message;
	}

	public long getEventNumber() {
		return eventNumber;
	}
}
