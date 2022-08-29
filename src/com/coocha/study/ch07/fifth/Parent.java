package com.coocha.study.ch07.fifth;

import java.util.Arrays;

public class Parent {
	
	int[] num = new int [3];
	int sum = 0;
	
	public void arr(int num[]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[i] < num[j]) {
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
	}
	
	public int getSum (int num[]) {
		sum = (num[0] * num[1]) + num[2];
		return sum;
	}
	
	public void printArr(int num[]) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " ");
		}
		System.out.println(" ");
	}
	
}
