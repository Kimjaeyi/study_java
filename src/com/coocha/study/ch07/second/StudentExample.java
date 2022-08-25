package com.coocha.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		//명시적 생성자를 사용하여 객체를 생성하고
		//모듈 필드를 출력하시오
		
		People people = new People("홍길동", "1111-1111");
		System.out.println(people.name);
		System.out.println(people.ssn);
		
		System.out.println("----------------");
		
		Student student = new Student("김재이", "1234-5678", 6 );
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
	}

}
