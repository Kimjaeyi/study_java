package com.coocha.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.println("result : " +result);
		System.out.println("result2 : " +result2);
		System.out.println("result3 : " +result3);
		System.out.println("result4 : " +result4);
		System.out.println("result5 : " +result5);
		
		double result6 = v1 / v2;
		System.out.println("result6 : " +result6);
		
		double result7 = (double) v1 / v2;
		System.out.println("result7 : " +result7);

	}

}
