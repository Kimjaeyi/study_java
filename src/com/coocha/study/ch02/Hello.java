package com.coocha.study.ch02;

public class Hello {

	public static void main(String[] args) {

		//데이터타입 변수명 = 값;
		
		boolean abc = true;
		boolean xyz;
		xyz = false;
		
		int width = 100;
		String name = "김재이";
		
		String title = "22만개 판매돌파! 1+3 리엔 물들임 새치커버 샴푸 450ml";
		int price = 37770;
		
		String shipping_charge = "무료배송";
		String shipping_method = "택배배송";
		int release = 3;
		
		int max = 999;
		int total = 0;
		
		int review_total = 3;
		double review_avg = 4.0;
		int qna_total = 1;
		
		System.out.println(name);
		System.out.println("name 변수에 들어가 있는 값은: " +name);
		
		System.out.println("[핫딜] " +title);
		System.out.println("상품가격 : " +price);
		
		System.out.println("배송정보 : " +shipping_charge +" / " +shipping_method +" / " +release +"일 이내 출고");
		System.out.println("최대 " +max +"개까지 구매 가능");
		System.out.println("총 상품 금액 : " +total +"원");
		
		System.out.println("총 " +review_total +"건의 후기가 있습니다.");
		System.out.println("평균 별점 : " +review_avg);
		System.out.println("상품문의 : " +qna_total);
		
		
	}
}