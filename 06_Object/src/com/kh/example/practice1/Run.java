package com.kh.example.practice1;

import java.util.Scanner;

import com.kh.example.practice1.model.Member;

public class Run {

	public static void main(String[] args) {
		
		Member mb = new Member();
		
		System.out.print("현재 이름 : ");
		mb.printName();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변경할 이름 : ");
		String name = sc.nextLine();
		mb.changeName(name);
		
		System.out.print("변경된 이름 : ");
		mb.printName();

	}

}
