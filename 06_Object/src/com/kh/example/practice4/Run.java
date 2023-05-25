package com.kh.example.practice4;

import java.util.Scanner;

import com.kh.example.practice4.controller.SnackController;
import com.kh.example.practice4.model.Snack;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("스낵류를 입력하세요.");
		
//		Snack s = new Snack();
		SnackController scr = new SnackController();
		
		System.out.print("종류 : ");
		String kind = sc.nextLine();
//		s1.setKind(sc.nextLine());
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
//		s1.setName(sc.nextLine());
		
		System.out.print("맛 : ");
		String flavor = sc.nextLine();
//		s1.setFlavor(sc.nextLine());
		
		System.out.print("개수 : ");
		int numOf = Integer.parseInt(sc.nextLine());
//		s1.setNumOf(Integer.parseInt(sc.nextLine()));
		
		System.out.print("가격 : ");
		int price = Integer.parseInt(sc.nextLine());
//		s1.setPrice(Integer.parseInt(sc.nextLine()));
		
		Snack s = new Snack(kind, name, flavor, numOf, price);
		scr.saveData(s);
		if(scr.saveData(s)) {
			System.out.println("저장 완료되었습니다.");
			System.out.println(scr.confirmData());
		}
		
//		System.out.println(s1.getKind() + "(" + s1.getName() + " - " + s1.getFlavor() + ") " + s1.getNumOf() +
//				"개 " + s1.getPrice() + "원");

	}

}
