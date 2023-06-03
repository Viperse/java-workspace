package co.kr.aladin.controller;

import co.kr.aladin.model.Book;
import co.kr.aladin.model.User;

public class UserController {
	
	User user = null;
	BookController bc = null;

	
	public boolean login(String id, String password) { // 로그인
		if(user != null & user.getId().equals(id) && user.getPassword().equals(password))
			return true;
		return false;
	}
	
	public void signUp(User user) { // 회원가입
		this.user = user;
	}
	
	public User viewUserInfo() { // 회원 정보 보기
		if(this.login(user.getId(), user.getPassword())) {
			return user;
		}
		return null;
	}
	
	public User updateUserInfo() { // 회원 정보 수정
		if(this.login(user.getId(), user.getPassword())) { 
			this.user = user;
		}
		return this.user;
	}
	
	public void deleteUserInfo(String id) { // 프로필 삭제
		if(user.getId().equals(id)) {
			user = null;
		}
	}
	
	public Book[] bookListView() { // 장바구니 보기
		if(this.login(user.getId(), user.getPassword())) {
			return bc.bookcart;
		}
		return null;
	}
	
	

}
