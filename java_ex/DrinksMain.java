package java_ex;

import java.util.ArrayList;
import java.util.List;

public class DrinksMain {


	public static void main(String []args) {

// 자식 클래스 객체 생성
//		{
//			Juice j = new Juice("오렌지쥬스", 3500);	
//			j.drink();
//			Coffee c = new Coffee("아이스 아메리카노", 2000);
//			c.drink();
//			Beer b = new Beer("카스", 4000);
//			b.drink();
//			Water w = new Water("삼다수", 1000);
//			w.drink();
//			Tea t = new Tea("녹차", 2500);
//			t.drink();
//		}
		
		
//부모 클래스 안에 자식 클래스의 객체 생성
//		{
//			Drinks[]d = new Drinks[5];
//			
//			d[0] = new Juice("오렌지쥬스", 3500);
//			d[1] = new Coffee("아이스 아메리카노", 2000);
//			d[2] = new Beer("카스", 4000);
//			d[3] = new Water("삼다수", 1000);
//			d[4] = new Tea("녹차", 2500);
//			
//			for(Drinks t : d) {
//				t.drink();
//			}
//		}
		
// 추상클래스
//		{
//			Juice j = new Juice ("오렌지쥬스", 3500);
//			Coffee c = new Coffee ("아이스 아메리카노", 2000);
//			Beer b = new Beer("카스", 4000);
//			Water w = new Water("삼다수", 1000);
//			Tea t = new Tea("녹차", 2500);
//		 
//			j.drink();
//			c.drink();
//			b.drink();
//			w.drink();
//			t.drink();
//		}
		
//	Collection (ArrayList)
		{
			List<Drinks> list = new ArrayList<>();
			
			list.add(new Juice("오렌지쥬스", 3500));
			list.add(new Coffee ("아이스 아메리카노", 2000));
			list.add(new Beer("카스", 4000));
			list.add(new Water("삼다수", 1000));
			list.add(new Tea("녹차", 2500));
			
			for(Drinks t : list) {
				t.drink();
//					↑↓
//			int size = list.size();
//			for(int i = 0; i <size; i++) {
//				unit t = list[i]
//			}
				
			}
		}
	}
}



