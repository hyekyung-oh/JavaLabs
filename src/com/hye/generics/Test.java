package com.hye.generics;

import java.util.function.Consumer;

public class Test<T extends Number> implements Consumer<T> {

	public void accept(T t) {
		return ;
	}
	
	public static void main(String args[]) {
		Test<Integer> test = new Test<>();
		Test<Integer> test2 = new Test<>();
		
		test.accept(Integer.valueOf(3));
		
		test.andThen(test);
	}
	
}
