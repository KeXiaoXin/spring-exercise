package com.kxx.b_di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
	
	@Test
	public void demo1() throws Exception {
		UserService userService = new UserServiceImpl();
		userService.getClass().getMethod("setUserDao", UserDao.class).invoke(userService, new UserDaoImpl());
		userService.addUser();
	}
	
	@Test
	public void demo2() {
		String xmlPath = "com/kxx/b_di/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = (UserService) applicationContext.getBean("userServiceId");
		userService.addUser();
	}

}
