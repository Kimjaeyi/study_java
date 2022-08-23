package com.coocha.study.ch06;

public class KoreanExample {

	public static void main(String[] args) {

		Korean k1 = new Korean("김재이", "971118-2012345");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		
		Korean k2 = new Korean("김재이", 26);
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.age : " + k2.age);
		
	}

}
