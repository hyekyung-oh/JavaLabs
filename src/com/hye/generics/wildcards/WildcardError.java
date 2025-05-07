package com.hye.generics.wildcards;

import java.util.List;

public class WildcardError {
/*
    void foo(List<?> i) {						// CAP#1
    	// i.get(0) -> Element : 알 수 없는 타입 : capture#1-of 
    	// i.set(0, capture#2-of)
        i.set(0, i.get(0)); // The method set(int, capture#1-of ?) 
                            // in the type List<capture#1-of ?> 
                            // is not applicable for the arguments (int, capture#2-of ?)
        
    }
*/
	<T> void foo(List<T> i) {
		i.set(0, i.get(0));
	}
	
	
//	void foo(List<?> i) {
//		i.set(0, i.get(0));
//	}
//	
	
//	void foo(List<?> i) {
//		// fooHelper 메서드는 제너릭 메서드...
//		// 즉 타입 파라미터의 아규먼트를 유추해야 함!!!
//		// i가 List<?>...
//        fooHelper(i);
//    }
//    
//    // Helper method created so that the wildcard can be captured
//    // through type inference.
//    private <T> void fooHelper(List<T> l) {
//        l.set(0, l.get(1)); // 테스트를 위해 0번째 엘리먼트를 1번째 엘리먼트로 set하는 코드로 변경함
//    }
	
    
}