package co.kr.aladin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import co.kr.aladin.controller.BookController;
import co.kr.aladin.controller.ReviewController;
import co.kr.aladin.controller.UserController;
import co.kr.aladin.model.Book;
import co.kr.aladin.model.Review;
import co.kr.aladin.model.User;

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		UserController uc = new UserController();
		BookController bc = new BookController();
		ReviewController rc = new ReviewController();
		
		
		bc.bookEnroll(new Book("천개의 파랑", "1874592", "판타지", "천선란", "우리 SF를 물들일 가장 따뜻한 색", 36000 ,24000, null, null));
		bc.bookEnroll(new Book("죽음의 역사", "4741258", "의학", "앤드루 도이그", "죽음의 역사를 다룬 책", 21000 ,19800, null, null));
		bc.bookEnroll(new Book("자율신경계", "7495226", "의학", "고바야시 히로유키", "자율신경계를 다룬 책", 9200 ,8820, null, null));
		bc.bookEnroll(new Book("죽음의 향연", "7885112", "공포", "한만형", "죽음의 향연을 다룬 책", 20000 ,18000, null, null));

	}

}
