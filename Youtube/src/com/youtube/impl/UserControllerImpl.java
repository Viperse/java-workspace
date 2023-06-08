package com.youtube.impl;

import com.youtube.model.User;

public interface UserControllerImpl {
	
	public boolean login();	
	public boolean sighUp();	
	public User viewProfile();
	public User updateProfile();
	public boolean deleteProfile();

}
