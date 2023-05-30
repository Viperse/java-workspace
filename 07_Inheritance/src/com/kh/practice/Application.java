package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;

public class Application {
	
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		Application ap = new Application();
		
		boolean result = true;
		int menu1 = 0;
		int menu2 = 0;
		int menu3 = 0;
		
		while(result) {
			
			ap.mainMenu();
			menu1 = Integer.parseInt(sc.nextLine());
			switch (menu1) {
			case 1:
				ap.circleMenu();
				menu2 = Integer.parseInt(sc.nextLine());
				switch (menu2) {
				case 1:
					ap.calcCircleArea();
					break;
				case 2:
					ap.calcCircum();
					break;
				case 9:
					break;
				}
				break;
				
			case 2:
				ap.rectangleMenu();
				menu3 = Integer.parseInt(sc.nextLine());
				switch (menu3) {
				case 1:
					ap.calcRectArea();;
					break;
				case 2:
					ap.calcPerimeter();
					break;
				case 9:
					break;
				}
				break;
				
			case 9:
				System.out.println("종료합니다. ");
				result = false;
				break;
			}
		}
				
		
	}
	
	public void mainMenu() {
		
		
		System.out.println(" ===== 메뉴 ===== ");
		System.out.println("1. 원");
		System.out.println("2. 사각형");
		System.out.println("9. 끝내기");
		
		System.out.print("메뉴 번호 : ");		
	}
	
	public void circleMenu() {
		System.out.println(" ===== 원 메뉴 ===== ");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 : ");

	}
	
	public void rectangleMenu() {
		System.out.println(" ===== 사각형 메뉴 ===== ");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		
		System.out.print("메뉴 번호 : ");
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 : ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = Integer.parseInt(sc.nextLine());
		
		System.out.print("y 좌표 : ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 : ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcArea(x, y, height, width));
	}

}
