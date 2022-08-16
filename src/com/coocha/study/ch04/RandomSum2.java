package com.coocha.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

		double min = 1.0;
		double max = 100.0;
		int sum = 0;
		int random = (int) ((Math.random() * (max - min)) + min);
		int random2 = (int) ((Math.random() * (max - min)) + min);
		
		System.out.println("숫자1 : " +random);
		System.out.println("숫자2 : " +random2);
		
		if (random > random2) {
			for(int i = random2 + 1; i < random; i++) {
				sum += i;
			}
			System.out.println("두 수 사이의 합 : " +sum);
		} else if (random < random2) {
			for(int i = random + 1; i < random2; i++) {
				sum += i;
			}
			System.out.println("두 수 사이의 합 : " +sum);
		} else {
			System.out.println("두 수 사이의 합이 존재하지 않습니다.");
		}
		
		
	}

}
