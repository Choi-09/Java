package com.ruby.java.ch08.innerClass;

public class MessangerTest {

	public static void main(String[] args) {
		
		Messanger test = new Messanger() {
			
			public void setMessage(String msg) {
				System.out.println("test에서 메시지를 설정합니다." + msg);
			}
			
			public String getMessage() {
				return "test";
			}
		};
		
		System.out.println(test.getMessage());
		test.setMessage("have a great day!");
	}

}
