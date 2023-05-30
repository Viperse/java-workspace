package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	
	private Member[] mArr = new Member[3];
	public int count;
	
	public void insertMember(Member m) {
		mArr[count] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());	
		count++;
	}
	
	public boolean updateMember(String id, String name, String password, String email) {
		// checkId 활용
		// 추가처럼 수정도 같은 방식! 해당 인덱스 값에 넣는 방식
		// setter 이용
		int index = this.checkId(id);
		if (index != -1) {
			
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			return true;
		}
		
		return false;
	}
	
	public int checkId(String id) {
			
		for(int i = 0; i<mArr.length; i++) {
			if(mArr[i] != null && id.equals(mArr[i].getId())) {
				return i;
			}
		}
		return -1;
	
	}
	
	public Member[] printAll() {
		
		return mArr;
	}
}
