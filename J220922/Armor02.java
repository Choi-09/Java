package J220922;

public class Armor02 {

	private String name ; 
	private int height ;
	private int weight ;
	private String color ;
	private boolean isFly ;
	
	public Armor02() {
		name = "John";
	}
	
	public String getName() { 
		return name;
	}
	
	public Armor02(String name) {
		this.name = name;
	}

	public Armor02(String name, int height, int weight, String color, boolean isFly) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
	}

	@Override
	public String toString() {
		return "Armor2 [name=" + name + ", height=" + height + ", weight=" + weight + ", color=" + color + ", isFly="
				+ isFly + "]";
	}

// 우클릭 > source > 	generate 활용:)
	
	}

	
