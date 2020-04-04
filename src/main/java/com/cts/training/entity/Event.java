package com.cts.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Event {
	@Id
	@Column(name="id")
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="eventname")
	private String eventname;
	@Column(name="description")
	private String description;
	@Column(name="places")
	private String places;
	@Column(name="duration")
	private int duration;
	@Column(name="eventtype")
	private String eventtype;
	@Column(name="maxseats")
	private int maxseats;
	@Column(name="availableseats")
	private int availableseats;
	public Event() {
		
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", eventname=" + eventname + ", description=" + description + ", places=" + places
				+ ", duration=" + duration + ", eventtype=" + eventtype + ", maxseats=" + maxseats + ", availableseats="
				+ availableseats + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlaces() {
		return places;
	}
	public void setPlaces(String places) {
		this.places = places;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public int getMaxseats() {
		return maxseats;
	}
	public void setMaxseats(int maxseats) {
		this.maxseats = maxseats;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	
	

}
