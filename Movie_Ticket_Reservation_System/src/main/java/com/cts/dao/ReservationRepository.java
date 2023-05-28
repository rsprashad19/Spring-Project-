package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	@Query(value = "select * from reservation where user_id=:user_id", nativeQuery = true)
	public Reservation getReservationUid(Integer user_id);
	
	@Query(value = "select * from reservation where showtime_id=:showtime_id", nativeQuery = true)
	public Reservation getReservationSid(Integer showtime_id);
}
