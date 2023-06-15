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
	
	User user = null;
	HashMap<String, User> userMap = new HashMap<>();
	
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
	
	public User loginAdmin(String id, String password) {  // 로그인 정보로 다른 기능 관리
		if(userMap.containsKey(id)) {
			if(userMap.get(id).getPassword().equals(password)) {
				user = userMap.get(id);
				return user;
			}
		}
		return null;
	} 
	
	
	public void viewUserInfo(String id) { // 회원 정보 보기
		if(userMap.containsKey(id)) {
			Set<Entry<String, User>> entrySet = userMap.entrySet();
			for(Entry<String, User> entry :  entrySet) {
				System.out.println("아이디 [" + entry.getKey() + "] " + " : " + entry.getValue());
			}
		}

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
	
	public Map<String, User> getHashMap() {
		return this.userMap;
	}

}
