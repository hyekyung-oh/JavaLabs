package com.hye.classes.inheritances.interfaces.commonancestor;

public interface FlyCar {
    // ...
    default public int startEngine() {
        // Implementation
    	return 0;
    }
}
