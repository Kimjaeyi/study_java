package com.coocha.study.ch13.third;

public class Box<T> {

	private T t;	// 지금 데이터 타입 정하지 않고 나중에 사용할 때 정하겠다.
//	private String a;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	public void out () {
		System.out.println("output");
	}
	
}
