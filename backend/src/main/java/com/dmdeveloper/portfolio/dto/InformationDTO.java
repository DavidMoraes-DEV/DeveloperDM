package com.dmdeveloper.portfolio.dto;

import java.io.Serializable;
import java.util.Date;

import com.dmdeveloper.portfolio.entities.Information;

public class InformationDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Date birthDate;
	private String genre;
	private String phone;
	private String email;
	private String address;
	private String cep;
	private String city;
	private String state;
	private String cnh;
	
	public InformationDTO () {
	}

	public InformationDTO (Information entity) {
		id = entity.getId();
		name = entity.getName();
		birthDate = entity.getBirthDate();
		genre = entity.getGenre();
		phone = entity.getPhone();
		email = entity.getEmail();
		address = entity.getAddress();
		cep = entity.getCep();
		city = entity.getCity();
		state = entity.getState();
		cnh = entity.getCnh();
	}

	
	public InformationDTO (Long id, String name, Date birthDate, String genre, String phone, String email,
			String address, String cep, String city, String state, String cnh) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.genre = genre;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.cep = cep;
		this.city = city;
		this.state = state;
		this.cnh = cnh;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
}
