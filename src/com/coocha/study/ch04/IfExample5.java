package com.coocha.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {

		//int 타입의 변수를 2개 선언하고
		//두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램 작성
		
		int x = -8;
		int y = 9;
		
		if (x > 0 && y > 0) {
			System.out.println("제1사분면입니다.");
		} else if (x < 0 && y > 0) {
			System.out.println("제2사분면입니다.");
		} else if (x < 0 && y < 0) {
			System.out.println("제3사분면입니다.");
		} else if (x > 0 && y < 0) {
			System.out.println("제4사분면입니다.");
		} else if (x == 0 && y != 0) {
			System.out.println("x축 위에 있습니다.");
		} else if (x != 0 && y == 0) {
			System.out.println("y축 위에 있습니다.");
		} else {
			System.out.println("원점입니다."); //x,y(0,0)
		}
		
	}

}
