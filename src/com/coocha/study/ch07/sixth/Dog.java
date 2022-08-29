package com.coocha.study.ch07.sixth;

public class Dog extends Animal {

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("왈왈");
	}
	
	@Override
	public void sound(String m) {
		System.out.println("나으르렁으르렁으르렁대");
	}
}
