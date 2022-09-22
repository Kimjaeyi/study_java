package com.coocha.study.ch10.first;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		//catch문 : 클래스 못 찾으면 sysout 실행해줭
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
}
