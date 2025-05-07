package com.hye.generics;

// Syntax Error는 아님!!!
public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    // ...
    
    public static void main(String[] args) {
    	
//    	NaturalNumber naturalNumber = new NaturalNumber(Integer.valueOf(1));
//    	naturalNumber.isEven();
    	
    	NaturalNumber<Integer> intG = new NaturalNumber<>(0);
    	
    }
}
