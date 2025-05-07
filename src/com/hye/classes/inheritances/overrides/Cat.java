package com.hye.classes.inheritances.overrides;

//하위 클래스 Cat
public class Cat extends Animal {
	 // 메서드를 재정의 (override)
	@Override
	public Cat speak() {
		super.speak();
		 
	    System.out.println("Cat meows");
	    return this;
	}
	 
	public static void testClassMethod() {
		// 상속받은 static 메서드에서는
		// super 키워드를 사용할 수 없다.
		//super.testClassMethod();
		System.out.println("The static method in Cat");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}
	
	public static void main(String[] args) {
		//Object obj = new MountainBike();
		
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        
        Animal.testClassMethod();
        Cat.testClassMethod();
        
        /////////////////////////////
        myAnimal.testInstanceMethod();
    }
}
