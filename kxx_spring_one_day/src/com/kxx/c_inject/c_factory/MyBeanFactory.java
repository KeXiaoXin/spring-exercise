package com.kxx.c_inject.c_factory;

public class MyBeanFactory {
	
	public UserService createService() {
		return new UserServiceImpl();
	}

}
