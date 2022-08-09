package com.coocha.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {

		//일반 : 1, 5% 할인적용
		//브론즈 : 2, 10% 할인적용
		//실버 : 3, 15% 할인적용
		//골드 : 4, 20% 할인적용
		//플래티넘 : 5, 27% 할인적용
		
		int grade = 4;
		int price = 35000;
		int discount;
		
		switch(grade) {
		case 1:
			discount = (int) (price*(1-0.05));
			System.out.println("정가 "+price +"원에서 일반회원의 할인적용가는 " +discount +"원입니다." );
			break;
		case 2:
			discount = (int) (price*(1-0.1));
			System.out.println("정가 "+price +"원에서 브론즈회원의 할인적용가는 " +discount +"원입니다." );
			break;
		case 3:
			discount = (int) (price*(1-0.15));
			System.out.println("정가 "+price +"원에서 실버회원의 할인적용가는 " +discount +"원입니다." );
			break;
		case 4:
			discount = (int) (price*(1-0.2));
			System.out.println("정가 "+price +"원에서 골드회원의 할인적용가는 " +discount +"원입니다." );
			break;
		case 5:
			discount = (int) (price*(1-0.27));
			System.out.println("정가 "+price +"원에서 플래티넘회원의 할인적용가는 " +discount +"원입니다." );
			break;
		default:
			System.out.println("해당 등급이 존재하지 않습니다.");
		}
		
	}

}
