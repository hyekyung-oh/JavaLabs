package com.hye.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static {
		
//		List list = new ArrayList();
//		List<String> list = new ArrayList<>();
//		List list = new ArrayList(); // 자바에서는 이렇게 사용하지 마라 : raw type
		List<String> list = new ArrayList<>();
		list.add("hello"); // 스트링을 엘리먼트로...
		// ArrayList의 엘리먼트 하나임...
//		Integer intV = (Integer)list.get(0); // Type mismatch
//		String str = (String)list.get(0);
//		String str = list.get(0);
		
		Object obj = Integer.valueOf(0); // Integer(1);
		// 다음 statement 중에 (String)
		
	}
	
	public static void getObjectOfBox(Box box) {
		String str = (String)box.get();
	}
	
	public static void setObjectOfBox(Box box) {
		Integer intV = 10;
		Double doubleV = 10.0d;
		
		box.set(intV);		 
		box.set(doubleV);	
	}
	
	public static void main(String ...args) {
		
		// 다음 statement의 <>안에 정의된 Integer를 타입 아규먼트라 함.
		// 제너릭 클래스 인스턴스를 생성(new 연산자)할 때 타입 아규먼트를 지정
		// 텅빈 꺽쇠(타입 아규먼트를 지정하지 않음)를 일명 다이아몬드 라고 함!
		// 타입 아규먼트 추론(Inference)
//		Box<Integer> box = new Box<Integer>();
////		Box<Integer> box = new Box<Integer>();
//		
//		setObjectOfBox(box);
//		getObjectOfBox(box);
		
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
		
		Box<String> box2 = new Box<>();
		// Pair의 첫번째 타입 아규먼트는?
		// : 제너릭 Box 클래스의 타입 아규먼트
		Pair<Box<String>, String> p3 = new OrderedPair<>(box2, "Hello");
	}

}
