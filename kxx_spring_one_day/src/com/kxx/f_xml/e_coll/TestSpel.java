package com.kxx.f_xml.e_coll;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {
	
	@Test
	public void demo2() {
		String xmlPath = "com/kxx/f_xml/e_coll/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		CollData collData = (CollData) applicationContext.getBean("collDataId");
		System.out.println(collData);
	}

}
