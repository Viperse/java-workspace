package com.youtube.controller;

import java.util.ArrayList;
import java.util.List;

import com.youtube.model.User;

public class UserController {
	
	User user = null;	
	public boolean login(String id, String password) { // 로그인
		if(user != null && user.getId().equals(id) && user.getPassword().equals(password))
			return true;
		return false;
	}
	
	public void sighUp(User user) { // 회원가입
		this.user = user;
	}
	
	public User viewProfile() { // 프로필 보기 (로그인 된 경우)
		if(login(user.getId(), user.getPassword())) {
			return user;
		}
		return null;
	}
	
	
	public User updateProfile() { // 프로필 수정
		if(login(this.user.getId(), this.user.getPassword())) {
			this.user = user;
		}
		return this.user;
	}
	
	public void deleteProfile(String id) { // 계정 삭제
		if(user.getId().equals(id)) {
			user = null;
			
		}
	}

}
