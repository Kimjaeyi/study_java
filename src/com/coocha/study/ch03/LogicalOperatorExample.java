package com.coocha.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {

//		&& = & : and : 논리곱 : 연산 참 참->참, 나머지 거짓
//		|| = | : or : 논리합 : 연산 참 거짓->참, 거짓 참->참, 참 참->참, 거짓 거짓->거짓
//		^ : xor : 배타적 논리합 : 연산 참 참->거짓, 참 거짓->참, 거짓 참->참, 거짓 거짓->거짓
		
		int a = 65;
		
		boolean result1 = (a >= 65);
		System.out.println("result1 : " + result1);
		
		boolean result2 = (a <= 90);
		System.out.println("result2 : " + result2);
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		System.out.println("-------------------------");
		
		if(a >= 65 | a <= 90 ) {
			System.out.println("둘 다 참");
		}
		
		if(a >= 66 | a <= 90 ) {
			System.out.println("한 개만 참");
		}
		
		if(a >= 66 | a <= 50 ) {
			System.out.println("둘 다 거짓");
		}
		
		if(a >= 65 || a <= 90 ) {
			System.out.println("둘 다 참");
		}
		
		if(a >= 66 || a <= 90 ) {
			System.out.println("한 개만 참");
		}
		
		if(a >= 66 || a <= 50 ) {
			System.out.println("둘 다 거짓");
		}
		
		System.out.println("-------------------------");
		
		if(a >= 65 ^ a <= 50) {
			System.out.println("한 개만 참");
		}
		
		if(a >= 65 ^ a <= 90) {
			System.out.println("둘 다 참");
		}
		
		if(a >= 66 ^ a <= 90) {
			System.out.println("한 개만 참");
		}
		
		if(a >= 66 ^ a <= 50) {
			System.out.println("둘 다 거짓");
		}
	}

}
