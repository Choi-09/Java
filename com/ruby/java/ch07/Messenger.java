package com.ruby.java.ch07;

public interface Messenger {

	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;

	public abstract String getMessage();

	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) {
		log();
		if (login) {
			System.out.println("로그인 성공.");
		} else {
			System.out.println("로그아웃 완성");
		}
	}

//	static: 객체와 무관하게 불러갈수있다.
	public static void getConnection() {
		System.out.println("network에 연결합니다.");
	}

	private void log() {
		System.out.println("start job!");
	}
}

// abstract class가 아닌 interface로 작성하는 이유
/* 
 1) abstract class: 다중상속 안됨
 2) interface는 다중상속 가능, */