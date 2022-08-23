package com.coocha.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carsecond = new CarSecond();
		String color;
		
		CarSecond carsecond2 = new CarSecond("blue");
		CarSecond carsecond3 = new CarSecond("gray", 3000);
		String color2 = "Red";
		
//		System.out.println("CarSecond_color : " +carsecond.color);
		System.out.println("CarSecond2_color : " +carsecond2.color);
		System.out.println("CarSecond2_cc : " +carsecond2.cc);
		
		System.out.println("CarSecond3_color : " +carsecond3.color);
		System.out.println("CarSecond3_cc : " +carsecond3.cc);
		
	}

}
