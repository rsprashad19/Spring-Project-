package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Showtime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int showtime_id;
	@Column
	private String s_time;
	@Column
	private int seats_available;
	
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name = "theater_id")
	private Theater theater;

//	public Showtime() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Showtime(int showtime_id, String s_time, int seats_available, Movie movie, Theater theater) {
//		super();
//		this.showtime_id = showtime_id;
//		this.s_time = s_time;
//		this.seats_available = seats_available;
//		this.movie = movie;
//		this.theater = theater;
//	}
//
//	public int getShowtime_id() {
//		return showtime_id;
//	}
//
//	public void setShowtime_id(int showtime_id) {
//		this.showtime_id = showtime_id;
//	}
//
//	public String getS_time() {
//		return s_time;
//	}
//
//	public void setS_time(String s_time) {
//		this.s_time = s_time;
//	}
//
//	public int getSeats_available() {
//		return seats_available;
//	}
//
//	public void setSeats_available(int seats_available) {
//		this.seats_available = seats_available;
//	}
//
//	public Movie getMovie() {
//		return movie;
//	}
//
//	public void setMovie(Movie movie) {
//		this.movie = movie;
//	}
//
//	public Theater getTheater() {
//		return theater;
//	}
//
//	public void setTheater(Theater theater) {
//		this.theater = theater;
//	}
//
//	@Override
//	public String toString() {
//		return "Showtime [showtime_id=" + showtime_id + ", s_time=" + s_time + ", seats_available=" + seats_available
//				+ ", movie=" + movie + ", theater=" + theater + "]";
//	}
//	
	
}
