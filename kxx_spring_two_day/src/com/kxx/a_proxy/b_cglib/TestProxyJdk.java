package com.kxx.a_proxy.b_cglib;

import org.junit.Test;

public class TestProxyJdk {
	
	@Test
	public void demo1() {
		UserServiceImpl userServiceImpl = MyBeanFactory.createService();
		userServiceImpl.addUser();
		userServiceImpl.updateUser();
		userServiceImpl.deleteUser();
	}

}
