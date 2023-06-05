package com.kh.practice1;

import java.util.Scanner;

import com.kh.practice1.controller.MusicController;
import com.kh.practice1.model.Music;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public static void main(String[] args) {
		
		Application app = new Application();
		app.mainMenu();

	}
	
	public void mainMenu() {
		
		try {
			boolean check = true;
			
			while(check) {
				System.out.println("==== 메인 메뉴 ====");
				System.out.println("1. 마지막 위치에 곡 추가");
				System.out.println("2. 첫 위치에 곡 추가");
				System.out.println("3. 전체 곡 목록 출력");
				System.out.println("4. 특정 곡 검색");
				System.out.println("5. 특정 곡 삭제");
				System.out.println("6. 특정 곡 정보 수정");
				System.out.println("7. 곡명 오름차순 정렬");
				System.out.println("8. 가수명 내림차순 정렬");
				System.out.println("9. 종료");
				
				System.out.print("메뉴 번호 입력 : ");
				int select = Integer.parseInt(sc.nextLine());
				
				switch(select) {
				case 1:
					addList();
					break;
				case 2:
					addAtZero();
					break;
				case 3:
					printAll();
					break;
				case 4:
					searchMusic();
					break;
				case 5:
					removeMusic();
					break;
				case 6:
					setMusic();
					break;
				case 7:
					ascTitle();
					break;
				case 8:
					descTitle();
					break;
				case 9:
					System.out.println("종료");
					check = false;
					break;
				}
			}
			
		} catch(Exception e) {
			System.out.println("잘못 입력하셨습니다." + e.getMessage());
			mainMenu();
		}
		
	
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 :");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();
		
		Music music = new Music(title, artist);
		
		if (mc.addList(music)) {
			System.out.println("추가 성공");
		} else System.out.println("추가 실패");
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 :");
		String title = sc.nextLine();
		
		System.out.print("가수 명 : ");
		String artist = sc.nextLine();
		
		Music music = new Music(title, artist);
		
		if (mc.addAtZero(music)) {
			System.out.println("추가 성공");
		} else System.out.println("추가 실패");
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		for(int i=0; i<mc.printAll().size(); i++) {
			System.out.println(mc.printAll().get(i));
		}
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		if(null != mc.searchMusic(title)) {
			System.out.println(mc.searchMusic(title) + "을 검색했습니다.");
		} else System.out.println("검색한 곡이 없습니다.");
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		if(null != mc.removeMusic(title)) {
			mc.searchMusic(title);
			System.out.println(title + "을(를) 삭제했습니다.");
		} else System.out.println("삭제할 곡이 없습니다.");
	}
	
	public void setMusic() {
		
		System.out.println("****** 특정 곡 수정 ******");
		
		System.out.print("검색할 곡 명 : ");		
		String title = sc.nextLine();
		
		System.out.print("수정할 곡 명 : ");	
		String title1 = sc.nextLine();
		
		System.out.print("수정할 가수 명 : ");
		String artist = sc.nextLine();
		
		Music music = new Music(title1, artist);
		
		if(null != mc.setMusic(title, music)) {
			System.out.println(mc.setMusic(title, music) + "의 값이 변경되었습니다.");
		} else System.out.println("수정할 곡이 없습니다.");
		
	}
	
	public void ascTitle() {	
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		
		for(Music music : mc.ascTitle()) {
			System.out.println(music);
		}
	}
	
	public void descTitle() {
		System.out.println("****** 가수 명 내림차순 정렬 ******");
		
		for(Music music : mc.descArtist()) {
			System.out.println(music);
		}
	}
}
