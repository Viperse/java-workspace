package co.kr.aladin.controller;

import co.kr.aladin.model.Book;

public interface BookControllerImpl {
	
	public Book bookEnroll();	
	public Book[] bookMenu();
	public Book bookView();	
	public boolean bookPurchase();	
	public Book bookUpdate();
	public Book bookDelete();


}
