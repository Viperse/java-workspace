package co.kr.aladin.model;

import java.util.Objects;

public class Book {
	
	private String title;
	private String bookcode;
	private String author;
	private String comment;
	private int oriPrice;
	private int salePrice;
	private String bookimgUrl;
	private String preimgUrl;
	
	public Book() {}

	public Book(String title, String bookcode, String author, String comment, int oriPrice, int salePrice,
			String bookimgUrl, String preimgUrl) {
		this.title = title;
		this.bookcode = bookcode;
		this.author = author;
		this.comment = comment;
		this.oriPrice = oriPrice;
		this.salePrice = salePrice;
		this.bookimgUrl = bookimgUrl;
		this.preimgUrl = preimgUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookcode() {
		return bookcode;
	}

	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getOriPrice() {
		return oriPrice;
	}

	public void setOriPrice(int oriPrice) {
		this.oriPrice = oriPrice;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public String getBookimgUrl() {
		return bookimgUrl;
	}

	public void setBookimgUrl(String bookimgUrl) {
		this.bookimgUrl = bookimgUrl;
	}

	public String getPreimgUrl() {
		return preimgUrl;
	}

	public void setPreimgUrl(String preimgUrl) {
		this.preimgUrl = preimgUrl;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", bookcode=" + bookcode + ", author=" + author + ", comment=" + comment
				+ ", oriPrice=" + oriPrice + ", salePrice=" + salePrice + ", bookimgUrl=" + bookimgUrl + ", preimgUrl="
				+ preimgUrl + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookcode, bookimgUrl, comment, oriPrice, preimgUrl, salePrice, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(bookcode, other.bookcode)
				&& Objects.equals(bookimgUrl, other.bookimgUrl) && Objects.equals(comment, other.comment)
				&& oriPrice == other.oriPrice && Objects.equals(preimgUrl, other.preimgUrl)
				&& salePrice == other.salePrice && Objects.equals(title, other.title);
	}
}
