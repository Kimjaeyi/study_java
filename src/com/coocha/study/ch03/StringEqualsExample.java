package com.coocha.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		//String은 주소값을 비교하기 때문에 str1과 str2는 같은 값으로 계산되지만,
		//연산자를 통해 생성한 String은 다른 주소값에 생성되므로 다른 값으로 계산된다.
		//따라서 문자열 비교는 등호(==)가 아닌 변수1.equals(변수2)를 사옹.
		
		String str1 = "김재이";
		String str2 = "김재이";
		String str3 = new String("김재이");
		
		boolean result1 = (str1 == str2);
		System.out.println("result = " + result1);
		
		boolean result2 = (str1 == str3);
		System.out.println("result2 = " + result2);
		
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
	}

}
