package if_statement;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// 1. 정수형 변수 num1에 대한 양수, 음수, 0을 판별
		// 2. 정수형 변수 num2에 대한 홀수, 짝수, 0을 판별
		// 3. 문자 ch가 대문자 -> 소문자, 소문자 -> 대문자 아니면 "ch는 영문자가 아닙니다!" 출력
		
		// 1.
		int num1 = 0;
		if(num1 > 0) {
			System.out.println("num은 양수!");
		} else if(num1 == 0) {
			System.out.println("num은 음수!");
		} else {
			System.out.println("num은 0!");
		}
		
//		String result = num1 > 0 ? "양수" : 
//					    num1 < 0 ? "음수" : "0";
//		System.out.println(result);
		
		// 2. 정수형 변수 num2에 대한 홀수, 짝수, 0을 판별
		System.out.println("================");
		int num2 = 4;
		if(num2 == 0) {
			System.out.println("0");
		} else if(num2 % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		// 3. 문자 ch가 대문자 -> 소문자, 소문자 -> 대문자 아니면 "ch는 영문자가 아닙니다!" 출력
		char ch = 'A';
		String result = "";
		if('A' <= ch && ch <= 'Z') {
			ch += 32;
			result = "ch = " + ch;
			
		} else if('a' <= ch && ch <= 'z') {
			ch -= 32;
			result = "ch = " + ch;
			
		} else {
			result = "ch는 영문자가 아닙니다!";
		}
		
		System.out.println(result);
		
		
		/*
		 * 학생 점수(score)에 대한 학점 (grade) 판별
		 * A학점: 90 ~ 100점
		 * B학점: 80 ~ 89점
		 * C학점: 70 ~ 79점
		 * D학점: 60 ~ 69점
		 * F학점: 0 ~ 59점
		 * 
		 * "X학점" 라고 출력
		 * 
		 * */
		
		System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
//		int score = 55;
		String grade = "";
		boolean b = 90 <= score && score <= 100;
		if(b)								grade = "A학점";
		else if(80 <= score)				grade = "B학점";
		else if(70 <= score)				grade = "C학점";
		else if(60 <= score)				grade = "D학점";
		else 								grade = "F학점";
		
		System.out.println(grade);
		
		System.out.println("-----------------------");
		
		String a = sc.nextLine();
		System.out.println(a);
		
		
		
		
		
	}

}
