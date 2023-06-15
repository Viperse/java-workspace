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
		
		
		bc.bookEnroll(new Book("천개의 파랑", "1874592", "공포", "천선란", "우리 SF를 물들일 가장 따뜻한 색", 36000 ,24000, null, null, null, 0));
		bc.bookEnroll(new Book("죽음의 역사", "4741258", "의학", "앤드루 도이그", "뭐 하는 책일까", 21000 ,19800, null, null, null, 0));
		bc.bookEnroll(new Book("자율신경계", "7495226", "의학", "고바야시 히로유키", "뭐 하는 책일까", 9200 ,8820, null, null, null, 0));
		bc.bookEnroll(new Book("죽음이 향연", "7885112", "공포", "한만형", "뭐 하는 책일까", 20000 ,18000, null, null, null, 0));
		
		
		for(int i=0; i<bc.bookMenu().size(); i++) {
			System.out.println(bc.bookMenu().get(i));
		}
		System.out.println();
		
		System.out.println(bc.bookView(0));
		System.out.println(bc.bookSearch("역사"));
		
		System.out.println();
		
		System.out.println(bc.bookGenreView("의학"));
	
		
		
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
		
//		bc.bookCartInput(id, 0);
		
		uc.cashCharge(id, 800000);
		
		System.out.println(uc.viewUserInfo(id));
		
		if(bc.bookPurchase(id, 0)) {
			System.out.println("성공적으로 구매했습니다.");
		}
		

	}

}
