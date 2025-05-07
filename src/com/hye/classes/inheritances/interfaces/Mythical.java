package com.hye.classes.inheritances.interfaces;

public interface Mythical {
	
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
    
}