package com.ruby.java.ch07;

public class GalaxyMessenger implements Messenger{
	public String getMessage() {
		return "Galaxy";
	}
	public void setMessage(String msg) {
		System.out.println("galaxy message: " + msg);
	}
	public void changeKeyboard() {
		System.out.println("galaxy keyboard");
	}

}
