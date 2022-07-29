package com.coocha.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
//		작은 형이 큰 형으로 변환하는 것은 문제 발생x
//		큰 형이 작은 형으로 변환은 문제가 생기거나 변환이 이뤄져도 데이터 손실 발생
//		byte < short < int < long < float < double
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);

//		----------
		
//		int intValue2 = 1234567890;
//		System.out.println("intValue: " + intValue);
//		
//		byte byteValue2 = (byte) intValue2;
//		System.out.println("byteValue2: " + byteValue2);
		
		int intValue3 = 200;
		System.out.println("intValue3: " + intValue3 + "입니닷");
		
		double doubleValue = intValue3;
		System.out.println("doubleValue: " + doubleValue + "입니다");
		
	}

}
