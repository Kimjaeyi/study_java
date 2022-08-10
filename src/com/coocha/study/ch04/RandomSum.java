package com.coocha.study.ch04;

public class RandomSum {

	public static void main(String[] args) {

		//1~100 사이의 랜덤 정수 2개를 발생시켜
		//두 수 사이의 합 구하기
		
		double min = 1.0;
		double max = 100.0;
		int sum = 0;
		int random = (int) ((Math.random() * (max - min)) + min);
		int random2 = (int) ((Math.random() * (max - min)) + min);
		
		System.out.println("숫자 1 : " +random);
		System.out.println("숫자 2 : " +random2);
		
		if (random < random2) {
			for (int i = random + 1; i < random2; i++) {
				sum += i;
			}
			System.out.println("두 수 사이의 합 : " +sum);
		} else if (random > random2) {
			for (int j = random2 + 1; j < random; j++) {
				sum += j;
			}
			System.out.println("두 수 사이의 합 : " +sum);
		} else {
			//두 수 차이가 1이거나(ex. 5, 6) 두 난수가 같은 숫자일 경우
			System.out.println("두 수 사이의 수가 존재하지 않습니다.");
		}
		
	}
		
}

