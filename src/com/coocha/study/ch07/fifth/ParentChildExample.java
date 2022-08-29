package com.coocha.study.ch07.fifth;

public class ParentChildExample {

	public static void main(String[] args) {

		Parent parent = new Parent();
		
		Child child = new Child();
		
		int[] num = {8, 29, 22};
		
		System.out.println("-----정렬 전-----");
		parent.printArr(num);
		
		System.out.println("-----정렬 후-----");
		parent.arr(num);
		parent.printArr(num);
		
		System.out.println("-----parent-----");
		System.out.println(parent.getSum(num));
		
		System.out.println("-----child-----");
		System.out.println(child.getSum(num));
		
		System.out.println("-----두 결과값의 차이-----");
		System.out.println(parent.getSum(num) - child.getSum(num));
	}

}
