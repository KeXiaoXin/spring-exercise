package com.kxx.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	
	@Test
	public void demo1() {
		UserService userService = new UserServiceImpl();
		userService.addUser();
	}
	
	@Test
	public void demo2() {
		String xmlPath = "com/kxx/a_ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
	}

}
