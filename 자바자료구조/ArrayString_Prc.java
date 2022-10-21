package 자바자료구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayString_Prc {
	public  static String[] removeElement1(String[] arr, String item) {
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		return list.toArray(String[]::new);
	}
	public static void main(String[] args) {
		
//		String a = "hello", b = "good";
//		String tmp = "tmp";
//		tmp = a;
//		a=b;
//		b=tmp;
//		System.out.println(a);
//		System.out.println(b);

		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		
		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");
		
		list.add(3, "LA");
		
		System.out.println("City List::" );
	
		for (String city:list)
			System.out.print(city + "\t" );
		
//		Collections.sort(list);
		String cities[] = new String[0];
		cities = list.toArray(cities);
		
//		list.toArray(cities);
//		for문을 이용한 정렬
		for(int i = 0; i <cities.length; i++) {
			for(int j = i+1; j <cities.length; j++)
			if ((cities[i].compareTo(cities[j]))> 1) {
				String tmp;
				tmp = cities[i];
				cities[i] = cities[j];
				cities[j] = tmp;
			}
		}
		
		System.out.println("\n" + "정렬 후:");
//		for (String city : cities)					  //리스트 형태로 출력
//			System.out.print(city + "\t");
		System.out.println(Arrays.toString(cities));  //배열로 출력


		System.out.println("\n" + "중복제거");
		//배열을 리스트로 	
		ArrayList<String> lst = new ArrayList<String>(Arrays.asList(cities));
		int count = cities.length;
		for(int i = 0; i < count ; i++) {
				for(int j = 0 ; j <count; j++) {
				if(lst.get(i).equals(lst.get(j))) {
					lst.remove(lst.get(j));
				}
				System.out.println(lst);
				return;
				}
			}
	}
}
