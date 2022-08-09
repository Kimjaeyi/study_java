package com.coocha.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {

		//int 타입의 변수를 1개 선언하고
		//짝수인지 홀수인지 판단하여 결과 출력
		
		int a = 0;
		
		if (a != 0) {
			if (a % 2 == 0) {
				System.out.println("a는 짝수입니다");
			} else {
				System.out.println("a는 홀수입니다.");
			}
		} else {
			System.out.println("a는 0입니다.");
		}
		
	}

}
