package review;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// if / switch~case
		
		// int 정수 2개가 있으면 아래와같이 출력
		
		// int n1=5, n2=7;
		// 홀수 + 홀수 = 짝수
		
		// int n1=2, n2=5;
		// 짝수 + 홀수 = 홀수
		
//		int n1=2, n2=7;
//		String result = "";
//		
//		result += (n1%2==0) ? "짝수 + " : "홀수 + ";
//		result += (n2%2==0) ? "짝수 = " : "홀수 = ";
//		result += (n1+n2)%2==0 ? "짝수" : "홀수";
		
//		if(n1%2 == 0) {
//			result += "짝수 + ";
//			if(n2%2==0)	result += "짝수 = 짝수";
//			else		result += "홀수 = 홀수";
//			
//		} else {
//			result += "홀수 + ";
//			if(n2%2==0) result += "짝수 = 홀수";
//			else		result += "홀수 = 짝수";
//			
//		}
//		System.out.println(result);
		
		// int month 월을 입력받아 해당 월의 일수를 보여주는 프로그램을 작성하시오 (switch~case)
		// - 1, 3, 5, 7, 8, 10, 12월 : 31일
		// - 4, 6, 9, 11월 : 30일
		// - 2월 : 28일
		// 출력: X월은 XX일 까지 입니다.
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day;
		switch (month) {
			case 2: day = 28;
				break;
			case 4:
			case 6:
			case 9:
			case 11: day = 30;
				break;
			default: day = 31;
		}
		
		System.out.println(month + "월은 " + day + "일 까지 입니다.");
		
		
		
		
		
		
		
	}

}
