package com.kxx.f_xml.a_constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
	
	@Test
	public void demo2() {
		String xmlPath = "com/kxx/f_xml/b_setter/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		User user = (User) applicationContext.getBean("personId");
		System.out.println(user);
	}

}
