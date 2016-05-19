package com.ventas.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="ventas_user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "profile_id", nullable = false)
	private Integer userId;
	
	@NotNull
	@Size(min=2, max=30)
	@Column(name = "profile_username", nullable = false)
	private String username;
	
	@NotNull
	@Column(name = "profile_email", nullable = false)
	private String email;
	
	@Column(name = "profile_phone", nullable = false)
	private String phone;
	
	@Column(name = "profile_address", nullable = false)
	private String address;
	
	@Column(name = "profile_city", nullable = false)
	private String city;
	
	@Column(name = "profile_state", nullable = false)
	private String state;
	
	@Column(name = "profile_postal_code", nullable = false)
	private String postalCode;
	
	public void User(){
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getUserId() {
		return userId;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String toString(){
		return "User(Username: " + this.username + ", Email: " + this.email +")";
	}
	
	
	

}
