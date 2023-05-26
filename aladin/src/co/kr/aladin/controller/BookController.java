package co.kr.aladin.controller;

import co.kr.aladin.model.Book;

public class BookController {
	
	Book book = new Book();
	
	public Book bookEnroll()  {// 도서 상품 등록
		return this.book;
	}
	
	public Book[] bookMenu() {// 도서 목록
		return null;
	}

	public Book bookView() {// 도서 1개 정보 보기
		return this.book;
	}
	
	public boolean bookPurchase() {  // 도서 구매
		return false;
	}
	
	public Book bookUpdate() { // 도서 정보 수정
		return this.book;
	}
	
	public Book bookDelete() { // 도서 정보 삭제 (판매 종료)
		return this.book;
	}

}
