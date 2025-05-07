package com.hye.classes.anonymous;

public class HelloWorldAnonymousClasses {
	
	public void sayGoodBye() {		
	    HelloWorld goodbye = new HelloWorld() {
	    		    	
            String name = "John";
            public void greet() {
                greetSomeone("goodbye");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("goodbye " + name);
            }
	     };
	}
	
	// sayHello 메서드 안에서 HelloWorld 인터페이스를 구현하였음
	// : 굳이 익명 클래스를 왜 사용하는지?
	// 특정 메소드 내에 국한되는 내용을 구현하기 위함.
	public void sayHello() {		
		// new HelloWorld(): 익명 클래스 객체를 만드는 문법
		// 인터페이스 이름을 클래스 컨스트럭터 호출식처럼 사용하고 있음.
	    HelloWorld frenchGreeting = new HelloWorld() {
	    		    	
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
	     };
	        
	     HelloWorld spanishGreeting = new HelloWorld() {
	    	 
             String name = "mundo";
             public void greet() {
                 greetSomeone("mundo");
             }
             public void greetSomeone(String someone) {
                 name = someone;
                 System.out.println("Hola, " + name);
             }
	     };
	
//	    englishGreeting.greet();
	    frenchGreeting.greetSomeone("Fred");
	    spanishGreeting.greet();
	}

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }            

}

