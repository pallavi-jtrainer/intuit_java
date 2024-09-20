package com.springpeople.SpringBootAsyncDemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

	private String title;
	private String producer;
	private String director;
	
	public Movie() {}

	public Movie(String title, String producer, String director) {
		this.title = title;
		this.producer = producer;
		this.director = director;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Movie: [ Title: " + title + ", Producer: " + producer 
				+ ", Director: " + director +" ]";
	}
}
