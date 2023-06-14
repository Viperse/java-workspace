package co.kr.aladin;

import java.time.LocalDate;
import java.util.Scanner;

import co.kr.aladin.controller.BookController;
import co.kr.aladin.controller.ReviewController;
import co.kr.aladin.controller.UserController;
import co.kr.aladin.model.Book;
import co.kr.aladin.model.User;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserController uc = new UserController();
		BookController bc = new BookController();
		ReviewController rc = new ReviewController();
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("생년월일 : ");
		int year = Integer.parseInt(sc.nextLine());
		int month = Integer.parseInt(sc.nextLine());
		int day = Integer.parseInt(sc.nextLine());
		LocalDate birth = LocalDate.of(year, month, day);
		
		System.out.print("휴대폰 번호 : ");
		String number = sc.nextLine();
		
		System.out.print("캐시 : ");
		int cash = Integer.parseInt(sc.nextLine());
		
		
		
		User user = new User(email, password, name, birth, number, cash, null);
		
		uc.signUp(id, user);
		
		System.out.println(uc.viewUserInfo(id));
		
		

	}

}
