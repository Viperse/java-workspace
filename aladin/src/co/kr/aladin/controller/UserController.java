package co.kr.aladin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import co.kr.aladin.model.Book;
import co.kr.aladin.model.User;

public class UserController {
	
	public HashMap<String, User> userMap = new HashMap<>();
	
	public boolean signUp(String id, User user) { // 회원가입
		if(!userMap.containsKey(id)) {
			userMap.put(id, user);
			return true;
		}
		return false;
	}
	
	public boolean login(String id, String password) { // 로그인
		if(userMap.containsKey(id)) {
			if(userMap.get(id).getPassword().equals(password)) {
				return true;
			}
		} 
		return false;
	}
	 
	
	public User viewUserInfo(String id) { // 회원 정보 보기
		if(userMap.containsKey(id)) {
			return userMap.get(id);
			
		} return null;		

	}
	
	public int cashCharge(String id, int cash) { // 캐시 충전하기
		userMap.get(id).setCash(cash);
		return userMap.get(id).getCash();
	}
	
	public User updateUserInfo(String id, User user) { // 회원 정보 수정
		
		if(userMap.containsKey(id)) {
			return userMap.put(id, user);
		}
		return null;
	}
	
	public void deleteUserInfo(String id) { // 회원 정보 삭제
		if(userMap.containsKey(id)) {
			userMap.remove(id);
		}
	}
	
	public List<Book> bookListView(String id) { // 장바구니 보기
		if(userMap.containsKey(id)) {
			return userMap.get(id).getBookcart();
		}
		return null;
	}
	

}
