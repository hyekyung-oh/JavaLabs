package com.hye.classes.inheritances.interfaces;

public class Pegasus extends Horse implements Flyer, Mythical {
	
    public static void main(String... args) {
    	
    	// 우선 순위
    	
    	/* Horse
    	public class Horse {
    	    public String identifyMyself() {
    	        return "I am a horse.";
    	    }
    	} */
    	
    	/* Flyer 
    	public interface Flyer {
    	    default public String identifyMyself() {
    	        return "I am able to fly.";
    	    }
    	} */
    	
    	/* Mythical
    	public interface Mythical {
    	    default public String identifyMyself() {
    	        return "I am a mythical creature.";
    	    }
    	} */
    		
        Pegasus myApp = new Pegasus();
        String str = myApp.identifyMyself();
        System.out.println(str);
        
    }
    
}