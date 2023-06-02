package co.kr.aladin.controller;

import co.kr.aladin.model.Book;

public class BookController {
	
	UserController uc = null;
	Book[] bookList = new Book[10];
	Book[] bookcart = new Book[3];
	int index = 0;
	int index2 = 0;
	
	public void bookEnroll(Book book)  {// 도서 상품 등록
		bookList[index++] = book;
	}
	
	public Book[] bookMenu() {// 도서 목록
		return bookList;
	}

	public Book bookView(int index) { // 도서 1개 정보 보기
		return bookList[index];
	}
	
	public Book[] bookListInput(int index) { // 장바구니 넣기
		bookList[index] = bookcart[index2];
		index2++;
		
		return bookcart;
	}
	public boolean bookPurchase() {  // 도서 구매
		return false;
	}
	
	public void bookUpdate(int index, Book book) { // 도서 정보 수정
		bookList[index] = book;
	}
	
	public boolean bookDelete() { // 도서 정보 삭제 (판매 종료)
		return false;
	}

}
