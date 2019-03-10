package com.kxx.f_xml.d_spel;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {
	
	@Test
	public void demo2() {
		String xmlPath = "com/kxx/f_xml/d_spel/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		Customer customer = (Customer) applicationContext.getBean("customerId");
		System.out.println(customer);
	}

}
