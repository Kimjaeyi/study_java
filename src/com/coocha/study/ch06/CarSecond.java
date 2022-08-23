package com.coocha.study.ch06;

public class CarSecond {

	String color = "red";
	int cc = 1500;
	
//	명시적생성자
	CarSecond(String str) {
		color = str;
	}
	
	CarSecond(String str, int num) {
		color = str;
		cc = num;
	}
	
//	기본생성자
	CarSecond() {
		
	}
	
}
