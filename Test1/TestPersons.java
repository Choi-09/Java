package Test1;

abstract class Person {
	private String pnum;
	private String name;
	private int age;

	public Person(String pn, String name, int a) {
		this.pnum = pn;
		this.name = name;
		this.age = a;
	}

	public abstract void show();	
	public String toString() {
		return " 번호 : " + pnum + "이름 : " + name + "나이 :" + age;
	}
}

abstract class Employee extends Person {
	private String job;
	private String dept;
	private double salary;
	public Employee(String pn, String name, int a, String ej, String d, double sal) {
		super(pn, name, a);
		job = ej;
		dept = d;
		salary = sal;
	}
		
	public void increase(int j, double sal) {		
	}

	public void show() {
		System.out.println(toString());
	}
	
	public String toString() {
		return super.toString() + " 직장 : " + job + "부서 : " + dept + "월급 :" + salary;
	}	
}

class Designer extends Employee {
	private String language;
	private int workYear;
	public Designer(String pn, String name, int a, String dj, String d, double sal, String l, int wy) {
		super(pn, name, a, dj, d, sal);
		language = l;
		workYear = wy;
	}
	
	public void show() {
		System.out.println(toString());
	}
	
	public String toString() {
		return super.toString() + "언어 : " + language + "근무년차 : + " + workYear;
	}
}


abstract class Student extends Person {
	private String schoolName;
	private int schoolYear;
	private int scholarship;
	public Student(String pn, String name, int a, String sn, int sy, int ss) {
		super(pn, name, a);
		schoolName = sn;
		schoolYear = sy;
		scholarship = ss;
	}

	public void show() {
		System.out.println(toString());
	}
	
	public String toString() {
		return super.toString() + " 학교명 : " + schoolName + "학년 : " + schoolYear + "장학금 :" + scholarship;
	}
}

class WorkStudent extends Student {
	private String Job;
	private int dayPay;
	public WorkStudent(String pn, String name, int a, String sn, int sy, int ss, String sj, int dp) {
		super(pn, name, a, sn, sy, ss);
		Job = sj;
		dayPay = dp;
	}

	public void show() {
		System.out.println(toString());
	}
	
	public String toString() {
		return super.toString() + "직업 : " + Job + "일급 : " + dayPay;
	}
}


public class TestPersons {
	
	static void showAll(Person[] p) {
		for (int i = 0; i < 4; i++)
			p[i].show();		
	}
	
//	static void increaseAll(Person[] p,int j, double sal, int workYear) {
//		for(j = 1; j >=workYear; j++) {
//			sal = sal + sal*0.1*j;
//			p[j].increase();
//		}		


	static void getData(Person[]p) {
//		Employee e = ("p01", "Hong", 32, "DB", "Design", 20000);
		Designer d = new Designer("p01", "Hong", 32, "DB", "Design", 20000, "Korean", 5);
//		Student s = new Student("p02", "Park", 21, "부산대", 2, 5000);
		WorkStudent ws = new WorkStudent("p02", "Park", 21, "부산대", 2, 5000, "CR", 1500 );
//		p[0] = e;
		p[1] = d;
//		p[2] = s;
		p[3] = ws;
	}

	public static void main(String[] args, Person[][] p) {
		Person[]setPerson = new Person[4];
		getData(setPerson);
		d.show();
//        increaseAll(setPerson);
	}
}
