package com.hye.classes.inheritances.interfaces.commonancestor;

public interface OperateCar {
    // ...
    default public int startEngine() {
        // Implementation
    	return 0;
    }
}
