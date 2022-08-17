package com.coocha.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int[] scoreEnglish;
		int scoreMath[];
		
		int[] scoreChemistry = {88, 99, 45, 86, 34};
		
		String[] name = {"김재이", "정우성", "이정재"};
		
		System.out.println("김재이 화학성적 : " + scoreChemistry[0]);
		
		System.out.println("누굴까 : " + name[2]);

		System.out.println(scoreChemistry.length);
		
//		scoreChemistry의 평균을 구해서 출력하시오.
		int sum = 0;	
		
		for(int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		double avg = (double) sum / scoreChemistry.length;
		System.out.println(avg);
		
	}

}
