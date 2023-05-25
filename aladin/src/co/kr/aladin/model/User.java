package co.kr.aladin.model;

import java.sql.Date;
import java.util.Scanner;

public class User {
	
	private String id;
	private String email;
	private String password;
	private String name;
	private Date birth;
	private String number;
	
	
	public User() {}


	public User(String id, String email, String password, String name, Date birth, String number) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.number = number;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirth() {
		return birth;
	}


	public void setBirth(Date birth) {
		this.birth = birth;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", birth=" + birth
				+ ", number=" + number + "]";
	}
			
	
}
