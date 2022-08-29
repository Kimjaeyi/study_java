package com.coocha.study.ch07.fifth;

public class Child extends Parent {

	@Override
	public int getSum(int num[]) {
		sum = (num[0] * num[1]) + num[2] + 10;
		
		return sum;
	}
}
