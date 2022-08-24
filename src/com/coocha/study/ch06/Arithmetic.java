package com.coocha.study.ch06;

public class Arithmetic {

	public int plus(int a, int b) {
		int plus = 0;
		plus = a + b;
		return plus;
	}
	
	public int minus(int a, int b) {
		int minus = 0;
		minus = a - b;
		return minus;
	}
	
	public int multi(int a, int b) {
		int multi = 0;
		multi = a * b;
		return multi;
	}
	
	public int divide(int a, int b) {
		int divide = 0;
		divide = a / b;
		return divide;
	}
	
	public int remind(int a, int b) {
		int remind = 0;
		remind = a % b;
		return remind;
	}
	
	public void say(int result) {
		System.out.println("결과값은 "+result);
	}
	
	public int abc (int a) {
		return 1;
	}
	
	public String aaa (int a) {
		return "";
	}
	
	public boolean bbb (int a) {
		return true;
	}
	
	public double ccc (int a) {
		return 1.1;
	}
	
	public void ddd (int a) {
		
	}
	
	static void staticTest() {
		System.out.println("나는 재이당");
	}

}
