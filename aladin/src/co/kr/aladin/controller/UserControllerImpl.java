package co.kr.aladin.controller;

import co.kr.aladin.model.User;

public interface UserControllerImpl {
	
	public boolean login();	
	public boolean signUp();	
	public User viewUserInfo();	
	public User updateUserInfo();
	public boolean deleteUserInfo();

}
