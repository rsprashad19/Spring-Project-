package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.ReservationRepository;
import com.cts.model.Reservation;


@Service
public abstract class ReservationService_Impl{
	@Autowired
	ReservationRepository reservationRepo;
	
	public Reservation createReservation(Reservation reservation){
		return reservationRepo.save(reservation);
	}
	
	Reservation getReservationById(Integer reservation_id) {
		Reservation rn = reservationRepo.findById(reservation_id).orElse(null);
		return rn;
	}
	
	List<Reservation> getAllReservations(){
		List<Reservation> rnList = reservationRepo.findAll();
		return rnList;
	}
	
	public Reservation getReservationByUid(Integer user_id){
		Reservation rn = reservationRepo.getReservationUid(user_id);
		return rn;
	}
	
	public Reservation getReservationBySid(Integer showtime_id){
		Reservation rn = reservationRepo.getReservationSid(showtime_id);
		return rn;
	}

}
