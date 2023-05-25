package co.kr.aladin.model;

public class Category {
	
	private String home;
	private String korBook;
	private String forBook;
	private String eBook;
	private String Goods;
	private String usedBook;
	
	public Category() {}

	public Category(String home, String korBook, String forBook, String eBook, String goods, String usedBook) {
		this.home = home;
		this.korBook = korBook;
		this.forBook = forBook;
		this.eBook = eBook;
		Goods = goods;
		this.usedBook = usedBook;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getKorBook() {
		return korBook;
	}

	public void setKorBook(String korBook) {
		this.korBook = korBook;
	}

	public String getForBook() {
		return forBook;
	}

	public void setForBook(String forBook) {
		this.forBook = forBook;
	}

	public String geteBook() {
		return eBook;
	}

	public void seteBook(String eBook) {
		this.eBook = eBook;
	}

	public String getGoods() {
		return Goods;
	}

	public void setGoods(String goods) {
		Goods = goods;
	}

	public String getUsedBook() {
		return usedBook;
	}

	public void setUsedBook(String usedBook) {
		this.usedBook = usedBook;
	}

	@Override
	public String toString() {
		return "Category [home=" + home + ", korBook=" + korBook + ", forBook=" + forBook + ", eBook=" + eBook
				+ ", Goods=" + Goods + ", usedBook=" + usedBook + "]";
	}
		
}
