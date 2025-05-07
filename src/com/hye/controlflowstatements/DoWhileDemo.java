package com.hye.controlflowstatements;

public class DoWhileDemo {
	
    public static void main(String[] args){
        
    	int count = 1;
        
    	do {
    		
            System.out.println("Count is: " + count);            
            count++; 
            
        } while (count < 11); // 첫번째 반복시에 while 조건식 값이
    						  // false가 되더라도
    						  // 한번은,,, do...while 블럭의 스테이트먼트가 수행됨
    
    }

}
