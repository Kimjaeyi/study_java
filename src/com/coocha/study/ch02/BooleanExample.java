package com.coocha.study.ch02;

public class BooleanExample {

	public static void main(String[] args) {
		
		boolean stop = false;		// true, false만 가능
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		
		boolean finish = true;
		
		if(finish) {
			System.out.println("집 간다");
		} else {
			System.out.println("수업 중");
		}

	}

}
