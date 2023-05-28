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
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservation_id;
	@Column
	private int seats_booked;
	@Column
	private int reservation_time;
	
	@ManyToOne
	@JoinColumn(name = "showtime_id")
	private Showtime showtime;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

//	public Reservation() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Reservation(int reservation_id, int seats_booked, int reservation_time, Showtime showtime, User user) {
//		super();
//		this.reservation_id = reservation_id;
//		this.seats_booked = seats_booked;
//		this.reservation_time = reservation_time;
//		this.showtime = showtime;
//		this.user = user;
//	}
//
//	public int getReservation_id() {
//		return reservation_id;
//	}
//
//	public void setReservation_id(int reservation_id) {
//		this.reservation_id = reservation_id;
//	}
//
//	public int getSeats_booked() {
//		return seats_booked;
//	}
//
//	public void setSeats_booked(int seats_booked) {
//		this.seats_booked = seats_booked;
//	}
//
//	public int getReservation_time() {
//		return reservation_time;
//	}
//
//	public void setReservation_time(int reservation_time) {
//		this.reservation_time = reservation_time;
//	}
//
//	public Showtime getShowtime() {
//		return showtime;
//	}
//
//	public void setShowtime(Showtime showtime) {
//		this.showtime = showtime;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	@Override
//	public String toString() {
//		return "Reservation [reservation_id=" + reservation_id + ", seats_booked=" + seats_booked
//				+ ", reservation_time=" + reservation_time + ", showtime=" + showtime + ", user=" + user + "]";
//	}
//	
//	

}
