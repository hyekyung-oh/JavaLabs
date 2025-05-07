package com.hye.classes.inheritances.overrides;

//하위 클래스 Dog
public class Dog extends Animal {
	 // 메서드를 재정의 (override)
	 // 역할 : 부모 클래스로부터 상속받은, 
	 // 	  예를 들어, Animal 클래스의 speak 메서드를 재정의하겠다. 라는 의미
	// "충분히 유사한 기본 동작(close enough)"을 바탕으로
	// : 슈퍼 클래스의 Speak 메서드와 충분히 유사한 기본 동작
	// Dog 클래스의 speak 메서드의 필요에 따라 동작을 구체화하거나 변경하였다.
	 @Override 
	 public Dog speak() {
		 super.speak();
		 
	     System.out.println("Dog barks");
	     return this;
	 }
}
