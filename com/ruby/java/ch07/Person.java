package com.ruby.java.ch07;

class ProcessPerson {
	private String pno;
	private String pname;
	private int age;
	public ProcessPerson() {
		System.out.println("defaul 생성자");
		pno = null;
		pname = null;
		age = 0;
	}
	public ProcessPerson(String pn) {
		this();
		pno = pn;
	}
	public ProcessPerson(String pn, String name) {
		this(pn);
		pname = name;
	}
	public ProcessPerson(String pn, String name, int a) {
		this(pn, name);
		age = a;
	}
	
//	public String getPno() {
//		return pno;
//	}
//	public void setPno(String pn) {
//		this.pno = pn;
//	}
//	public String getPname() {
//		return pname;
//	}
//	public void setPname(String name) {
//		this.pname = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int a) {
//		this.age = a;
//	}
	public void show() {
		System.out.println("주민번호 = " + pno + " / " + "이름 = " + pname + " / "+ "나이 = " + age);
	}
}

class Student extends ProcessPerson {
	String schoolName;
	int schoolYear;
	public Student(String pn, String name, int a, String sname, int syear) {
		
		super(pn, name, a);
		this.schoolName  = sname;
		this.schoolYear = syear;
	}

	public void show() {
		super.show();
//	오버로딩↓ 상속관계일때만 적용 (상속아닐 땐 오버라이딩)
		System.out.println("학교이름 = " + schoolName + " / " +"학년 = " + schoolYear);
	}
	public String toString() {
		return super.toString() + "schoolName = " + schoolName;
	}
	public void show(int a) {
		super.show();
		System.out.println(toString());
	}
}

class WorkStudent extends Student {
	private String job;
	private int salary;	
//	public WorkStudent() {job = null; salary =0;}
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		
		super(pn, name, a, sname, syear);
		this.job = j;
		this.salary = pay;
	}
	
	public void show() {
		super.show();
		System.out.println("직업 = " + job + " / " + "급여 = " + salary);
	}
}

public class Person {

	public static void main(String[] args) {
		ProcessPerson pp = new ProcessPerson();
		ProcessPerson pp1 = new ProcessPerson("p001", "Kim", 23);
		ProcessPerson pp2 = new ProcessPerson("p001", "Hong", 30);		
		ProcessPerson pp3 = new ProcessPerson("p003", "Lee", 20);		
		WorkStudent ws = new WorkStudent("p001", "Hong", 30, "부산대", 3, "학생", 1000);	
		Student s = new Student("p004", "Lee", 20, "신라대", 3);
		pp1.show();
		ws.show();
		s.show();
	}	
	
}


