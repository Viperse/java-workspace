package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		
		String[] fru = new String[] {"복숭아", "멜론", "사과", "바나나", "체리"};
		
		System.out.println(fru[0]);
		
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
		
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		
		String[] menu = {"떡볶이", "마라탕", "케이크", "닭발", "피자", "치킨"};
		boolean a = false;
		
		System.out.print("배달 메뉴를 골라 주세요 : ");
		String food = sc.nextLine();
		
		for(String i : menu) {
			if (i.equals(food))
				System.out.println("배달 가능");

		}
		
		if ()
			
	}

	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
		System.out.print("주민등록번호 : ");
		String number = sc.nextLine();
		
		char[] id = number.toCharArray();
		
		char[] idc = id.clone();
		
		for(int i=0; i<idc.length; i++) {
			if (i > 7)
				idc[i] = '*';
			System.out.print(idc[i]);
		}
				
	}
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * 단어 입력 : programming
	 * gnimmargorp
	 * 
	 * */
	public void method5() {
		
		System.out.print("단어 입력 : ");
		String word = sc.nextLine();
		
		char[] ch = word.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);			
		}
				
		
	}
	
	public static void main(String[] args) {
		
		ArrayPractice a = new ArrayPractice();
//		a.method1(); -
//		a.method2(); -
		a.method3();
//		a.method4(); -
//		a.method5(); -
		
	}
}
