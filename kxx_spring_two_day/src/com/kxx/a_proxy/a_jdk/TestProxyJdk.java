package com.kxx.a_proxy.a_jdk;

import org.junit.Test;

public class TestProxyJdk {
	
	@Test
	public void demo1() {
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}

}
