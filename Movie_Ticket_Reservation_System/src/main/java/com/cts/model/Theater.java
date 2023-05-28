package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Theater {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theater_id;
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private int phone_no;
//	
//	public Theater() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Theater(int theater_id, String name, String location, int phone_no) {
//		super();
//		this.theater_id = theater_id;
//		this.name = name;
//		this.location = location;
//		this.phone_no = phone_no;
//	}
//
//	public int getTheater_id() {
//		return theater_id;
//	}
//
//	public void setTheater_id(int theater_id) {
//		this.theater_id = theater_id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	public int getPhone_no() {
//		return phone_no;
//	}
//
//	public void setPhone_no(int phone_no) {
//		this.phone_no = phone_no;
//	}
//
//	@Override
//	public String toString() {
//		return "theater [theater_id=" + theater_id + ", name=" + name + ", location=" + location + ", phone_no="
//				+ phone_no + "]";
//	}
	
	
	
}
