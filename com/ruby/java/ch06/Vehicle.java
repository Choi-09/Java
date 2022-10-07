package com.ruby.java.ch06;

public class Vehicle {
	private String name;
	private int price;
	private int num;
	
	public Vehicle() {
	}
	
	public Vehicle(String name, int price, int num) {
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}

class Van extends Vehicle {
	
}