package com.hye.generics.typeinference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxDemo {
	
	static {
		// Map<K,V>
		// HashMap<K,V>
		Map<String, List<String>> myMap = new HashMap<String, List<String>>();
		// Map<String, List<String>> myMap = new HashMap<>();
		
		// <> 쓰지 않은 타입 아규먼트를 지정하지 않은 것을 raw(원시) 타입이라고 함.
		// 원시 타입은 타입 유추를 하지 않음. 따라서 이와 같이 쓰는 것은 절대 권장하지 않음.
		// Map<String, List<String>> myMap = new HashMap(); // unchecked conversion warning
	}
	
	// BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
	// BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
	// BoxDemo.addBox(Integer, List<Box<Integer>>);
	
	public static <U> void addBox(U u, List<Box<U>> boxes) {
		Box<U> box = new Box<>();
	    box.set(u);
	    boxes.add(box);
	}
	
	public static <U> void outputBoxes(List<Box<U>> boxes) {
		int counter = 0;
	    for (Box<U> box: boxes) {
	      U boxContents = box.get();
	      System.out.println("Box #" + counter + " contains [" +
	             boxContents.toString() + "]");
	      counter++;
	    }
	}

	public static void main(String[] args) {
		// ArrayList 엘리먼트는 Box<Integer>...
		// ArrayList의 타입 파라미터의 아규먼트는,
		// 파라미터화된 타입인 Box<Integer>를 지정함!
		ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
		// List<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
		  
		// Integer.valueOf 메서드는 Integer 클래스 컨스트럭터를 호출함
		// addBox의 1st 아규먼트는 Integer Class의 인스턴스 참조값
		//		 	2nd 아규먼트는 ArrayList 인스턴스에 대한 참조값
		BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
	    BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		BoxDemo.outputBoxes(listOfIntegerBoxes);
	  }
}
