package J220922;

public class Exam02 {
	
	public static void main(String[] args) {
		
		//
		Armor02 ar = new Armor02();
		System.out.println("name :" + ar.getName());
		System.out.println("ar : " + ar.toString());
		
		
		Armor02 ar1 = new Armor02("홍길동");
		System.out.println("name :" + ar1.getName());
		System.out.println("ar1 : " + ar1.toString());
		
		//(String name, int height, int weight, String color, boolean isFly) {}
		Armor02 ar2 = new Armor02("홍이동", 100, 100, "RED", true);
		System.out.println("name : " + ar2.getName());
		System.out.println("ar2 : " + ar2.toString());
		
	}
}
