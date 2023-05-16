package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {

	public static void main(String[] args) {
		
		CastingPractice c = new CastingPractice();
//		c.method1();
//		c.method2();

	}
	
	public void method1() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("문자 : ");
		String n = sc.nextLine();
		char i = n.charAt(0);
		
		int j = (int)i;
		int k = (int)i+1;
		
		System.out.printf("unicode : %d\n", j);
		System.out.printf("unicode : %d\n", k);
		
	}
	
	public void method2() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.printf("총점 : %d\n", (kor + math + eng));
		System.out.printf("평균 : %.2f", ((kor + math + eng) / (double)3));
	}

}