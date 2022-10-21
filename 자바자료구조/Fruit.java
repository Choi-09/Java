package 자바자료구조;

public class Fruit implements Comparable<Fruit> {
	    private String name;			//Fruit 데이터 정의
	    private int price;
	    public Fruit(String name, int price) {	//생성자
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "<" + name + ", "+ price+ ">";	//문자열로 반환하는 메서드
	    }
	    
		@Override   //Q. name 내림차순으로 정렬해보자
		public int compareTo(Fruit o) {
			if (this.price < o.price) return -1; //가격순으로 내림차순 
			else if (this.price > o.price) return 1;
//			else if(this.name.compareTo(o.name)<0) return -1;
//			else if(this.name.compareTo(o.name)>0) return 1;
			else return 0;

		}
	
}