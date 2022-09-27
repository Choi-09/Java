package com.ruby.java.ch06;

//Person이라는 클래스를 다른파일 만들지 않고 사용하고 싶을 때 public하지않고 클래스 설정
class Person1 { 
	private String name;
	private int age;
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
}
//한 클래스에서는 하나의 파일만 퍼블릭.
public class Employee1 {
	private String name;
	private int age;
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	

	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.setAge(10);
		Employee1 s = new Employee1();
		s.setName("Hello");
		System.out.println("나이:" + e.getAge());
		System.out.println("이름: " + s.getName());
		
		Student2 s2 = new Student2();
		s2.setAge(30);
		s2.setName("Mary");
		System.out.println("age = " + s2.getAge());
		System.out.println("name = " + s2.getName());
	//해당 클래스에서 Student2를 불러올 수 있는 이유는
	//Student2가 같은 패키지 안에 들어가있기 때문이다.
	}
}



	


