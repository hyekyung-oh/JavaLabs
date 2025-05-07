package com.hye.generics;

// T를 타입 파라미터라고
public class Box<T> {
	
    private T t; // t를 타입 변수

    public void set(T object) { this.t = object; }
    public T get() { return t; }
    
    public /*static*/ <K extends Number> byte hello(K k) {
    	return k.byteValue();
    }
    
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        integerBox.inspect(Integer.valueOf(1));
        integerBox.inspect(Double.valueOf(1));
//        integerBox.inspect(8);
//        integerBox.inspect((byte)3);
//        integerBox.inspect("100");
          // 타입 파라미터 상한 제한으로 컴파일 타임 때 강력한 타입 검사를 실시한 결과!!!
//        integerBox.inspect("some text"); // 에러: 여전히 String입니다!
    }
    
}

/*
public class Box {
	
    private Object object; // object를 타입 변수

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
*/