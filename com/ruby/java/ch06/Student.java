package com.ruby.java.ch06;

//순서 중요!
//② 클래스 선언
class classstudent {
	private String name;
	private int age;
	private double height;
//	↑필드
	public void getStudent(String n, int a, double h) {
		name = n;
		age = a;
		height = h;	
//	↑생성자
	}
//⑤-① 출력
	public void showStudent() {
		System.out.println("이름: " + name);
		System.out.printf("나이: %d 살\n", age);
		System.out.printf("신장: %s cm", height);
	}
}


//객체를 생성하면 값이 없기 때문에 밑에서 값을 매긴 후 위로 가져다준다.

//① 패키지만들고 
public class Student {
	public static void main(String[] args) {
//③ 클래스 호출		
		classstudent cs = new classstudent();				
//④ 함수 지정: 생성자 순서대로	
		cs.getStudent("최정인", 20, 163.5); 	
//⑤-② 출력		
		cs.showStudent();
		
	}

	
}