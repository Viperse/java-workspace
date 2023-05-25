package com.kh.step5;

import com.kh.step5.model.Book;

public class Application {

	public static void main(String[] args) {
		
		Book b1 = new Book("HTML+CSS+자바스크립트", 30000, 0.2, "고경희");
		
		Book b2 = new Book();
		
		// Setter
		b2.setTitle("리액트 200제");
		b2.setPrice(25000);
		b2.setDiscountRate(0.1);
		b2.setAuthor("이정열");
		
		System.out.println(b1);
		System.out.println(b2);
		
		// Getter를 이용하여 두 객체가 각각 할인율을 적용한 책 가격을 계산해서 출력
		System.out.println(b1.getTitle() + "의 할인율 적용된 가격 : " + (b1.getPrice() - (b1.getPrice() * b1.getDiscountRate())));
		System.out.println(b2.getTitle() + "의 할인율 적용된 가격 : " + (b2.getPrice() - (b2.getPrice() * b2.getDiscountRate())));
		

	}

}
