package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		// 원의 둘레 = 2 X 반지름 X PI
		System.out.printf("원의 둘레 : %.2f\n", Circle.PI * c.radius * 2);
		// 원의 넓이 = 반지름 X 반지름 X PI
		System.out.printf("원의 넓이 : %.2f\n", Circle.PI * c.radius * c.radius);
		
		c.incrementRadius();
		
		System.out.printf("원의 둘레 : %.2f\n", Circle.PI * c.radius * 2);
		System.out.printf("원의 넓이 : %.2f\n", Circle.PI * c.radius * c.radius);
		

	}

}
