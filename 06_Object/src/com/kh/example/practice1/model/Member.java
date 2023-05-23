package com.kh.example.practice1.model;


public class Member {
	
	
	public String memberId = "Viper";
	public String memberPwd = "1234";
	public String memberName = "김도경";
	
	public int age = 25;
	public char gender = '여';
	public String phone = "010-5515-6035";
	public String email;
	
	public void changeName(String name) {
		memberName = name;
	}
	
	public void printName() {
		System.out.println(memberName);
	}

}
