package com.coocha.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 5;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("1도 2도 아닌 정수입니다.");
				break;
		}
		
		String position = "사원";
		switch (position) {
			case "사원":
				System.out.println("연봉은 5,000입니다.");
				break;
			case "대리":
				System.out.println("연봉은 6,000입니다.");
				break;
			case "과장":
				System.out.println("연봉은 7,000입니다.");
				break;
			case "부장":
				System.out.println("연봉은 8,000입니다.");
				break;
			case "사장":
				System.out.println("연봉은 10,000입니다.");
				break;
			default:
				System.out.println("인턴은 최저시급 :(");
				break;
		}
	}

}
