package com.ruby.java.ch14;

interface MyFunc<T> {  //<T> 제너릭 interface 사용한다고 알림
	T modify (T t);
}
public class Test06 {

	public static void main(String[] args) {

		
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();  //String 타입을 사용
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));
		
		MyFunc<Integer> mf2 = (n) -> n*2;  //람다식이 1. 익명클래스 만들고 | 2. 생성자>객체생성 | 3. 함수body 대체
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
	}

}


// int n ; : 변수선언
// Integer n; : 객체  객체를 변수로 바꾸는것: unboxing. 변수를 객체로 바꾸는것: boxing
//	int n = 10;
//Integer object1 = 10;
//object1. 

// 람다식 실행 로직

// 1. generalized 된 인터페이스를 specializing 한다.

// interface MyFunc<Integer> {
// Integer modify(Ingeter t);
// }

//2. 람다식 적용

// new MyFunc<Integer> () {
//		Integer modify(Integer t) {
//		return n*2  //Generic parameter
//		}
// }