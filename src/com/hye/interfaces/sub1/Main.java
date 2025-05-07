package com.hye.interfaces.sub1;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void compareArea() {
		
		List<String> li;
		
		List<String> list = new ArrayList<>();
		// ArrayList가 List 인터페이스를 구현했기 때문에 
		//List 인터페이스 타입으로 받을 수 있음.
		
		Iterable<String> iterable = (List<String>)list;
		// List 인터페이스는 Collection 인터페이스를 상속받는데, 
		// 이 Collection 인터페이스는 다시 Iterable 인터페이스를 상속받음.
		// 따라서 Iterable 인터페이스 타입으로 받을 수 있다.
		

		
		Point pi = new Point(40, 40);
		Point pi2 = new Point(40, 40);
		
		Relatable rectangleRel = new RectanglePlus(
				pi, 
				40, 40);
		
		Relatable circleRel = new CirclePlus(pi, 20);
		////////////////////////////////////////////////
		Relatable.findSmallest(rectangleRel, circleRel);
		////////////////////////////////////////////////	
		
		
		RectanglePlus rectanglePlus = new RectanglePlus(
				pi, 
				40, 40);
		CirclePlus circlePlus = new CirclePlus(pi, 20);
		////////////////////////////////////////////////
		Relatable.findSmallest(rectanglePlus, circlePlus);		
		
		////////////////////////////////////////////////
		Relatable.findSmallest((Object)rectanglePlus, (Object)circlePlus);		
	}
	
	public static void main(String[] args) {
		
		compareArea();
		
	}

}
