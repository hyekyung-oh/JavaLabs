package com.hye.classes.inheritances;

public class BicycleMain {
	
	public static void main(String args[]) {
		
		// "is a" 다음 statement는 성립
		Object obj = new MountainBike();
		
		// 하지만 다음과 같은 statement는 성립하지 않는다.
//		MountainBike mb = obj;
		
		SuperClass sc = new SuperClass();
		obj = sc;
		
		// 정말 나쁜 코드...하지만, 안전 장치를 장착[obj instanceof MountainBike]하면,,,
		if (obj instanceof MountainBike) { // obj가 MountainBike 인스턴스인지 아닌지를 판별해줌.
		    MountainBike myBike = (MountainBike)obj;
		} else {
			System.out.println(sc);
		}
	}

}
