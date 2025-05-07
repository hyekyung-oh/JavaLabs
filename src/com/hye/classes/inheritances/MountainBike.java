package com.hye.classes.inheritances;

//Implicit super constructor Bicycle() is undefined for default constructor.
//Must define an explicit constructor

public class MountainBike extends Bicycle {
	
	private int a;
	private int b;
	
	public int cadence;
	
	
	// sub class의 컨스트럭터가 호출될 때,
	// 무조건 부모 클래스의 디폴트 컨스트럭터가 호출됨!!!
	
	// explicit, 명시적으로 디폴트 컨스트럭터를 정의!!!
	public MountainBike() {}
	
	public MountainBike(int startCadence, int startSpeed, int startGear,
						int a, int b) {
		super(startCadence, startSpeed, startGear);
		
		this.a = a;
		this.b = b;
		super.cadence = 0;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getCadence() {
		return b;
	}

	public void setCadence(int cadence) {
		this.cadence = cadence; // Moutain 클래스의 필드 cadence
		super.cadence = cadence; // Bicycle 클래스의 필드 cadence
	}
	
	public static void main(String args[]) {
		MountainBike mountainBike = new MountainBike();
		
		mountainBike.cadence = 1;
		mountainBike.applyBrake(0);
		
		return;
	}
    
}