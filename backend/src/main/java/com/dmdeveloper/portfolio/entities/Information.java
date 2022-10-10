package com.dmdeveloper.portfolio.entities;

import java.util.Date;
import java.util.Objects;

public class Information {
	
	private Long id;
	private String name;
	private Date birthDate;
	private Integer age;
	private String genre;
	private String phone;
	private String email;
	private String address;
	private String cep;
	private String city;
	private String state;
	private String cnh;
	
	public Information () {
	}

	public Information(Long id, String name, Date birthDate, Integer age, String genre, String phone, String email,
			String address, String cep, String city, String state, String cnh) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.age = age;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Information other = (Information) obj;
		return Objects.equals(id, other.id);
	}
	
}
