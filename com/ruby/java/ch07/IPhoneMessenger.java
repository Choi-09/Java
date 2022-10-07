package com.ruby.java.ch07;

public class IPhoneMessenger implements Messenger{
	public String getMessage() {
		return "IPhone";
	}
	public void setMessage(String msg) {
		System.out.println("iphone message: " + msg);
	}
	public void clearMessage() {
		System.out.println("iphone cleard");
	}
}
