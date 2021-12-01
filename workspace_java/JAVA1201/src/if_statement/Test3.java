package if_statement;

public class Test3 {

	public static void main(String[] args) {

		/*
		 * 정수형 변수 num에 대한 양수, 음수 판별 (0은 양수로 간주)
		 * 양수라면 "X : 양수!" 라고 출력
		 * 음수라면 "X : 음수!" 라고 출력
		 * 
		 * */
		int num = 10;
		if(num >= 0) {
			System.out.println(num + " : 양수!");
		} else {
			System.out.println(num + " : 음수!");
		}
		
		String result = (num >= 0) ? " : 양수!" : " : 음수!";
		System.out.println(num + result);
		
		System.out.println("====================");
		
		/*
		 * 문자 ch 가 대문자 -> 소문자로 변환
		 *          소문자 -> 대문자로 변환
		 * "ch = X" 라고 출력
		 * 
		 * */
		char ch = 'F';
//		if('A' <= ch && ch <= 'Z') {
//			ch += 32;
//		} else {
//			ch -= 32;
//		}
		
		ch = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : (char)(ch-32);
		
		System.out.println("ch = " + ch);
		
		
		
		
		
		
		
	}

}
