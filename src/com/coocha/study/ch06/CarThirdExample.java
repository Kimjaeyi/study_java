package com.coocha.study.ch06;

public class CarThirdExample {

	public static void main(String[] args) {

		CarThird carthird = new CarThird();
		String color;
		
		CarThird carthird2 = new CarThird("캐스퍼");
		CarThird carthird3 = new CarThird("아이오닉", 3000, "white");
		
		System.out.println("첫번째 : "+carthird.name);
		System.out.println(carthird.cc +"의 배기량은 "+carthird.cc);
		System.out.println("두번째 : "+carthird2.name);
		System.out.println(carthird2.name +"의 색은 " +carthird2.color);
		System.out.println("세번째 : "+carthird3.name);
		System.out.println(carthird3.name +"의 배기량은 " +carthird.cc);
		System.out.println(carthird3.name +"의 색은 " +carthird3.color);
	}

}
