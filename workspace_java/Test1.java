package if_statement;

public class Test1 {

	public static void main(String[] args) {
		// 중첩 if문 사용
		// 문자 ch 에 대해 영문자 판별(영문자= 대문자 또는 소문자)
		// 대문자 -> 소문자, 소문자 -> 대문자 변환 후 출력
		// 단, ch가 영문자가 아닐 경우 "입력 오류!" 라고 출력
		
		char ch = 'a';
		boolean big = 'A' <= ch && ch <= 'Z';
		boolean small = 'a' <= ch && ch <= 'z';
		
		if( big || small ) {
			
			if(big) ch += 32;
			else 	ch -= 32;
			
			System.out.println("변환결과: " + ch);
			
		} else {
			System.out.println("입력 오류!");
		}
		
		
		
		
		
		
	}

}
