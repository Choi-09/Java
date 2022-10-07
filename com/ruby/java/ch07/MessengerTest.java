package com.ruby.java.ch07;

public class MessengerTest {

	public static void main(String[] args) {
		IPhoneMessenger iphone = new IPhoneMessenger();
//		GalaxyMessenger galaxy = new GalaxyMessenger();
//		Messenger m = new Messenger(); : Messenger가 인터페이스이기 때문에 객체화 x
		Messenger.getConnection();
//		↓iphone.getMessage(); 출력 
		System.out.println(iphone.getMessage());
	}

}
 