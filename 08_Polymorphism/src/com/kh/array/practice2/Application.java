package com.kh.array.practice2;

import java.util.Scanner;

import com.kh.array.practice2.controller.MemberController;
import com.kh.array.practice2.model.Member;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	
	MemberController mc = new MemberController();
	
	public static void main(String[] args) {
		Application ap = new Application();
		ap.mainMenu();
	}
	
	public void mainMenu() {
		
		boolean check = true;
		
		while(check) {
			System.out.println("최대 등록 가능한 회원 수는 3명입니다.");
			System.out.printf("현재 등록된 회원 수는 %d명입니다.\n", mc.count);
			if(mc.count < 3) {
				System.out.println("1. 새 회원 등록");
			} else System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			System.out.println("2. 회원 정보 수정");
			System.out.println("3. 전체 회원 정보 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				this.insertMenu();
				break;
			case 2:
				this.updateMenu();
				break;
			case 3:
				this.printAll();
				break;				
			case 9:
				check = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			}
			
		}
	
	}
	
	public void insertMenu() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		if (mc.checkId(id) == -1) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			
			System.out.print("성별(M/F) : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.print("나이 : ");
			int age = Integer.parseInt(sc.nextLine());
			
			Member m = new Member(id, name, password, email, gender, age);
			mc.insertMember(m);
			
			
		} else if (mc.checkId(id) != -1) {
			System.out.println("중복된 아이디입니다. 다시 입력해 주세요.");
			this.insertMenu();
		
		}
	}
	
	public void updateMenu() {
		
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		
		if (mc.checkId(id) != -1) {
			
			System.out.print("수정할 이름 : ");
			String name = sc.nextLine();
					
			System.out.print("수정할 비밀번호 : ");
			String password =sc.nextLine();
			
			System.out.print("수정할 이메일 : ");
			String email = sc.nextLine();
			
			mc.updateMember(id, name, password, email);
		} else if (mc.checkId(id) == -1) {
			System.out.println("회원 정보가 없습니다. ");
		}
	}
	
	public void printAll() {
		
		Member[] mArr = mc.printAll();
		for(Member mb : mArr) {
			if(mb != null) System.out.println(mb);
		}
	}

}

