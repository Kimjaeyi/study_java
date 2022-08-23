package com.coocha.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int resultPlus = arithmetic.plus(1,12);
		
		int resultMinus = arithmetic.minus(26,12);
		
		int resultMulti = arithmetic.multi(5,6);
		
		int resultDivide = arithmetic.divide(8,4);
		
		int resultRemind = arithmetic.remind(18,11);
		
		arithmetic.say(resultPlus);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMulti);
		arithmetic.say(resultDivide);
		arithmetic.say(resultRemind);
	}

}
