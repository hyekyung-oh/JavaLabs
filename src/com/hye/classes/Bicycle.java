package com.hye.classes;

// 암시적으로 Object 클래스를 상속...extends 보이지 않지만, 
// 디폴트로 Object 클래스를 상속함.
// : 암시적[implicit]으로 Object 라는 슈퍼클래스
public class Bicycle {
	
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	
	// 다음의 클래스 변수(static 필드)는
	// 모든 Bicycle 클래스 객체의 인스턴스들에게 공유됨
	private static int numberOfBicycles = 0;
	
	public Bicycle() {}
	
	public Bicycle(int cadence, int gear, int speed) {
		super(); // Object 클래스의 디폴트 컨스트럭터를 호출
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
	
		// prefix 연산자 : ++
		id = ++numberOfBicycles; // 이렇게 id 값을 할당하지 않음
								 // 단지, 학습을 위해 심플하게 id 할당 코드를 적용
	}
	
	public int getCadence() {
		return cadence;
	}
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Bicycle seeWhosFastest() {
		Bicycle fastest;
		
		Number number;
		
		//ImaginaryNumber in;
		
		fastest = new Bicycle();

		// 이전까지 수업 내용들은 기본 데이터 타입의 리턴값을 리턴했는데,
		// 이번에는 참조값을 리턴한다
		return fastest;
	}

	public int getID() {
		return id;
	}
	
	

}