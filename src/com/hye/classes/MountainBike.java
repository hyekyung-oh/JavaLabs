package com.hye.classes;

public class MountainBike extends Bicycle {
    
    // MountainBike 하위 클래스는 하나의 필드를 가집니다.
    public int seatHeight;
    
    public MountainBike() {};
    
    public MountainBike(int cadence, 
    		int gear,
    		int speed, 
    		int seatHeight) {
    	super(cadence, gear, speed);
    	
    	this.seatHeight = seatHeight;
    	
    }

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

//    // MountainBike 하위 클래스는 하나의 생성자를 가집니다.
//    public MountainBike(int startHeight, int startCadence,
//                        int startSpeed, int startGear) {
//    	
//    	// 자식 클래스가 부모 클래스의 생성자(컨스트럭터)를 상속받지 않습니다.
//    	// 하지만 자식 클래스의 생성자에서 명시적으로 부모 클래스의 생성자를 호출할 수 있습니다
//        //////////////////////////////////////////////
//    	super(startCadence, startSpeed, startGear);
//    	//////////////////////////////////////////////
//    
//        seatHeight = startHeight;
//    }   
//        
//    // MountainBike 하위 클래스는 하나의 메서드를 가집니다.
//    public void setHeight(int newValue) {
//        seatHeight = newValue;
//    }
//    
//    //@Override
//    public void helloWorld() {
//    	System.out.println("MountainBike HelloWorld Method!!!");
//    }
//    
    /* MountainBike 클래스의 내부 클래스인 innerClass는 
    / 멤버 엑세스 제어자로 private, public 가능 */
//    private class innerClass {
//    	
//    }
    
}
