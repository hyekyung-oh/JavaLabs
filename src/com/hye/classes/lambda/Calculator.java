package com.hye.classes.lambda;

public class Calculator {
	  
    interface IntegerMath {
        int operation(int a, int b);   
    }
  
    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String... args) {
    
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath muliply = (a, b) -> a * b;
        IntegerMath divider = (int a, int b) -> a / b;
        // Function<String, String> {
        // 	String apply(String t);
        /* Function<String, String> toUpper = (String s) -> {
        	String ret = s.toUpperCase();
        	return ret;
        }; */
              
        System.out.println("40 + 2 = " +
//            myApp.operateBinary(40, 2, addition));
        	myApp.operateBinary(40, 2, (a, b) -> a + b));
        System.out.println("20 - 10 = " +
//            myApp.operateBinary(20, 10, subtraction));  
        	myApp.operateBinary(20, 10, (a, b) -> a - b));        
//        System.out.println("20 * 10 = " +
//            myApp.operateBinary(20, 2, muliply));      
        System.out.println("20 * 10 = " +
                myApp.operateBinary(20, 2, (a, b) -> a * b));
//        System.out.println("20 / 10 = " +
//            myApp.operateBinary(20, 10, divider));
        System.out.println("20 / 10 = " +
            myApp.operateBinary(20, 10, (int a, int b) -> a / b));  
    }
}
