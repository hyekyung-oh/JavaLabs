package com.hye.interfaces;


// Relatable 인터페이스는 슈퍼 클래스(부모 클래스)로 Object 클래스를 확장(상속)
public interface Relatable /* extend Object */ {
	
    public int isLargerThan(Relatable other);
    
//    int getArea();
    
    // Generic...
    // Class Object is the root of the class hierarchy.
    // Every class has Object as a super class(부모 클래스).
    // 자바에서는 다중 상속을 지원하지 않기 때문에,
    // 두 클래스가 상속 관계에 있다라고 함은, 한 클래스는 부모 클래스이고 다른 클래스는 자식 클래스
    public static Object findLargest(Object object1, Object object2) {
 	   Relatable obj1 = (Relatable)object1;
 	   Relatable obj2 = (Relatable)object2;
 	   if (obj1.isLargerThan(obj2) > 0)
 	      return object1;
 	   else 
 	      return object2;
 	}
    
    public static Object findSmallest(Object object1, Object object2) {
    	   Relatable obj1 = (Relatable)object1;
    	   Relatable obj2 = (Relatable)object2;
    	   if ((obj1).isLargerThan(obj2) < 0)
    	      return object1;
    	   else 
    	      return object2;
    	}
}