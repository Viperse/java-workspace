package co.kr.aladin.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class User {
	
	private String email;
	private String password;
	private String name;
	LocalDate birth;
	private String number;
	private int cash;
	private List<Book> bookcart;
	
	
	public User() {}


	public User(String email, String password, String name, LocalDate birth, String number, int cash,
			List<Book> bookcart) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.number = number;
		this.cash = cash;
		this.bookcart = bookcart;
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


	public LocalDate getBirth() {
		return birth;
	}


	public void setBirth(LocalDate birth) {
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


	public List<Book> getBookcart() {
		return bookcart;
	}


	public void setBookcart(List<Book> bookcart) {
		this.bookcart = bookcart;
	}


	@Override
	public int hashCode() {
		return Objects.hash(birth, bookcart, cash, email, name, number, password);
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
		return Objects.equals(birth, other.birth) && Objects.equals(bookcart, other.bookcart) && cash == other.cash
				&& Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(number, other.number) && Objects.equals(password, other.password);
	}


	@Override
	public String toString() {
		return "회원 정보 [email=" + email + ", password=" + password + ", name=" + name + ", birth=" + birth + ", number="
				+ number + ", cash=" + cash + ", bookcart=" + bookcart + "]";
	}


}
