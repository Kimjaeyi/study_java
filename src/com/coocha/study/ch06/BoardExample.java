package com.coocha.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board = new Board();
		
		Board board2 = new Board("홍길동");
		Board board3 = new Board("도경수", 121212);
		Board board4 = new Board("이승현", false);
		Board board5 = new Board("고은경", 3213, true);
		
		board.say();
		board2.say();
		board3.say();
		board4.say();
		board5.say();
	}

}
