package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울"); 
		list.add("북경"); 
		list.add("상해");
		list.add("서울"); 
		list.add("도쿄"); 
		list.add("뉴욕");
	
//		반복문으로 리스트 출력 (list가 6개니까 lsit.size(6)보다 작은 index5까지 출력(0~5))	
//		for(int i = 0; i <list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
//		리스트 index1에 LA추가 후 리스트 출력
		list.add(1,"LA"); print(2,list);

//		"서울"의 인덱스
		System.out.println("3 :" + list.indexOf("서울"));
		
//		중복되는 "서울" 중 마지막 인덱스
		System.out.println("4 :" + list.lastIndexOf("서울"));

//		리스트에서 LA 삭제 후 리스트 출력
		list.remove("LA"); print(5, list);
		
//		리스트의 인덱스2(상해) 삭제 후 출력
		list.remove(2); print(6,list);
		
//		리스트에 LA가 있나요? : 없으므로 false
		System.out.println("7: " + list.contains("LA"));
		
//		toArray 메서드: ArrayList의 데이터를 배열로 변환.
		Object obj[] = list.toArray();
		System.out.println("8: " + Arrays.toString(obj));
		
//		Object타입이 아닌 원하는 타입의 배열이 필요할 때는 인자값으로 특정 타입의 배열을 전달한다.
//		toArray(cities)는 cities가 String타입이므로 list의 데이터들을 String 타입으로 변환하여 배열에 저장
//		배열의 크기보다 ArrayList의 크기가 클 때는 자동으로 배열의 크기가 변경되므로 new String[0]으로 배열 생성
//		↓ 이 부분 이해가 잘안됨!
		String cities[] = new String[0];
		cities = list.toArray(cities);
		System.out.println("9 :" + Arrays.toString(cities));
		
		
	}
	public static void print(int n, List<String> list) {
		System.out.println(n + ":" + list);
	}
}
