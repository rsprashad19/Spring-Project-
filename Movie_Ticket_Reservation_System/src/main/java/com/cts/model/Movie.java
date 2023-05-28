package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movie_id;
	@Column
	private String title;
	@Column
	private String genre;
	@Column
	private String duration;
	@Column
	private int rating;
	
//	public Movie() {
//	// TODO Auto-generated constructor stub
//	}
//	
//	public Movie(int movie_id, String title, String genre, String duration, int rating) {
//		super();
//		this.movie_id = movie_id;
//		this.title = title;
//		this.genre = genre;
//		this.duration = duration;
//		this.rating = rating;
//	}
//
//	public int getMovie_id() {
//		return movie_id;
//	}
//
//	public void setMovie_id(int movie_id) {
//		this.movie_id = movie_id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getGenre() {
//		return genre;
//	}
//
//	public void setGenre(String genre) {
//		this.genre = genre;
//	}
//
//	public String getDuration() {
//		return duration;
//	}
//
//	public void setDuration(String duration) {
//		this.duration = duration;
//	}
//
//	public int getRating() {
//		return rating;
//	}
//
//	public void setRating(int rating) {
//		this.rating = rating;
//	}
//	
//	
}
