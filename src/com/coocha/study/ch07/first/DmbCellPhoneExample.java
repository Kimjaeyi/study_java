package com.coocha.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
	
		//부모클래스 객체 생성 후 메소드 실행
		CellPhone cellphone = new CellPhone();
		cellphone.powerOn();
		cellphone.powerOff();
		cellphone.bell();
		cellphone.sendVoice("하이");
		cellphone.receiveVoice("빠이");
		cellphone.hangUp();
		
		//자식클래스 객체 생성 후 메소드 실행
		DmbCellPhone dmbcellphone = new DmbCellPhone("오마주폰", "purple", 13);
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(230);
		dmbcellphone.turnOffDmb();
		
		//자식클래스객체2 생성 후 부모 메소드 전체 호출
		DmbCellPhone dmbcellphone2 = new DmbCellPhone();
		dmbcellphone2.powerOn();
		dmbcellphone2.powerOff();
		dmbcellphone2.bell();
		dmbcellphone2.sendVoice("집가고싶다");
		dmbcellphone2.receiveVoice("미투");
		dmbcellphone2.hangUp();
	}

}
