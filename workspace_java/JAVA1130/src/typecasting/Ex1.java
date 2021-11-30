package typecasting;

public class Ex1 {

	public static void main(String[] args) {

		// byte, short, char 끼리 형변환
		/*
		byte b = 127;
		char c = (char)b;
		System.out.println(c);
		
		short s = 10000;
		c = (char)s;
		System.out.println(c);
		*/
		
		int a = 3;
		float b = 1.0F;
		double c = a + b;
		System.out.println(c);
		
//		float f = 100.0;	
		// 에러 발생! 이유는 접미사'F'를 붙여주거나 
		// (float)를 명시해서 형변환 해주어야한다.
		
		int i = (int)100.0F;
		
		
		
		
	}

}
