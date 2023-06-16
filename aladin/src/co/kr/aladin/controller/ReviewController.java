package co.kr.aladin.controller;

import java.util.ArrayList;
import java.util.List;

import co.kr.aladin.model.Book;
import co.kr.aladin.model.Review;
import co.kr.aladin.model.User;

public class ReviewController {
	
	UserController uc = new UserController();
	BookController bc = new BookController();
	
	// 리뷰 작성
	public void reviewWrite(Book book, Review review) {
		if(book.getReview() == null) {
			book.setReview(new ArrayList<>());
		}
		book.getReview().add(review);
		
		// 추천 수 반영하기
		if(review.isRecommend()) {
			book.setRecomCount(book.getRecomCount()+1);
		}
	}
	
	// 리뷰 1개 보기
	public Review viewReview(Book book, int index) {
		return book.getReview().get(index);
	}
	
	
	// 리뷰 전체 보기
	public List<Review> viewReviewAll(Book book) {
		
		// 여기도 그냥 리턴 때리면 추가 안 돼서 리스트 하나 더 생성
		List<Review> reviewList = new ArrayList<>();
		
		for(int i=0; i<book.getReview().size(); i++) {
			reviewList.add(book.getReview().get(i));			
		} return reviewList;
	}
	
	// 로그인한 사람과 리뷰 작성자가 같을 때 리뷰 수정하기
	public void updateReview(Book book, String id, int index, Review review) {
		if(book.getReview().get(index).getId().equals(id)) {
			book.getReview().set(index, review);
		}
	}
	// 로그인한 사람과 리뷰 작성자가 같을 때 리뷰 삭제하기
	public void deleteReview(String id, Book book, int index) {
		if(book.getReview().get(index).getId().equals(id)) {
			book.getReview().remove(index);
		}
	}

}
