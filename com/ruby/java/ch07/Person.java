package com.ruby.java.ch07;

class ProcessPerson {
	private String pno;
	private String pname;
	private int age;
	
	public ProcessPerson() {
//		System.out.println("defaul 생성자");
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
	
//	↓ 오류확인! <완료>
	public void show() {
//		super.show();
		System.out.print("직업 = " + job + " / " +"급여 = " + salary);
	}
	public String toString() {
		return super.toString() + "직업 = " + job + "급여 = " + salary;
	}
//	무조건 객체가 있어야 show 가능
//	public void show(int a) {
//		super.show();
//		System.out.println(toString());
//	}
}

public class Person {
	static void display(ProcessPerson[] pp) {
		for (int i = 0; i < 6 ; i++)
			pp[i].show();
	}

	public static void main(String[] args) {
		ProcessPerson list[] = new ProcessPerson[10];
		ProcessPerson pp = new ProcessPerson();
		ProcessPerson pp1 = new ProcessPerson("p001", "Kim", 23);
		ProcessPerson pp2 = new ProcessPerson("p002", "Hong", 30);		
		ProcessPerson pp3 = new ProcessPerson("p003", "Lee", 20);		
		WorkStudent ws = new WorkStudent("p001", "Kim", 23, "부산대", 3, "학생", 10000);	
		Student s = new Student("p003", "Lee", 20, "신라대", 1);
		
		list[0] = pp; list[1] = pp1; list[2] = pp2; list[3] = pp3; list[4] = ws; list[5] = s;
		display(list);
//		↑아래처럼 반복되는 코드를 리스트로 정리할 수 있다. upcasting.
//		pp1.show();
//		pp2.show();
//		pp3.show();
//		ws.show();
//		s.show();
	}	
	
}


