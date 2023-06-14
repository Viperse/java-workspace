package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest2 {
	
	boolean inputCheck = false;

	public static void main(String[] args) {
		
		InputThreadTest2 process = new InputThreadTest2();
				
		Thread tct = new Thread(new CountThread(process));
		Thread tit = new Thread(new InputThread(process));
		
		tct.start();
		tit.start();

		

	}

}
