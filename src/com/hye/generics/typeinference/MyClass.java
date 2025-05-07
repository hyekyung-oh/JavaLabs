package com.hye.generics.typeinference;

public class MyClass<X> {
    private X x;

//    // Generic constructor
//    <T> MyClass(T t) {
//        System.out.println("Constructor called with argument: " + t);
//    }

    // Generic constructor
    <T extends X> MyClass(T t) {
        this.x = t;
        System.out.println("Constructor called with argument: " + t);
    }
    
    // Getter and setter for X
    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public static void main(String[] args) {
        MyClass<String> myClass1 = new MyClass<>("Hello");
        MyClass<Integer> myClass2 = new MyClass<>(123);
        
        int a = 3;
        Integer aN = 3;
        MyClass<Number> myClass = new MyClass<>(3); // AutoBoxing...Integer 인스턴스

        myClass1.setX("Test String");
        System.out.println("myClass1 x: " + myClass1.getX());

        myClass2.setX(456);
        System.out.println("myClass2 x: " + myClass2.getX());
    }
}
