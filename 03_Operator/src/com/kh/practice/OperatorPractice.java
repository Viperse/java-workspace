package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main(String[] args) {
		OperatorPractice o = new OperatorPractice();
//		o.method1();
//		o.method2();
//		o.method3();
//		o.method4();
//		o.method5();
		o.method6();
		
		
	}
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		int pencil = sc.nextInt();
		
		System.out.println("1인당 연필 개수 : " + (pencil / person));
		System.out.println("남는 연필 개수 : " + (pencil % person));
		
	}
	
	public void method2() {
		
		int p = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력해 주세요 > ");
		int num1 = sc.nextInt();
		
		p = num1 % 100;
		System.out.println(num1 - p);
		
	}
	
	public void method3() {
		
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int i = sc.nextInt();
		
		System.out.print("입력2 : ");
		int j = sc.nextInt();
		
		System.out.print("입력3 : ");
		int k = sc.nextInt();

		result = (i == j) && (i == k);
		System.out.print(result);
		
	}
	
	public void method4() {
		
		String test = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int number = sc.nextInt();
		
		test = (number % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(test);
		
	}
	
	public void method5() {
		
		String str = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		str = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		System.out.println(str);
	}
	
	public void method6() {
		
		int result = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사과의 개수 : ");
		int apple = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int bag = sc.nextInt();
		
		result = apple / bag;
		cnt = (apple % bag) == 0 ? result : result + 1;
		
		System.out.printf("필요한 바구니의 수 : %d ", cnt);
	}
}


