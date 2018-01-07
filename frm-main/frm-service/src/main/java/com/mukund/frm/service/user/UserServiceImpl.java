package com.mukund.frm.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean authenticate(String user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> fetchRoles(String user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean authorize(String user, String page) {
		// TODO Auto-generated method stub
		return false;
	}

}
