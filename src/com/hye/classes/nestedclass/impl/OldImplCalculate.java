package com.hye.classes.nestedclass.impl;

import com.hye.classes.nestedclass.interfaces.Calculate;

// interface를 contact[계약]라고 부르기도 합니다.
// interface를 사용하는(구현하는) 구현체를 클라이언트라고 칭함.
// 이 클라이언트 입장에서는 이것이 contact[계약]임.
// why? interface에서 가상메서드를 선언함. 클라이언트는 이것에만 집중함.
public class OldImplCalculate implements Calculate{

	@Override
	public int add(int a, int b) {		
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}
	
}
