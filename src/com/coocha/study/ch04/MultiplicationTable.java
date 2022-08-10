package com.coocha.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {

		//2단 출력 프로그램
		//2 * 1 = 2
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 x " +i +" = " +(2*i));
		}
		
		System.out.println("--------------------");
		
		//2단부터 9단까지 출력
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i +" x " +j +" = " +(i*j) );
			}
			System.out.println("--------------------");
		}
	}

}
