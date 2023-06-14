package co.kr.aladin.controller;

import java.util.ArrayList;
import java.util.List;

import co.kr.aladin.model.Review;

public class ReviewController {
	
	List<Review> reviewList = new ArrayList<>();
	UserController uc = new UserController();
	BookController bc = new BookController();
	
	// 아이디가 있는 사람만 리뷰 작성
	public boolean reviewWrite(String id, int index, Review review) {
		if(uc.userMap.containsKey(id)) {
			bc.bookList.get(index).getReview().add(review);
			return true;
		}
		return false;
	}
	// 리뷰 1개 보기
	public void viewReview(int index1, int index2) {
		bc.bookList.get(index1).getReview().get(index2);
	}
	
	// 리뷰 전체 보기
	public void viewReviewAll(int index) {
		
		for(int i=0; i<bc.bookList.get(index).getReview().size(); i++) {
			bc.bookList.get(index).getReview().get(i);
		}
	}
	
	// 로그인한 사람과 리뷰 작성자가 같을 때 리뷰 수정하기
	public void updateReview(String id, String password, int index1, int index2, Review review) {
		if(bc.bookList.get(index1).getReview().get(index2).getId().equals(id)) {
			bc.bookList.get(index1).getReview().set(index2, review);
		}
	}
	// 로그인한 사람과 리뷰 작성자가 같을 때 리뷰 삭제하기
	public void deleteReview() {
		
	}

}
