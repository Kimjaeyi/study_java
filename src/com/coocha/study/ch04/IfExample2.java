package com.coocha.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
		//일반 : 1, 5% 할인적용
		//브론즈 : 2, 10% 할인적용
		//실버 : 3, 15% 할인적용
		//골드 : 4, 20% 할인적용
		//플래티넘 : 5, 27% 할인적용
		
		int num = 4;
		int price = 35000;
		
		if (num == 1) {
			int discount = (int) (price*(1-0.05));
			System.out.println("등급 : 일반, " + "정가 : " + price + "원, " + "할인가 : " + discount + "원");
		} else if (num == 2) {
			int discount = (int) (price*(1-0.1));
			System.out.println("등급 : 브론즈, " + "정가 : " + price + "원, " + "할인가 : " + discount + "원");
		} else if (num == 3) {
			int discount = (int) (price*(1-0.15));
			System.out.println("등급 : 실버, " + "정가 : " + price + "원, " + "할인가 : " + discount + "원");
		} else if (num == 4) {
			int discount = (int) (price*(1-0.2));
			System.out.println("등급 : 골드, " + "정가 : " + price + "원, " + "할인가 : " + discount + "원");
		} else if (num == 5) {
			int discount = (int) (price*(1-0.25));
			System.out.println("등급 : 플래티넘, " + "정가 : " + price + "원, " + "할인가 : " + discount + "원");
		} else {
			System.out.println("해당 등급이 존재하지 않습니다.");
		}
		
	}

}
