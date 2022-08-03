package com.coocha.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.println("result : " +result);
		System.out.println("result2 : " +result2);
		System.out.println("result3 : " +result3);
		System.out.println("result4 : " +result4);
		System.out.println("result5 : " +result5);
		
		double result6 = v1 / v2;
		System.out.println("result6 : " +result6);
		
		double result7 = (double) v1 / v2;
		System.out.println("result7 : " +result7);
		
		System.out.println("--------------------");
		
		double a = (double)(1*3+2)/3;
		double b = (double)5/8;
		double c = (double)(9*5+4)/5;
		
		int d = 5;
		double e = 3.25;
		double f = (double)(1*6+5)/6;
		double g = (double)12/17;
		
		double num1 = (a-b)*c;
		double num2 = d-(e-f)*g;
		
		System.out.println("num1 : " +num1);
		System.out.println("num2 : " +(int)num2);
		
		System.out.println("--------------------");
	

/*		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
	}

	 public static void sum(int a, int b, int c) {
	  
	 System.out.println(a + " + " + b + " + "+ c + " = " + (a+b+c));
	 
	 } System.out.println("--------------------");
*/	
	
	avg("홍길동",60,70,85,90,45);
	avg("박말순",50,75,70,60,70);
	avg("고장난",55,60,64,58,90);
	avg("도룡뇽",80,70,63,88,78);
	}
	
	public static void avg(String name, int english, int math, int physics, int music, int athletic) {
		
		
		System.out.println(name + "의 평균은 " + (double)(english+math+physics+music+athletic)/5 + "점입니다.");
	}

}
