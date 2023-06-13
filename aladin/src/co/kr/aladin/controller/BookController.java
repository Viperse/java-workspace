package co.kr.aladin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.kr.aladin.model.Book;

public class BookController {
	
	 List<Book> bookList = new ArrayList<>();
	 UserController uc = new UserController();
	
	public void bookEnroll(Book book)  { // 도서 상품 등록
		bookList.add(book);
	}
	
	public List<Book> bookMenu() { // 도서 목록
		return bookList;
	}

	public Book bookView(int index) { // 도서 1개 정보 보기
		return bookList.get(index);
	}
	
	// 도서 검색
	public Book bookSearch(String keyword) {
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				return bookList.get(i);
			}
		}
		return null;
	}
	
	public void bookCartInput(int index) { // 장바구니 넣기
				
		bookList.get(index);
	}
	public boolean bookPurchase() {  // 도서 구매
		
		uc
		
		return false;
	}
	
	public void bookUpdate(int index, Book book) { // 도서 정보 수정
		bookList.set(index, book);
	}
	
	public void bookDelete(int index) { // 도서 정보 삭제 (판매 종료)
		bookList.remove(index);
	}

}
