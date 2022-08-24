package com.coocha.study.ch06;

public class Korean {

	String name;
	String ssn;
	int age;
	
	Korean() {
		
	}
	
	// 오버로딩(**오버라이딩이랑 혼동하면 X!!)
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	static String nationality = "Korean";
	
	static int staticTest (int a) {
		return a + 10;
	}
	
	int staticTest2 (int a) {
		return a - 10;
	}
	
}
