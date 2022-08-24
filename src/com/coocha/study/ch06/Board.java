package com.coocha.study.ch06;

public class Board {

	String name = "김재이";
	int view = 100;
	boolean use = true;
	
	Board(String name) {
		this.name = name;
	}
	
	Board(String name, int view) {
		this.name = name;
		this.view = view;
	}
	
	Board(String name, boolean use) {
		this.name = name;
		this.use = use;
	}
	
	Board(String name, int view, boolean use) {
		this.name = name;
		this.view = view;
		this.use = use;
	}
	
	Board() {
		
	}
	
	public void say() {
		System.out.println("이름 : " +name +", 조회수 : "+view +", 사용여부 : " +use );
	}
	
}
