package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.set.model.Person;

public class Application {

	public static void main(String[] args) {
		
		Application app = new Application();
		app.method1();
	}
	
	public void method1() {
		
		TreeSet<Integer> set1 = new TreeSet<>();
		
		for(int i=0; set1.size()< 6; i++) {
			set1.add((int)(Math.random() * 45 + 1));
		}
		
		
		for(int i=0; ;i++) {
			
			TreeSet<Integer> set2 = new TreeSet<>();
			
			for(int j=0; set2.size()<6; j++) {
				set2.add((int)(Math.random() * 45 + 1));
			}
			
			System.out.println("로또 번호 : " + set1);		
			System.out.println("내 번호 : " + set2);
			
			if(set1.equals(set2)) {
				System.out.println(i);
				break;
			}			
			
		}
	}
	
	public void method2() {
		
		HashSet<Integer> set1 = new HashSet<>();
		
		for(int i=0; set1.size()< 6; i++) {
			set1.add((int)(Math.random() * 45 + 1));
		}
		
		List lottoList = new ArrayList(set1);
		Collections.sort(lottoList);
		
		for(int i=0; ;i++) {
			
			HashSet<Integer> set2 = new HashSet<>();
			
			for(int j=0; set2.size()<6; j++) {
				set2.add((int)(Math.random() * 45 + 1));
			}
			
			List myLottoList = new ArrayList(set2);
			Collections.sort(myLottoList);
			
			System.out.println("로또 번호 : " + set1);		
			System.out.println("내 번호 : " + set2);
			
			if(set1.equals(set2)) {
				System.out.println(i);
				break;
			}			
			
		}
	}

}
