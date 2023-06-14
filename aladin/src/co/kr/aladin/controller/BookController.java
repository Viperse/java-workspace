package co.kr.aladin.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import co.kr.aladin.compare.RecommendOrder;
import co.kr.aladin.model.Book;
import co.kr.aladin.model.User;

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
	
	
	public Book bookSearch(String keyword) { // 도서 이름 검색
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				return bookList.get(i);
			}
		}
		return null;
	}
	
	public Book bookGenreView(String genre) { // 도서 장르별 검색
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getGenre().equals(genre)) {
				return bookList.get(i);
			}
		}
		return null;
	}
	
	// 추천 순서로 보기
	public List<Book> bookRecommend() {
		
		Collections.sort(bookList, new RecommendOrder());
		return bookList;
	}
	
	public void bookCartInput(String id, int index) { // 장바구니 넣기	
		
		uc.userMap.get(id).getBookcart().add(bookList.get(index));
	}
	
	public boolean bookPurchase(String id, int index) {  // 도서 구매
		
		if(uc.userMap.get(id).getCash() >= bookList.get(index).getSalePrice()) {
			return true;
		}
		return false;
	}
	
	public void bookUpdate(int index, Book book) { // 도서 정보 수정
		bookList.set(index, book);
	}
	
	public void bookDelete(int index) { // 도서 정보 삭제 (판매 종료)
		bookList.remove(index);
	}

}
