package com.coocha.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
//		byte < short < int < long < float < double
//		----------> 자동 형변환(promotion) : 문제 없이 형 변환 가능
//		<---------- 강제 형변환(casting) : 변환이 가능할 순 있으나 데이터 손실 발생
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		short shortValue = byteValue;
		System.out.println("shortValue: " + shortValue);
		
		int intValue = shortValue;
		System.out.println("intValue: " + intValue);
		
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

//		----------
		
//		int intValue2 = 1234567890;
//		System.out.println("intValue: " + intValue);
//		
//		byte byteValue2 = (byte) intValue2;
//		System.out.println("byteValue2: " + byteValue2);
		
//		int intValue3 = 200;
//		System.out.println("intValue3: " + intValue3 + "입니닷");
//		
//		double doubleValue = intValue3;
//		System.out.println("doubleValue: " + doubleValue + "입니다");
		
	}

}
