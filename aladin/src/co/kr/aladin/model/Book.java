package co.kr.aladin.model;

public class Book {
	
	public String title;
	public String author;
	public String comment;
	public int oriPrice;
	public int salePrice;
	public String bookimgUrl;
	public String preimgUrl;
	
	public Book bookEnroll()  {// 도서 상품 등록
		return null;
	}
	
	public Book[] bookMenu() {// 도서 목록
		return null;
	}

	public Book bookView() {// 도서 1개 정보 보기
		return null;
	}
	
	public boolean bookPurchase() {  // 도서 구매
		return false;
	}
	
	public Book bookUpdate() { // 도서 정보 수정
		return null;
	}
	
	public Book bookDelete() { // 도서 정보 삭제 (판매 종료)
		return null;
	}

}
