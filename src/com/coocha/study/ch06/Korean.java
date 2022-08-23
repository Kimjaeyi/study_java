package com.coocha.study.ch06;

public class Korean {

	String name;
	String ssn;
	int age;
	
	// 오버로딩(**오버라이딩이랑 혼동하면 X!!)
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Korean() {
		
	}
	
}
