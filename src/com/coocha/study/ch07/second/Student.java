package com.coocha.study.ch07.second;

public class Student extends People {

	//public String name;
	//public String ssn;
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		//super는 부모 객체. this는 지금 객체
		super(name, ssn);
//		this.name = name;
//		this.ssn = ssn;
		this.studentNo = studentNo;
	}

	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
//		super();
	}
	
}
