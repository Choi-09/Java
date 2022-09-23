package J220922;

public class Exam01 {

	public static void main(String[] args) {
		
//		[객체 생성 방법] /heap에 객체를 만든다 : instance
		Armor01 armor = new Armor01();

//		[방법1]
//		armor.setName ("mark6");		
//		armor.setHeight(185);
//		armor.setWeight(78);
//		armor.setColor("red");
//		armor.setFly(true);
//		
//		String n = armor.getName();		
//		int h = armor.getHeight();
//		int w = armor.getWeight();
//		String c = armor.getColor();
//		boolean iF = armor.isFly();		
//		
//		System.out.println("name :" + n);
//		System.out.println("height :" + h);
//		System.out.println("weight :" + w);
//		System.out.println("color :" + c);
//		System.out.println("Fly :" + iF);			
		
//		[방법2]
		armor.setName("mark6");
		String n = armor.getName();
		System.out.println("name :" + armor.getName());
		
		armor.setHeight(185);
		int h = armor.getHeight();
		System.out.println("height :" + armor.getHeight());
		
		armor.setWeight(78);
		int w = armor.getWeight();
		System.out.println("weight :" + armor.getWeight());
		
		armor.setColor("red");
		String c = armor.getColor();
		System.out.println("color :" + armor.getColor());
		
		armor.setFly(true);
		boolean f = armor.getFly();
		System.out.println("fly :" + armor.getFly());
	}
	
}