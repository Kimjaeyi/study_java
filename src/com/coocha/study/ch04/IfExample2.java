package com.coocha.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		int num = 3;
		int price = 25000;
		
		if (num == 1) {
			System.out.println("정가 : " + price + "일반 등급 : " + price*0.95 + "원");
		} else if (num == 2) {
			System.out.println("정가 : " + price + "브론즈 등급 :" + price*0.9 + "원");
		} else if (num == 3) {
			System.out.println("정가 : " + price + "실버 등급 : " + price*0.85 + "원");
		} else if (num == 4) {
			System.out.println("정가 : " + price + "골드 등급 : " + price*0.8 + "원");
		} else {
			System.out.println("정가 : " + price + "플래티넘 등급 : " + price*0.73 + "원");
		}
		
	}

}
