package com.hye.classes;

public class Main {

	public static void main(String[] args) {
		
		// console은 standard out[리눅스 용어] 이라고 함
		// 다음의 println 메서드는 문자열을 콘솔에 출력하는 메서드임
		// %d : d는 Decimal(십진수를 의미)
		System.out.printf("My age is %d %s \n\n", 51, "bye");
		System.out.printf("My age is 0x%x\n\n", 51);
		System.out.printf("원주율 %f\n\n", Math.PI);
		
		System.out.printf("Hello %s", "World");
		System.out.printf("Good-%s", "Bye");
		System.out.printf("\n\n");
		
		System.out.printf("Hello %s\n", "World");
		System.out.printf("Good-%s\n", "Bye");
		
		System.out.println();
		System.out.println("Hello World");
		System.out.println("Good-Bye");
		
	}

}
