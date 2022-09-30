package java_ex;

abstract class Drinks  {
	
//	private String name;
//	private int price;
	
//	public Drinks() {
		String name ;
		int price ;
//	}
	
	public Drinks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public abstract void drink();
//		System.out.print("%s를 마십니다. 가격은 %d원 입니다."+ name+ price);s

} 

class Juice extends Drinks {
	
	public Juice (String name, int price) {
		super(name, price);
	}
//	
	public void drink() {
		System.out.print("[JUICE]");
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.\n", name, price);
////		super.drink();
////		System.out.println();
	}
}
//
class Coffee extends Drinks {
	public Coffee (String name, int price) {
		super(name, price);
	}
//// 오버라이딩
	public void drink() {
		System.out.print("[COFFEE]");
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.\n", name, price);
////		super.drink();
////		System.out.println();
	}
}

class Beer extends Drinks {
	public Beer (String name, int price) {
		super(name, price);
	}
//
	public void drink() {
		System.out.print("[BEER]");
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.\n", name, price);
////		super.drink();
////		System.out.println();
	}
}
//
class Water extends Drinks {
	public Water (String name, int price) {
		super(name, price);
	}
//	
	public void drink() {
		System.out.print("[WATER]");
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.\n", name, price);
////		super.drink();
////		System.out.println();
	}
}
//
class Tea extends Drinks {
	public Tea (String name, int price) {
		super(name, price);
	}
//	
	public void drink() {
		System.out.print("[TEA]");
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.\n", name, price);
////		super.drink();
////		System.out.println();
	}
}




