package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {
	
	// 클라이언트가 보낸 메시지를 받아서 다시 클라이언트에게 받은 메시지를 출력한다.
	
	public static void main(String[] args) {
		
		
		try {
			ServerSocket server = new ServerSocket(60000);
			System.out.println("서버 연결 대기 중");
			
			Socket s = server.accept();
			System.out.println("클라이언트 소켓 리턴 중");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println("[" + s.getInetAddress() + "] 가 보낸 메시지 : " + line);
				pw.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
