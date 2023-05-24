package com.kh.step3;

import com.kh.step3.model.Calculator;

public class Application {

	public static void main(String[] args) {
		
		/*
		 * 변수 호출 방법
		 * - 참조변수.변수;
		 * 
		 * 메소드 호출 방법
		 * - 참조변수.메소드이름();            // 매개변수가 없는 경우
		 * - 참조변수.메소드이름(값1, 값2, ...) // 매개변수가 있는 경우
		 */
		
		Calculator c1 = new Calculator();
		
		c1.a = 3;
		c1.b = 77;
		
		System.out.print("최대값 : " + c1.max());
		
		System.out.println();
		
		System.out.printf("%d + %d = %d\n", c1.a, c1.b, c1.add());
		System.out.printf("%d - %d = %d\n", c1.a, c1.b, c1.substract());
		System.out.printf("%d * %d = %d\n", c1.a, c1.b, c1.multiply(c1.a, c1.b));
		System.out.printf("%d, %d : %s\n", c1.a, c1.b, c1.divide(c1.a, c1.b));
		
		System.out.println("팩토리얼 : " + c1.factorial(c1.a));
	}

}
