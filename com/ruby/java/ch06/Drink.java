package com.ruby.java.ch06;

public class Drink {
	private String name;
	
	public Drink () {
		System.out.println("Drink 생성자 실행!");
	}
	public Drink(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + ":" ;
	}
}


