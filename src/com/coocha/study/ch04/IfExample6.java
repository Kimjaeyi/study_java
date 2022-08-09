package com.coocha.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {

		//int 타입의 변수를 3개 선언
		//세 정수 중에서 최대값 최소값을 구하는 프로그램
		
		int a = 7;
		int b = -1;
		int c = 12;
		
		if (a != b && b != c && c != a) {
			if (a > b && a > c) {
				System.out.println("최대값은 a = " + a );
			} else if (b > a && b > c) {
				System.out.println("최대값은 b = " + b);
			} else {
				System.out.println("최대값은 c = " + c);
			}
			
			if (a < b && a < c) {
				System.out.println("최소값은 a = " + a);
			} else if (b < a && b < c) {
				System.out.println("최소값은 b = " + b);
			} else {
				System.out.println("최소값은 c = " + c);
			}
		} else if (a == b && a != c) {
			if (a > c) {
				System.out.println("최대값은 a, b = " + a + "," + "최소값은 c = " + c);
			} else {
				System.out.println("최대값은 c = " + c + "," + "최소값은 a, b = " + a);
			}
		} else if (a != b && b == c) {
			if (a > b) {
				System.out.println("최대값은 a = " +a + "," + "최소값은 b, c = " +b );
			} else {
				System.out.println("최대값은 b, c = " +b + "," + "최소값은 a = " +a);
			}
		} else if (a == c && a != b) {
			if (a > b) {
				System.out.println("최대값은 a, c = " + a + "," + "최소값은 b = " + b);
			} else {
				System.out.println("최대값은 b = " + b + "," + "최소값은 a, c = " + a);
			}
		} else {
			System.out.println("셋은 모두 같은 값입니다.");
		}
		
	}

}
