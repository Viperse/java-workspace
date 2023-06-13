package co.kr.aladin.model;

import java.sql.Date;
import java.util.Objects;

public class User {
	
	private String id;
	private String email;
	private String password;
	private String name;
	private Date birth;
	private String number;
	private int cash;
	private Book book;
	
	
	public User() {}


	public User(String id, String email, String password, String name, Date birth, String number, int cash, Book book) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.number = number;
		this.cash = cash;
		this.book = book;
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


	public int getCash() {
		return cash;
	}


	public void setCash(int cash) {
		this.cash = cash;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	@Override
	public int hashCode() {
		return Objects.hash(birth, book, cash, email, id, name, number, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(birth, other.birth) && Objects.equals(book, other.book) && cash == other.cash
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(number, other.number)
				&& Objects.equals(password, other.password);
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", birth=" + birth
				+ ", number=" + number + ", cash=" + cash + ", book=" + book + "]";
	}
	
	
}
