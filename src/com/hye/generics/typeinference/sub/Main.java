package com.hye.generics.typeinference.sub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	static {
		
	}
	
	public static void process2() {
		// emptyList 메서드는 결과적으로 다음의 인스턴스를 생성하는데
		// new EmptyList<>(); -> 문제는 EmptyList의 타입 아규먼트가 생략되어 있음...
		// 그래서, EmptyList의 타입 파라미터의 타입 아규먼트를 추론해야 함!!!
		List<String> listOne = Collections.emptyList();
		// List<String> listOne = EMPTY_LIST;
		
		listOne.add("korea");
		listOne.add("usa");
		String korea = listOne.get(0);
		String usa = listOne.get(1);
		
		System.out.println("Good-Bye");
	}
	
	

//	public static List process(List list) {
//		
//		Object obj = "Hello";
//		list.add("hello"); 
//		
//		return list;
//	}
	
	public static <T> List<T> process(List<T> list) {
		
		Object obj = "Hello";
		//list.add("hello"); // 문제가 발생함...
		//
		if(list.isEmpty()) {
			System.out.println("Empty list...");
		}
//		Object getRet = list.get(0); // outOfBoundsCheckIndex
//		if (getRet == null) 
//			System.out.println("Null...");
		
		return list;
	}
	
    public static void main(String[] args) {
    	// ArrayList의 타입 아규먼트를 추론할 수 없음..
    	// var는 기본 데이터 타입(int, double ...)과 
    	// 참조 타입(String, 즉 class 또는 인터페이스) 모두 사용할 수 있음.
    	var result = process(new ArrayList<>());
    	
    	// 일반적인 사용: T와 같은 타입 전달
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox);

        // 제너릭 생성자 사용: U → T로 변환
        // T convert(U input); <--- Converter의 가상 메서드
        // 메서드 참조도 인터페이스 구현체이다 !!! 
        // 다음 Box 컨스트럭터의 두번째 아규먼트는 Converter 인터페이스 구현체를 전달해야 함.
        
        // 제너릭 클래스 Box를 인스턴스화 하는 코드
        // T 파라미터의 argument : Integer
        // U 파라미터의 argument : String
        // T convert(U input);
        // <U> Box(U input, Converter<U, T> converter)
        Box<Integer> intBox = new Box<>("123", Integer::parseInt);
        Box<Integer> intBox2 = new Box<>("456", Integer::parseInt);
        
        System.out.println(intBox);

        // 제너릭 생성자 사용: Double → String
        // Box, T 파라미터의 argument : string
        // Con, U 파라미터의 argument : Double
        // T convert(U input);
        Box<String> doubleToStringBox = new Box<>(3.14, Object::toString);
        System.out.println(doubleToStringBox);
    
        
        
        // return (List<String> EMPTY_LIST;
        // Java SE 7 and 8: Using target type inference
        List<String> listOne = Collections.emptyList();
        System.out.println("listOne: " + listOne);
        
        // return (List<Integer>) EMPTY_LIST;
        List<Integer> listTwo = Collections.emptyList();

        List<Box<Integer>> listThree = Collections.emptyList();

//        listThree.add(intBox);
//        listThree.add(intBox);
        
//        // Using type argument in Java SE 7 and 8
//        List<String> listTwo = Collections.<String>emptyList();
//        System.out.println("listTwo: " + listTwo);
//
//        // Java SE 7: Type argument is required
//        processStringList(Collections.<String>emptyList()); // This works in both Java SE 7 and 8
//
//        // Java SE 8: Target type inference allows omitting type argument
//        processStringList(Collections.emptyList()); // This works in Java SE 8
        
    }
    
}
