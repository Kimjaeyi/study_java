package com.coocha.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{12, 24, 48}, {26, 86, 92}, {48, 56, 93}, {27, 29, 86}, {55, 66, 77}};
		
		System.out.println("scores[1][1]: " + scores[1][1]);
		System.out.println("--------------------");
		
		// 1. 개인의 평균 2. 과목별 평균
		
		String name[] = {"홍길동", "김재이", "정우성", "이정재", "장원영"};
		String subject[] = {"국어", "수학", "영어"};
	
/*		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			double avg = (double)sum/3;
			System.out.println(name[i]+"의 평균은 "+avg +"입니다.");
		}
		
		System.out.println("--------------------");
		
		for(int j=0; j<3; j++) {
			int sum = 0;
			for(int i=0; i<5; i++) {
				sum += scores[i][j];
			}
			double avg = (double)sum/5;
			System.out.println(subject[j]+"의 평균은 "+avg +"입니다.");
		}
		
		System.out.println("--------------------");
*/	
		
		// 점수 리버스&트레이드
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				
			}
		}
	
	}
}
