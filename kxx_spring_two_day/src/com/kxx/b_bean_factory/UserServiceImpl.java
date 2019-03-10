package com.kxx.b_bean_factory;

public class UserServiceImpl implements UserService{

	@Override
	public void addUser() {
		System.out.println("a_proxy.b_cglib add user");
	}
	
	@Override
	public void updateUser() {
		System.out.println("a_proxy.b_cglib update user");
	}

	@Override
	public void deleteUser() {
		System.out.println("a_proxy.b_cglib delete user");
	}

}
