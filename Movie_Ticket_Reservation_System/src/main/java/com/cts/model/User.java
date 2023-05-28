package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@Column
	private String name;
	@Column
	private String mail;
	@Column
	private String password;
	@Column
	private int mobile;
	
//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public User(int user_id, String name, String mail, String password, int mobile) {
//		super();
//		this.user_id = user_id;
//		this.name = name;
//		this.mail = mail;
//		this.password = password;
//		this.mobile = mobile;
//	}
//
//	public int getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
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
//	public String getMail() {
//		return mail;
//	}
//
//	public void setMail(String mail) {
//		this.mail = mail;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public int getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(int mobile) {
//		this.mobile = mobile;
//	}
//
//	@Override
//	public String toString() {
//		return "User [user_id=" + user_id + ", name=" + name + ", mail=" + mail + ", password=" + password + ", mobile="
//				+ mobile + "]";
//	}
//	
//	
	
}
