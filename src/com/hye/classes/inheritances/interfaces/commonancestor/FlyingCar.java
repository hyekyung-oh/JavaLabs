package com.hye.classes.inheritances.interfaces.commonancestor;

public class FlyingCar implements OperateCar, FlyCar {
    
	// 인스턴스 메서드 안에서 다음과 같이 디폴트 메서드를 사용할 수 있음.
    public int startEngine() {
    	
        FlyCar.super.startEngine();
        OperateCar.super.startEngine();
        
        return 0;
    }
}
