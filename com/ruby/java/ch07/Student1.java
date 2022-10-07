package com.ruby.java.ch07;

public class Student1 implements Person1 {
	
	private String schoolName;
	private int schoolYear;
	private int scholarShip ;

	public String getPnum() {
		return "pnum";
	}
	public void setPnum(String pn) {
		System.out.println("pnum: " + pn);
	}
	
	public String getPname() {
		return "name";
	}
	public void setPname(String name) {
		System.out.println("name: " + name);
	}
	
	@Override
	public int getAge() {
		return 0;
	}
	
	public void setAge(int a) {
		System.out.println("age: " + a);
	}

	public void schoolName() {
		System.out.println("학교명 :" + schoolName);
	}	
	
	public void schoolYear() {
		System.out.println("학교명 :" + schoolYear);
	}
	
	public void scholarship() {
		System.out.println("학교명 :" + scholarShip);
	}
}
