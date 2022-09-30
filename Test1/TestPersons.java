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

	abstract void show();
	abstract void increase();
}

class Employee extends Person {
	private String job;
	private String dept;
	private int salary;
	public Employee(String pn, String name, int a, String ej, String d, int sal) {
		super(pn, name, a);
		job = ej;
		dept = d;
		salary = sal;
	}
		public void show() {
			System.out.printf("");
		}	
		public void increase() {
			System.out.println("");
		}

}

class Designer extends Employee {
	private String language;
	private int workYear;
	public Designer(String pn, String name, int a, String dj, String d, int sal, String l, int wy) {
		super(pn, name, a, dj, d, sal);
		language = l;
		workYear = wy;
	}
}

class Student extends Person {
	private String schoolName;
	private int schoolYear;
	private int scholarship;
	public Student(String pn, String name, int a, String sn, int sy, int ss) {
		super(pn, name, a);
		schoolName = sn;
		schoolYear = sy;
		scholarship = ss;
	}

	@Override
	public void increase() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
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
}





public class TestPersons {
	static void showAll(Person[] p) {
		for (int i = 0; i < 4; i++)
			p[i].show();
	}
	static void increaseAll(Person[] p) {
		for(int i = 0; i < 4;  )
			p[i].show();
	}

	static void getData(Person[]p) {
		Employee e = new Employee("p01", "Hong", 32, "DB", "Design", 20000);
		Designer d = new Designer("p01", "Hong", 32, "DB", "Design", 20000, "Korean", 5);
		Student s = new Student("p02", "Park", 21, "부산대", 2, 5000);
		WorkStudent ws = new WorkStudent("p02", "Park", 21, "부산대", 2, 5000, "CR", 1500 );
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = ws;
	}

	public static void main(String[] args) {
		Person[]setPerson = new Person[4];
		getData(setPerson);
        showAll(setPerson);
        increaseAll(setPerson);
        showAll(setPerson);
	}
}
