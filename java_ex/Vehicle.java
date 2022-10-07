package java_ex;

public class Vehicle {
	
	private String name;
	private int num;
	
	public Vehicle() {
		String name;
		int num;
	}
	
	public Vehicle(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public static void main(String[] args) {
		System.out.println("vehicle");
	}
	
	public void vehicle() {
	}

}

class Sedan extends Vehicle {
	public Sedan (String name, int price) {
		super(name, price);
	}
	public void vehicle() {
		System.out.print("[Sedan]");
		super.vehicle();
		System.out.println();
	}
}

class RV extends Vehicle {
	public RV (String name, int num) {
		super(name, num);
	}
	public void vehicle() {
		System.out.println("[RV]");
		super.vehicle();
		System.out.println();		
	}
}

