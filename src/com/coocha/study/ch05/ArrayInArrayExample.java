package com.coocha.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] scores = {{12, 24, 48}, {26, 86, 92}, {48, 56, 93}, {27, 29, 86}, {55, 66, 77}};
		
		System.out.println("scores[1][1]: " + scores[1][1]);
		System.out.println("--------------------");
		
		String name[] = {"홍길동", "김재이", "정우성", "이정재", "장원영"};
		String subject[] = {"국어", "수학", "영어"};
	
		
//		1. 개인의 평균
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
		
//		2. 과목별 평균
		
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
		int[] sum2 = new int[3];
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum2[j] += scores[i][j];
			}
		}
		
		for(int i=0; i<sum2.length; i++) {
			System.out.println(subject[i]+ " 과목의 평균 점수는 : " +((double)sum2[i]/scores.length));;
		}
		
		// 점수 리버스&트레이드
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				
			}
		}
	
	}
}
