package com.coocha.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board = new Board();
		
		Board board2 = new Board("홍길동");
		Board board3 = new Board("홍길동", 1234);
		Board board4 = new Board("홍길동", false);
		Board board5 = new Board("홍길동", 1234, false);
		
		board.say();
		board2.say();
		board3.say();
		board4.say();
		board5.say();
	}

}
