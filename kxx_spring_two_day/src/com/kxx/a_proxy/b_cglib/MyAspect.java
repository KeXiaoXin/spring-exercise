package com.kxx.a_proxy.b_cglib;

public class MyAspect {
	
	public void before() {
		System.out.println("之前");
	}

	public void after() {
		System.out.println("之后");
	}

}
