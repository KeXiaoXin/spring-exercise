package com.kxx.f_xml.c_p;

public class Address {
	
	private String homeAddr;
	private String tel;
	
	public String getHomeAddr() {
		return homeAddr;
	}
	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Address [homeAddr=" + homeAddr + ", tel=" + tel + "]";
	}

}
