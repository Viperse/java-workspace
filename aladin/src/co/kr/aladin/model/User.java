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
	
	
	public void login() { // 로그인
		
		System.out.print("아이디 : ");
		
		
		
	}
	
	public void signUp(String newId, String newPassword) { // 회원가입
		
		id = newId;
		password = newPassword;
	}
	
	public void viewUserInfo() { // 회원 정보 보기
		
	}
	
	public void updateUserInfo() { // 회원 정보 수정
		
	}
	
	public void deleteUserInfo() { // 프로필 삭제
		
	}

}
