package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름

	public static void main(String[] args) {
		VariablePractice v = new VariablePractice();
//		v.method1();
//		v.method2();
//		v.method3();
//		v.method4();
		
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("더하기 결과: %d\n", num1 + num2);
		System.out.printf("빼기 결과 %d\n", num1 - num2);
		System.out.printf("곱하기 결과 %d\n", num1 * num2);
		System.out.printf("나누기 몫 결과 %d\n", num1 / num2);
		

	}
	
	public void method2() {
		int adult = 10000;
		int student = 7000;
		
		System.out.printf("성인 2명 : %d\n", (adult * 2));
		System.out.printf("청소년 3명 : %d\n", (student * 3));
		System.out.printf("총 금액 : %d\n", (adult * 2) + (student * 3));
		
	}
	
	public void method3() {
		int x = 5;
		int y = 7;
		int z = 9;
		
		int p = x;
		x = y;
		y = z;
		z = p;
				
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String en = sc.nextLine();
		char first = en.charAt(0);
		char last = en.charAt(en.length()-1);
		
		System.out.printf("첫 번째 문자 : %c\n", first);
		System.out.printf("마지막 문자 : %c", last);
	}

}