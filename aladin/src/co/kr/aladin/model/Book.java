package co.kr.aladin.model;

public class Book {
	
	private String title;
	private String author;
	private String comment;
	private int oriPrice;
	private int salePrice;
	private String bookimgUrl;
	private String preimgUrl;
	
	public Book() {}

	public Book(String title, String author, String comment, int oriPrice, int salePrice, String bookimgUrl,
			String preimgUrl) {
		this.title = title;
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
		return "Book [title=" + title + ", author=" + author + ", comment=" + comment + ", oriPrice=" + oriPrice
				+ ", salePrice=" + salePrice + ", bookimgUrl=" + bookimgUrl + ", preimgUrl=" + preimgUrl + "]";
	}
		

}
