import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		/*
		 * 문자열이 공백없이 입력된다.
		 * 둘자열의 시작위치와 글자 개수가 입력된다.
		 * (시작위치 ~ 글자 개수 까지 출력하는 mySubstr 메서드를 작성)
		 * 
		 * 입력 예시)	abcdef
		 * 			2 3
		 * 출력 예시)	cde
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int start = sc.nextInt();
		int count = sc.nextInt();
		
		System.out.println(mySubstr(s, start, count));
		
	}
	
	public static String mySubstr(String s, int start, int count) {
		String result = "";
		for(int i = start; i < start + count; i++) {
			result += s.charAt(i);
		}
		return result;
	}
	
}
