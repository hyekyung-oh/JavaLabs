package com.hye.classes.inheritances.interfaces.commonancestor;

public interface EggLayer extends Animal {
	
	// override!!!
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
    
}