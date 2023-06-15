package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ChattClient {
	
	// 키보드로 입력받은 데이터를 읽어서 서버로 보낸다. 다시 서버가 보낸 메시지를 받아서 클라이언트 자신의 콘솔창에 출력한다.

	public static void main(String[] args) {
		
		
		try {
			
//			InetAddress ip = InetAddress.getLocalHost();
			
			Socket s = new Socket("192.168.10.17", 60000); // 포트 번호 맞추기
			System.out.println("Client Socket Creating...");
						
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					

			while(true) {
				String line = br.readLine();
				pw.println(line);
				System.out.println("내가 보낸 메시지 : " + br2.readLine());
			}		
		} catch (IOException e) {
			System.out.println("서버와의 연결에 실패했습니다...");
		}

	}

}
