package J220922;

public class Armor01 {

	//자바에서 객체를 만들 때 private 접근제한자를 쓴다. 외부에서 접근하지못하게 막아 이후 작업시 오류 안나도록//
	
	//get,set과 헷갈리지 않게 필드명은 통상적으로 소문자를 쓴다
	private String name ; 
	private int height ;
	private int weight ;
	private String color ;
	private boolean fly;
	
	
	//get,set은 소문자, 뒤에붙는 메서드에 필드명은 대문자를 쓴다
	//우클릭 > source > generate 기능 사용하면 편리하다
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	
	}



