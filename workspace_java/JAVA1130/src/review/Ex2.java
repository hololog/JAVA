package review;

public class Ex2 {

	public static void main(String[] args) {
		
		/*			1byte	2byte	4byte	8byte
		 * -------------------------------------
		 * 정수형		byte	short	int		long
		 * 실수형	 					float	double
		 * 문자형				char										
		 * 논리형		boolean
		 * 
		 * */
		
//		byte b = 127;
//		short s = 128;
//		int i = 2147483647;
//		long l = 2147483648L;
//		
//		float f = 1.0F;
//		double d = 1.0;
		
		/*
		 * 형변환 (Type Casting)
		 * 
		 * 1. 자동형변환(=묵시적형변환)
		 *    작은데이터 타입 --> 큰 데이터타입
		 *    형변환 할 시에는 자연스럽게 변환이 가능하므로
		 *    자동형변환이 발생!
		 *    ex) byte b = 127;
		 *        int i = b;
		 * 
		 * 2. 강제형변환(=명시적형변환)
		 *    큰 데이터타입 --> 작은 데이터타입
		 *    형변환 할 시에는 overflow가 발생할수 있기때문에
		 *    컴파일러에게 형변환 할것을 명시해줘야한다!
		 * 	  ex) int i = 127;
		 * 		  byte b = (byte)i;
		 * 
		 * */
		
		int i = 128;
		byte b = (byte)i;
		System.out.println(b);
		
		
		
		
	}

}
