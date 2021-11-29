package variable;

public class Ex5 {

	public static void main(String[] args) {

		/*
		 * 형변환 = 타입변환(Type Casting)
		 * - 데이터 타입간의 변환이 일어나는 것
		 * - 기본형 끼리의 형변한과 참조형 끼리의 형변환으로 구분
		 * 
		 * 1. 묵시적 형변환(= 암시적형변환, 자동 형변환) 1 -> "1"
		 * - 작은 데이터타입에서 큰 데이터타입으로 변환하는 경우
		 *   별도의 형변환 연산자를 사용하지 않아도 "자동"으로 변환됨
		 * - 따라서, 오류가 발생하지 않으며 원본 데이터 그대로 변한됨  
		 * 
		 * 2. 명시적 형변환(= 강제 형변환)
		 * - 큰 데이터타입에서 작은 데이터타입으로 변환하는 경우
		 *   반드시 형변환 연산자를 사용하여 우변의 데이터 앞에 작은 데이터타입을 명시
		 * - 이 때, 강제 변환 과정에서 원본 데이터의 넘침(Overflow, 오버플로우)이 발생하여
		 *   원본 데이터가 아닌 다른 데이터가 저장될 수 있다.
		 * 
		 * 
		 * */
		
		int a1 = 128;
		byte a2 = 127;
		
		System.out.println("변환 전 a1(int) : " + a1 + ", a2(byte) : " + a2);
		
		// 묵시적 형변환: 작은 데이터타입 -> 큰 데이터타입으로 변환(자동)
		a1 = a2;	
//		a1 = (int)a2;	// 형변환 연산자를 사용해도되지만, 자동으로 수행하기때문에 생략 가능!
//		a2 = (byte)a1;
		System.out.println("변환 후 a1(int) : " + a1 + ", a2(byte) : " + a2);
		System.out.println("======================");
		int b1 = 128;
		byte b2 = 127;
		System.out.println("변환 전 b1(int) : " + b1 + ", b2(byte) : " + b2);
		b2 = (byte)b1;
//		b2 = b1;
		// 오류 발생! Type mismathch: cannot convert from int to byte
		// int 타입(큰) 데이터를 byte타입(작은) 변수에 저장하려 할 경우
		System.out.println("변환 후 b1(int) : " + b1 + ", b2(byte) : " + b2);
		// 큰 타입 데이터가 저장될때 오버플로우가 발생할 우려가 있으므로
		// 자동으로 변한되지 않는다!
		// 변환에 성공 하더라도 오버플로우(overflow) 에 의해
		// 원본 데이터가 아닌 다른 데이터로 변형될 수 있다!
		
		System.out.println("======================");		
				
		// 강제 형변환 후에도 오버플로우가 발생하지 않는 경우
		// => 작은 데이터타입에 저장 가능한 데이터 범위인 경우 오버플로우 발생 X
		int c1 = 10;
		byte c2 = 0;
		
		System.out.println("변환 전 c1(int) : " + c1 + ", c2(byte) : " + c2);
		c2 = (byte)c1;
		System.out.println("변환 후 c1(int) : " + c1 + ", c2(byte) : " + c2);
		
		
		
	}

}












