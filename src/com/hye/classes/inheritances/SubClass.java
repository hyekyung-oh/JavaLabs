package com.hye.classes.inheritances;

public class SubClass extends SuperClass {
	
	public Inner inner;
	
	public void useInner() {
		Inner inner = new Inner();
		inner.showSecret();
		
		String hello = inner.getHello();
	}
	
}
