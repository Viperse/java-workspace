package co.kr.aladin.model;

import java.sql.Date;
import java.util.Scanner;

public class User {
	
	Scanner sc = new Scanner(System.in);
	
	public String id;
	public String email;
	public String password;
	public String name;
	public Date birth;
	public String number;
	
	
	public boolean login() { // 로그인
		return false;
	}
	
	public boolean signUp() { // 회원가입
		return false;
	}
	
	public User viewUserInfo() { // 회원 정보 보기
		return null;
	}
	
	public User updateUserInfo() { // 회원 정보 수정
		return null;
	}
	
	public boolean deleteUserInfo() { // 프로필 삭제
		return false;
	}

}
