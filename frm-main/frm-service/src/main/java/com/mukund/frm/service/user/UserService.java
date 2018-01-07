package com.mukund.frm.service.user;

import java.util.List;

public interface UserService {

	void initialize();

	boolean authenticate(String user, String password);
	
	List<String> fetchRoles(String user);
	
	boolean authorize(String user, String page);
	
	
	
}
