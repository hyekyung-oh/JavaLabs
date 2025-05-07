package com.hye.classes;

public class ScopeMain {
	
	// ScopeMain 클래스 변수인 scopeMainStr의 scope ?
	// 프로그램이 종료될 때까지 모든 곳에서 사용 가능
	// 	ScopeMain 클래스 코드가 자바 VM에서 가비지컬렉션으로 넘겨지기 전까지
	public static String scopeMainStr = "Scope Problem";
	
	public static void whatIsScope() {
		int a = 0; // local/Auto 변수...
	}
	
	public static void main(String ...args) {
		// main 메서드 내에서 변수 a 사용 불간
		// a = 1;
	}

}
