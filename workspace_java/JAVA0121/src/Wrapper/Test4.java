package Wrapper;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * char타입 배열 chArr 에 'A', 'a', '5', ' ', '#' 문자 5개를 저장
		 * 각각의 문자를 반복문을 통해 반복하면서
		 * 대문자, 소문자, 숫자, 공백문자, 기타문자로 판별
		 * 
		 * */
		char[] chArr = {'A', 'a', '5', ' ', '#'};
		for(int i = 0; i < chArr.length; i++) {
			char ch = chArr[i];
			if(Character.isUpperCase(ch)) {
				System.out.println(ch + " : 대문자!");
			} else if(Character.isLowerCase(ch)) {
				System.out.println(ch + " : 소문자!");
			} else if(Character.isDigit(ch)) {
				System.out.println(ch + " : 숫자!");
			} else if(Character.isWhitespace(ch)) {
				System.out.println(ch + " : 공백문자!");
			} else {
				System.out.println(ch + " : 기타문자!");
			}
		}
		System.out.println("=========================");
		// 향상된 for문으로 표현
		for(Character ch : chArr) {
			if(Character.isUpperCase(ch)) {
				System.out.println(ch + " : 대문자!");
			} else if(Character.isLowerCase(ch)) {
				System.out.println(ch + " : 소문자!");
			} else if(Character.isDigit(ch)) {
				System.out.println(ch + " : 숫자!");
			} else if(Character.isWhitespace(ch)) {
				System.out.println(ch + " : 공백문자!");
			} else {
				System.out.println(ch + " : 기타문자!");
			}
		}
		
		
		
		
		
		
		
		
	}

}
