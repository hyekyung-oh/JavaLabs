package com.hye.operators;

public class ShiftExample {
	
	public static void main(String[] args) {
		
		int a = 5, b = 10, c = 0;
		// LSB : b[0]
		// MSB : b[31]
		// a 			: 0b0000_0000_0000_0000_0000_0000_0000_0101
		// shiftLeft 	: 0b0000_0000_0000_0000_0000_0000_0000_1010
		// shiftRight 	: 0b0000_0000_0000_0000_0000_0000_0000_0010
		 
		// b[0] : 0
		// b[1] <- b[0]
		// b[2] <- b[1]
		// b[3] <- b[2]
		// b[4] <- b[3]
		// b[5] <- b[4]
		//		...
		// 버린다(오버플로우 발생) <- b[31]
		int shiftLeft = a << 1;
	    
		int shiftRight = a >> 1;
		
	    int unsignedShift = -8 >>> 1;
	    //0000_0000_0000_1000(8)
	    //1111_1111_1111_0111(8의 1의 보수)
	    //1111_1111_1111_1000(8의 2의 보수, -8)
	    //FFFF FFF8
	    //7FFF FFFC(오른쪽 시프트 1)
	    
	    return ;
//	    System.out.println("shift: << = " + shiftLeft + ", >> = " + shiftRight + ", >>> = " + unsignedShift);
	
	}

}